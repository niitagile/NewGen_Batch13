package oopsconcepts;

import java.util.Scanner;


public class EmployeeManagement {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter Gender");
		char gender=sc.next().charAt(0);
		System.out.println("Enter Year of Experience");
		int yearsofexperience= sc.nextInt();
		Employee obj=new Employee(name,gender, yearsofexperience);
		System.out.println("Your increased salary is::"+obj.promoteEmp());
		obj.applyForLWP();
		

	}

}
