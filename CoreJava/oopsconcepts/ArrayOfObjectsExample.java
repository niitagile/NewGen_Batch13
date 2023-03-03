package oopsconcepts;

import java.util.Scanner;
//class is user defined data type
class Person{
	private int pid;
	private String name;
	void getData(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id::");
		pid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name::");
		name=sc.nextLine();
	}
	void display(){
		System.out.println("Id="+pid);
		System.out.println("Name="+name);
}
}
public class ArrayOfObjectsExample {

	public static void main(String[] args) {
		
//		Person p1=new Person();
//		Person p2=new Person();
//		Person p3=new Person();
		//Array of Objects
		Person arr[]=new Person[3];
		for(int i=0;i<arr.length;i++) {
			arr[i]=new Person();
			arr[i].getData();
				
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i].display();
		}
		
		
	}

}
