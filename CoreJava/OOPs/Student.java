package oopsconcepts;

import java.util.Scanner;

public class Student {
	//instance variables- which copies in object
	private int rollno;
	private String name,city;
	private long phoneno;
	private int total;
	
	/*Constructor-special methods which are having same name as class 
	and use to initalize the object .If we are not creating constructor
	then jvm is creating constructor for us
	
	*/
	
	Student(){
		rollno=0;
		name=null;
		city=null;
		phoneno=0;
		total=0;
	}
	void getData(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollno::");
		rollno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name::");
		name=sc.nextLine();
		System.out.println("Enter phoneno::");
		phoneno=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter city::");
		city=sc.nextLine();
		System.out.println("Enter total");
		total=sc.nextInt();
	}
	
	void display(){
		System.out.println("Rollno="+rollno);
		System.out.println("Name="+name);
		System.out.println("phone no="+phoneno);
		System.out.println("city="+city);
		System.out.println("Grade="+getGrade());
		
	}
	//private- call inside the class only
	private String getGrade(){
		String grade="";
		if(total>=80)
			grade="A";
		else if(total>=60)
			grade="B";
		else if(total>=40)
			grade="C";
		else
			grade="Fail";
	
	
	return grade;
	}
	
}
