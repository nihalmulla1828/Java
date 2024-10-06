package com.sportsClub.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.sportsClub.beans.ContractEmp;
import com.sportsClub.beans.Employee;
import com.sportsClub.beans.Members;
import com.sportsClub.beans.Person;
import com.sportsClub.beans.SalariedEmp;
import com.sportsClub.beans.VendorsEmp;

public class PersonService {

	private static Person[] pArr;
	private static int count;

	static {
		pArr = new Person[100];
		pArr[0] = new SalariedEmp(101, "Nikhil", "999999999", "nikhil@email.com", "IT", "Front End Dev",
				LocalDate.of(2024, 06, 10), 10000000);
		pArr[1] = new SalariedEmp(102, "NihAL", "8888888889", "nihal@email.com", "CS", "Full Stack Dev",
				LocalDate.of(2021, 06, 12), 200000000);
		pArr[2] = new ContractEmp(103, "Chiranjiv", "8888888888", "chiranjiv@email.com", "CS", "Full Stack Dev",
				LocalDate.of(2021, 06, 12), 8, 6000);
		pArr[3] = new ContractEmp(104, "Jay", "8888888888", "jay@email.com", "CS", "Front End Dev",
				LocalDate.of(2022, 06, 19), 8, 8000);
		pArr[4] = new VendorsEmp(105, "Nikhil", "999999999", "nikhil@email.com", "IT", "Front End Dev",
				LocalDate.of(2024, 06, 10), 10, 20000);
		pArr[5] = new VendorsEmp(106, "Nihal", "999999999", "nihal@email.com", "IT", "Front End Dev",
				LocalDate.of(2024, 06, 10), 10, 20000);
		pArr[6] = new Members(107, "MrBean", "85546678", "mrbean@gmail.com", "gold", 20001);
		pArr[7] = new Members(108, "MrBeans", "855466789", "mrbeans@gmail.com", "Premium", 20011);
		count = 8;
	}

	public static void acceptChoice(int choice) {
		switch (choice) {
		case 1:
			int addChoice = empAddChoice();
			addNewEmp(addChoice);
			break;
		case 2:
			addNewMember();
			break;
		case 3:
			displayAllMembers();
			break;
		case 4:
			displayAllEmployees();
			break;
		case 5:
			updateDetailsOfEmp();
			break;
		case 6:
			updateDetailsOfMembers();
			break;
		case 7:
			deleteEmp();
			break;
		case 8:
			deleteMember();
			break;
		case 9:
			System.out.println("Thank you for Visiting....");
			break;
		default:
			System.out.println("You Entered Wrong Choice");
		}
	}

	private static void deleteEmp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID of Employee of Sports Club which you want to delete");
		int id = sc.nextInt();
		for (int i = 0; i < pArr.length; i++) {
			if (pArr[i] != null) {
				if (pArr[i].getpId() == id) {
					if (pArr[i] instanceof SalariedEmp || pArr[i] instanceof ContractEmp
							|| pArr[i] instanceof VendorsEmp) {
						for (int j = i; j < pArr.length; j++) {
							if (j + 1 == pArr.length) {
								break;
							} else if (i == pArr.length - 1) {
								pArr[i] = null;
							} else {
								pArr[j] = pArr[j + 1];

							}
						}
					} else {
						System.out.println("It is not an Employee of Sports Club....");
						break;
					}
				}
			} else {
				break;
			}
		}
	}

	private static void deleteMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID of Member of Sports Club which you want to delete");
		int id = sc.nextInt();
		for (int i = 0; i < pArr.length; i++) {
			if (pArr[i] != null) {
				if (pArr[i].getpId() == id) {
					if (pArr[i] instanceof Members) {
						for (int j = i; j < pArr.length; j++) {
							if (j + 1 == pArr.length) {
								break;
							} else if (i == pArr.length - 1) {
								pArr[i] = null;
							} else {
								pArr[j] = pArr[j + 1];
							}
						}
					} else {
						System.out.println("It is not Member of Sports Club....");
						break;
					}
				}
			} else {
				break;
			}
		}
	}

	private static void updateDetailsOfMembers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id for whose Member details is to be updated::");
		int id = sc.nextInt();

		for (Person p : pArr) {
			int c = 0;
			if (p != null) {
				if (p.getpId() == id) {
					if (p instanceof Members) {
						System.out.println("What you want to Modify?");
						System.out.println("For Members:: ");
						System.out.println("1.Name\n2.Mobile\n3.Email\n4.Type Of Membership\n5.Amount Paid");
						c = sc.nextInt();
						switch (c) {
						case 1:
							sc.nextLine();
							System.out.println("Enter Name: ");
							String name = sc.nextLine();
							p.setpName(name);
							break;
						case 2:
							sc.nextLine();
							System.out.println("Enter Mobile: ");
							String mobile = sc.nextLine();
							p.setMobile(mobile);
							break;
						case 3:
							sc.nextLine();
							System.out.println("Enter Email: ");
							String email = sc.nextLine();
							p.setEmail(email);
							break;
						case 4:
							sc.nextLine();
							System.out.println("Enter Type Of Membership: ");
							String typeOfMembership = sc.nextLine();
							((Members) p).setTypeOfMembership(typeOfMembership);
							break;
						case 5:
							sc.nextLine();
							System.out.println("Enter Amount Paid: ");
							int amtPaid = sc.nextInt();
							((Members) p).setAmountPaid(amtPaid);
							break;
						default:
							System.out.println("You Entered Wrong Choice");
						}
					}
				}
			}
		}
	}

	private static void updateDetailsOfEmp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id for whose Employee details is to be updated::");
		int id = sc.nextInt();

		for (Person p : pArr) {
			int c = 0;
			if (p != null) {
				if (p.getpId() == id) {
					if (p instanceof SalariedEmp) {
						String ans;

						System.out.println("What you want to Modify?");
						System.out.println("For Salaried Employee:: ");
						System.out.println(
								"1.Name\n2.Mobile\n3.Email\n4.Department\n5.Designation\n6.DOJ\n7.Basic Salary");
						c = sc.nextInt();

						switch (c) {
						case 1:
							sc.nextLine();
							System.out.println("Enter Name: ");
							String name = sc.nextLine();
							p.setpName(name);
							break;
						case 2:
							sc.nextLine();
							System.out.println("Enter Mobile: ");
							String mobile = sc.nextLine();
							p.setMobile(mobile);
							break;
						case 3:
							sc.nextLine();
							System.out.println("Enter Email: ");
							String email = sc.nextLine();
							p.setEmail(email);
							break;
						case 4:
							sc.nextLine();
							System.out.println("Enter Department: ");
							String department = sc.nextLine();
							((SalariedEmp) p).setEmpDept(department);
							break;
						case 5:
							sc.nextLine();
							System.out.println("Enter Designation: ");
							String designation = sc.nextLine();
							((SalariedEmp) p).setEmpDesignation(designation);
							break;
						case 6:
							sc.nextLine();
							System.out.println("Enter DOJ: (dd/MM/yyyy)");
							String doj = sc.nextLine();
							LocalDate ldt = LocalDate.parse(doj, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
							((SalariedEmp) p).setDateOfJoining(ldt);
							break;
						case 7:
							System.out.println("Enter Basic Salary: ");
							int bSalary = sc.nextInt();
							((SalariedEmp) p).setSalary(bSalary);
							break;
						default:
							System.out.println("You Entered Wrong Choice");
						}
					} else if (p instanceof ContractEmp) {
						System.out.println("What you want to Modify?");
						System.out.println("For Contract Employee:: ");
						System.out.println(
								"1.Name\n2.Mobile\n3.Email\n4.Department\n5.Designation\n6.DOJ\n7.No.of Hrs Worked\n8.Per Hr Rate");
						c = sc.nextInt();
						switch (c) {
						case 1:
							sc.nextLine();
							System.out.println("Enter Name: ");
							String name = sc.nextLine();
							p.setpName(name);
							break;
						case 2:
							sc.nextLine();
							System.out.println("Enter Mobile: ");
							String mobile = sc.nextLine();
							p.setMobile(mobile);
							break;
						case 3:
							sc.nextLine();
							System.out.println("Enter Email: ");
							String email = sc.nextLine();
							p.setEmail(email);
							break;
						case 4:
							sc.nextLine();
							System.out.println("Enter Department: ");
							String department = sc.nextLine();
							((ContractEmp) p).setEmpDept(department);
							break;
						case 5:
							sc.nextLine();
							System.out.println("Enter Designation: ");
							String designation = sc.nextLine();
							((ContractEmp) p).setEmpDesignation(designation);
							break;
						case 6:
							sc.nextLine();
							System.out.println("Enter DOJ: (dd/MM/yyyy)");
							String doj = sc.nextLine();
							LocalDate ldt = LocalDate.parse(doj, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
							((ContractEmp) p).setDateOfJoining(ldt);
							break;
						case 7:
							System.out.println("Enter No.of Hrs.: ");
							int noOfHrs = sc.nextInt();
							((ContractEmp) p).setNoHrsWorked(noOfHrs);
							break;
						case 8:
							System.out.println("Enter Per Hour Rate:: ");
							int perHrRate = sc.nextInt();
							((ContractEmp) p).setPerHrRate(perHrRate);
							break;
						default:
							System.out.println("You Entered Wrong Choice");
						}

					} else if (p instanceof VendorsEmp) {
						System.out.println("What you want to Modify?");
						System.out.println("For Contract Employee:: ");
						System.out.println(
								"1.Name\n2.Mobile\n3.Email\n4.Department\n5.Designation\n6.DOJ\n7.No.of Employees\n8.Amount");
						c = sc.nextInt();
						switch (c) {
						case 1:
							sc.nextLine();
							System.out.println("Enter Name: ");
							String name = sc.nextLine();
							p.setpName(name);
							break;
						case 2:
							sc.nextLine();
							System.out.println("Enter Mobile: ");
							String mobile = sc.nextLine();
							p.setMobile(mobile);
							break;
						case 3:
							sc.nextLine();
							System.out.println("Enter Email: ");
							String email = sc.nextLine();
							p.setEmail(email);
							break;
						case 4:
							sc.nextLine();
							System.out.println("Enter Department: ");
							String department = sc.nextLine();
							((VendorsEmp) p).setEmpDept(department);
							break;
						case 5:
							sc.nextLine();
							System.out.println("Enter Designation: ");
							String designation = sc.nextLine();
							((VendorsEmp) p).setEmpDesignation(designation);
							break;
						case 6:
							sc.nextLine();
							System.out.println("Enter DOJ: (dd/MM/yyyy)");
							String doj = sc.nextLine();
							LocalDate ldt = LocalDate.parse(doj, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
							((VendorsEmp) p).setDateOfJoining(ldt);
							break;
						case 7:
							System.out.println("Enter Number of Employees: ");
							int noOfEmps = sc.nextInt();
							((VendorsEmp) p).setNoOfEmps(noOfEmps);
							break;
						case 8:
							System.out.println("Enter Amount: ");
							int amt = sc.nextInt();
							((VendorsEmp) p).setAmount(amt);
							break;
						default:
							System.out.println("You Entered Wrong Choice");
						}
					} else {
						System.out.println("Employee with given id not found");
					}
				}
			}
		}
	}

	private static void displayAllMembers() {
		for (Person p1 : pArr) {
			if (p1 != null) {
				if (p1 instanceof Members) {
					System.out.println(p1);
				}
			} else
				break;
		}

	}

	private static void addNewMember() {

		Scanner sc = new Scanner(System.in);
		Person p = addPersonData();
		System.out.println("Enter Type of membership:");
		String typeOfMemShip = sc.nextLine();
		System.out.println("enter Amount Paid");
		int amtPaid = sc.nextInt();
		pArr[count] = new Members(p.getpId(), p.getpName(), p.getMobile(), p.getEmail(), typeOfMemShip, amtPaid);
		count++;
	}

	private static void displayAllEmployees() {

		for (Person p : pArr) {
			if (p != null) {
				if (p instanceof SalariedEmp || p instanceof VendorsEmp || p instanceof ContractEmp) {
					System.out.println(p);
				}

			} else
				break;
		}
	}

	private static void addNewEmp(int addChoice) {
		Scanner sc = new Scanner(System.in);
		Person p1 = addPersonData();
		Employee e1 = addEmployeeData();
		if (addChoice == 1) {
			System.out.println("Enter Basic Salary: ");
			int salSalary = sc.nextInt();
			pArr[count] = new SalariedEmp(p1.getpId(), p1.getpName(), p1.getMobile(), p1.getEmail(), e1.getEmpDept(),
					e1.getEmpDesignation(), e1.getDateOfJoining(), salSalary);
			count++;
		} else if (addChoice == 2) {
			System.out.println("Enter No. of Hours Worked: ");
			int contHrs = sc.nextInt();
			System.out.println("Enter Per Hour Rate");
			int conHrRate = sc.nextInt();
			pArr[count] = new ContractEmp(p1.getpId(), p1.getpName(), p1.getMobile(), p1.getEmail(), e1.getEmpDept(),
					e1.getEmpDesignation(), e1.getDateOfJoining(), contHrs, conHrRate);
			count++;
		} else if (addChoice == 3) {
			System.out.println("Enter Number of Employees: ");
			int empNum = sc.nextInt();
			System.out.println("Enter Amount: ");
			int vendorAmt = sc.nextInt();
			pArr[count] = new VendorsEmp(p1.getpId(), p1.getpName(), p1.getMobile(), p1.getEmail(), e1.getEmpDept(),
					e1.getEmpDesignation(), e1.getDateOfJoining(), empNum, vendorAmt);
			count++;
		}
	}

	private static Employee addEmployeeData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Department: ");
		String department = scanner.nextLine();
		System.out.println("Enter Designation: ");
		String designation = scanner.nextLine();
		System.out.println("Enter Date of Joining: (dd/MM/yyyy)");
		String doj = scanner.nextLine();
		LocalDate ldt = LocalDate.parse(doj, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		Employee e = new Employee(department, designation, ldt);
		return e;
	}

	private static Person addPersonData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter ID: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Name: ");
		String name = scanner.nextLine();
		System.out.println("Enter Mobile Number: ");
		String mobile = scanner.nextLine();
		System.out.println("Enter Email ID: ");
		String email = scanner.nextLine();

		Person p = new Person(id, name, mobile, email);
		return p;
	}

	private static int empAddChoice() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Salaried Employee\n2.Contract Employee\n3.Vendors Employee");
		int choice = scanner.nextInt();
		return choice;
	}

}
