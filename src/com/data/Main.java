package com.data;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

	List<FitnessMember> fitnessMembers = new ArrayList<>();

	fitnessMembers.add( new FitnessMember ( "Morten", "130395-1301", "Full", 299 ));
	fitnessMembers.add( new FitnessMember ("Martin","221175-1011","Basic", 199));
	fitnessMembers.add( new FitnessMember( "Martina", "050970-1409", "Full", 299));
	fitnessMembers.add( new FitnessMember( "Marcel", "221175-2401", "Basic", 199 ));

	List<FitnessEmployee> fitnessEmployees = new ArrayList<>();
	fitnessEmployees.add(new FitnessEmployee( "Claus", "311270-1231", 37, 23000, 5 ));
	fitnessEmployees.add(new FitnessEmployee( "Tove", "240873-3456", 20, 9120, 0));
	fitnessEmployees.add(new FitnessEmployee( "Anna", "241275-1234", 37, 23000, 5 ));
	fitnessEmployees.add(new FitnessEmployee( "Henning", "101276-1001", 15, 6840, 0 ));
		System.out.println("Fitness Members");
		System.out.printf("%-15s","Navn");
		System.out.printf("%-15s","CPR");
		System.out.printf("%-15s","Medlemskab");
		System.out.printf("%-15s\n","Pris");
		System.out.printf("%-15s\n","*****************************************************************");
		for (int i = 0; i < fitnessMembers.size(); i++){
			System.out.printf("%-15s",fitnessMembers.get(i).getName());
			System.out.printf("%-15s",fitnessMembers.get(i).getCpr());
			System.out.printf("%-15s",fitnessMembers.get(i).getTypesOfMembership());
			System.out.printf("%-15s\n",fitnessMembers.get(i).getMembershipCost());
		}

		System.out.println();
		System.out.println("Fitness Members");
		System.out.printf("%-15s","Navn");
		System.out.printf("%-15s","CPR");
		System.out.printf("%-15s","Tid");
		System.out.printf("%-15s","Løn");
		System.out.printf("%-15s\n","Ferie");
		System.out.printf("%-10s\n","*****************************************************************");
		for (int i = 0; i < fitnessEmployees.size(); i++){
			System.out.printf("%-15s", fitnessEmployees.get( i ).getName());
			System.out.printf("%-15s", fitnessEmployees.get( i ).getCpr());
			System.out.printf("%-15s", fitnessEmployees.get( i ).getEmployeeTime());
			System.out.printf("%-15s", fitnessEmployees.get( i ).getEmployeeSalary());
			System.out.printf("%-15s\n", fitnessEmployees.get( i ).getEmployeeVacation());
		}
		System.out.println();
		System.out.println("Fitness Members + Employees");
		System.out.printf("%-15s","Navn");
		System.out.printf("%-15s\n","CPR");
		System.out.printf("%-15s\n","*****************************************************************");;
		for (int i = 0; i < fitnessEmployees.size(); i++){
			System.out.printf("%-15s",fitnessEmployees.get( i ).getName());
			System.out.printf("%-15s\n",fitnessEmployees.get( i ).getCpr());
		}
		for (int i = 0; i < fitnessMembers.size(); i++){
			System.out.printf("%-15s",fitnessMembers.get(i).getName());
			System.out.printf("%-15s\n",fitnessMembers.get(i).getCpr());
		}


    }
}
