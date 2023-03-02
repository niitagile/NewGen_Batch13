package oopsconcepts;

import java.util.Scanner;

class Result{
	private int rollno;
	private int marks[]=new int[3];
	private int total;
	final String course="Btech";//can't change value of final
	void getData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollno");
		rollno=sc.nextInt();
		System.out.println("Enter marks");
		for(int i=0;i<marks.length;i++) {
			marks[i]=sc.nextInt();
		}
		
	}
		void display() {
				System.out.println("rollno="+rollno);
				System.out.println("course="+course);
				for(int val :marks) {
				System.out.println(val+ " ");
				total+=val;
				}
				System.out.println("Sum="+total);
				
		}
		
	
}
public class ArrayInClassExample {
public static void main(String[] args) {
	Result obj=new Result();
	obj.getData();
	obj.display();
}
}
