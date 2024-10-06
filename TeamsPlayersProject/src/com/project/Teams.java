package com.project;

import java.util.Arrays;

public class Teams {
	
	private String teamId;
	private String teamName;
	private String coachName;
	private Players captainName;
	private Players[] playersList;
	
	
	
	public String getTeamId() {
		return teamId;
	}
	

	public Teams(String teamId2, String teamName2, String coachName2, Players captain, Players[] pArr) {
		super();
		this.teamId = teamId2;
		this.teamName = teamName2;
		this.coachName = coachName2;
		this.captainName = captain;
		this.playersList = pArr;
	}



	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCoachName() {
		return coachName;
	}
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	public Players getCaptainName() {
		return captainName;
	}
	public void setCaptainName(Players captainName) {
		this.captainName = captainName;
	}
	public Players[] getPlayersList() {
		return playersList;
	}
	public void setPlayersList(Players[] playersList) {
		this.playersList = playersList;
	}
	
	@Override
	public String toString() {
		return "Team ID :: " + teamId + ",\n Team Name :: " + teamName + ",\n Coach Name :: " + coachName + ",\n"
				+ "Captain ID :: "+captainName.getPlayerId() +"\nCaptain Name :: "+captainName.getPlayerName()+ 
				"\nCaptain Speciality :: "+ captainName.getPlayerSpeciality() + ",\nPlayers :: " ;
	}
//	"\n"+Arrays.toString(playersList)

}
