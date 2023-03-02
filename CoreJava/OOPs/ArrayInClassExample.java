package oopsconcepts;

import java.util.Scanner;

class Result{
	private int rollno;
	private int marks[]=new int[3];
	private int total;
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
				int sum=0;
				for(int val :marks) {
				System.out.println(val+ " ");
				sum+=val;
				}
				System.out.println("Sum="+total);
		}
		
	
}
public class ArrayInClassExample {
public static void main(String[] args) {
	
}
}
