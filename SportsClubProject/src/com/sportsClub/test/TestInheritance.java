package com.sportsClub.test;

import java.util.Scanner;

import com.sportsClub.service.PersonService;

public class TestInheritance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1.Add New Employee\n2.Add New Members\n3.Display All Members"
					+ "\n4.Display All Employees\n5.Update Details of Employee using EmpID"
					+ "\n6.Update Details of Member using Member ID"
					+ "\n7.Delete Employee By EmpID\n8.Delete Member By Member ID\n9.Exit"
					+ "Choice::  ");
			choice = sc.nextInt();
			PersonService.acceptChoice(choice);
		}while(choice != 9);
	}

}
