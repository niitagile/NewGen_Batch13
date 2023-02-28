package ArraysExample;

import java.util.Scanner;

public class ArrayExample6 {

	public static void main(String[] args) {
		int arr[][]=new int[3][2];
		Scanner sc=new Scanner(System.in);


		for(int r=0;r<arr.length;r++) {

			for(int ele=0;ele<arr[r].length;ele++) {
				System.out.print("Enter value:"+ r+" "+ele);
				arr[r][ele]=sc.nextInt();
				System.out.println();
			}
		}
		//print all elements
		for(int r=0;r<arr.length;r++) {

			for(int ele=0;ele<arr[r].length;ele++) {
				System.out.print(arr[r][ele]+" ");
				
			}
			System.out.println();
		}
	}

}
