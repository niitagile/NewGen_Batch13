package oopsconcepts;

import java.util.Scanner;

public class Student {
	//instance variables- which copies in object
	int rollno;
	String name,city;
	long phoneno;
	
	void getData(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollno::");
		rollno=sc.nextInt();
		System.out.println("Enter name::");
		name=sc.next();
		System.out.println("Enter phoneno::");
		phoneno=sc.nextLong();
		System.out.println("Enter city::");
		city=sc.next();
	}
	
	void display(){
		System.out.println("Rollno="+rollno);
		System.out.println("Name="+name);
		System.out.println("phone no="+phoneno);
		System.out.println("city="+city);
		
	}
	
}
