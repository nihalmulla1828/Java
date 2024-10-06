package com.project;

import java.util.Scanner;

public class TeamsService {
	private static Teams[] tArr = new Teams[10];
	private static int count;
	private static int teamCount;
	private static String teamId;
	private static int playerCount;

	static {
		Players[] pArr = new Players[15];
		Players captain1 = new Players("CSK7", "MSD", "WicketKeeper");
		pArr[0] = new Players(captain1.getPlayerId(), captain1.getPlayerName(), captain1.getPlayerSpeciality());
		pArr[1] = new Players("CSK2", "Ruturaj", "Batsman");
		tArr[0] = new Teams("T101", "CSK", "Fleming", captain1, pArr);

		Players[] pArr1 = new Players[15];
		Players captain2 = new Players("MI45", "Rohit Sharma", "Batsman");
		pArr1[0] = new Players(captain2.getPlayerId(), captain2.getPlayerName(), captain2.getPlayerSpeciality());
		pArr1[1] = new Players("MI25", "Bumrah", "Bowler");
		tArr[1] = new Teams("T102", "MI", "Malinga", captain2, pArr1);
		count = 2;
		teamCount = 103;
		teamId = "T" + teamCount;
		playerCount = 1;

	}

	public static void acceptChoice(int choice) {
		switch (choice) {
		case 1:
			addNewTeam();
			break;
		case 2:
			displayAll();
			break;
		case 3:
			findTeamByTeamId();
			break;
		case 4:
			findTeamByPlayerId();
			break;
		case 5:
			addNewPlayerInTeam();
			break;
		case 6:
			deleteTeam();
			break;
		case 7:
			deletePlayer();
			break;
		case 8:
			System.out.println("Thank you For Visiting....");
			break;
		default:
			System.out.println("You Entered Wrong Choice");
		}
	}

	private static void deletePlayer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Team ID to which Player to be added ::");
		String tId = sc.nextLine();
		Teams t = searchTeamById(tId);
		int cnt = 0;
		if (t != null) {
			Players[] plArr = t.getPlayersList();
			System.out.println("Enter Player ID to be deleted :: ");
			int pId = sc.nextInt();
			for (Players p : plArr) {
				if (p != null) {
					if (p.getPlayerId().equals(tId)) {
						for (int j = cnt; j < plArr.length; j++) {
							if (j + 1 == plArr.length) {
								break;
							} else if (cnt == plArr.length - 1) {
								plArr[j] = null;
							} else {

								plArr[j] = plArr[j + 1];

							}

						}
					}
				}

				else {
					break;
				}

				cnt++;
			}
		}
	}

	private static void deleteTeam() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Team ID:: ");
		String tId = sc.nextLine();
		for (int i = 0; i < tArr.length; i++) {
			if (tArr[i] != null) {
				if (tArr[i].getTeamId().equals(tId)) {
					for (int j = i; j < tArr.length; j++) {
						if (j + 1 == tArr.length) {
							break;
						} else if (i == tArr.length - 1) {
							tArr[i] = null;
						} else {
							tArr[j] = tArr[j + 1];
						}
					}
				}
			} else {
				break;
			}
		}
	}

	private static void addNewPlayerInTeam() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Team ID to which Player to be added ::");
		String tId = sc.nextLine();
		Teams t = searchTeamById(tId);
		int cnt = 0;
		if (t != null) {
			Players[] plArr = t.getPlayersList();
			for (Players p : plArr) {
				if (p == null) {

					String pId = generatePlayerId(tId);
					System.out.println("Enter Name of Player:: ");
					sc.nextLine();
					String pName = sc.nextLine();
					System.out.println("Enter Player Speciality:: ");
					String pSpeciality = sc.nextLine();

					plArr[cnt] = new Players(pId, pName, pSpeciality);
					break;
				}

				cnt++;
			}
		}
	}

	private static void findTeamByPlayerId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Player ID:: ");
		String pId = sc.nextLine();
		for (Teams t : tArr) {
			if (t != null) {
				Players[] playersArr = t.getPlayersList();
				for (Players p : playersArr) {
					if (p != null) {
						if (p.getPlayerId().equals(pId)) {
							System.out.println(t);
						}
					} else
						break;
				}
			} else
				break;
		}
	}

	private static void findTeamByTeamId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Team ID:: ");
		String tId = sc.nextLine();
		searchTeamById(tId);
	}

	private static Teams searchTeamById(String tId) {
		for (Teams t : tArr) {
			if (t != null) {
				if (t.getTeamId().equals(tId)) {
					System.out.println(t);
					return t;
				}
			} else {
				System.out.println("There are No Teams");
				break;
			}
		}
		return null;
	}

	private static void addNewTeam() {
		Scanner scanner = new Scanner(System.in);
		String tId = generateTeamId();
		teamCount++;
		System.out.println("Enter Team Name::");
		String tName = scanner.nextLine();
		System.out.println("Enter Coach Name::");
		String tCoachName = scanner.nextLine();
		System.out.println("Enter Captain ID:: (In TeamNamePlayerID Format)");
		String cId = scanner.nextLine();
		System.out.println("Enter Captain Name:: ");
		String cName = scanner.nextLine();
		System.out.println("Enter Captain Speciality:: ");
		String cSpeciality = scanner.nextLine();
		Players[] pArr2 = new Players[15];
		pArr2[0] = new Players(cId, cName, cSpeciality);
		int cnt = 1;
		String resp = "y";
		tArr[count] = new Teams(tId, tName, tCoachName, pArr2[0], pArr2);
		count++;
		do {
			String pid = generatePlayerId(tId);
			System.out.println("Enter Player Name:: ");
			String pName = scanner.nextLine();
			System.out.println("Enter Player Spciality:: ");
			String pSpeciality = scanner.nextLine();

			pArr2[cnt] = new Players(pid, pName, pSpeciality);
			cnt++;

			System.out.println("Do you want to add more players?");
			resp = scanner.nextLine();
		} while (resp.equals("y"));

	}

	private static void displayAll() {

		for (Teams t : tArr) {
			if (t != null) {
				System.out.println(t);
				Players[] p = t.getPlayersList();
				for(Players p1 : p) {
					if(p1 != null) {
						System.out.println(p1);
					}
				}
				System.out.println(".................................................................................................................................");
				
			}
		}

	}

	private static String generateTeamId() {
		return teamId;
	}

	private static String generatePlayerId(String tID) {
		for (Teams t : tArr) {
			if (t != null) {
				if (t.getTeamId().equals(tID)) {
					String playerId = t.getTeamName() + playerCount;
					return playerId;
				}
			} else
				break;
		}
		return "XXX";
	}

}
