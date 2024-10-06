package com.project;

import java.util.Scanner;

public class TestTeam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1.Add New Team\n2.Display All Teams\n3.Find Team By TeamId");
			System.out.println("4.Find Team By PlayerId\n5.Add New Player in Team");
			System.out.println("6.Delete Team\n7.Delete Player From Team\n8.Exit");
			System.out.println("Choice:: ");
			choice = sc.nextInt();
			TeamsService.acceptChoice(choice);
		}while(choice != 8);
	}

}
