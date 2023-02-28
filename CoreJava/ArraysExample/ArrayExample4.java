package ArraysExample;

import java.util.Scanner;

public class ArrayExample4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements do you want to enter");
		int size=sc.nextInt();
		//Take values from user
		int arr[]=new int[size];
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print("Enter value ::"+ i);
			arr[i]=sc.nextInt();
		}
		//default values
		int sum=0;
		for(int val : arr) {
			System.out.print(val+" ");
			sum=sum+val;
		}
		
		System.out.println("\nTotal="+sum);
	}

}
