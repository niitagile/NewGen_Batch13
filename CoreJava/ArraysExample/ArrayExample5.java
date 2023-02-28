package ArraysExample;

import java.util.Scanner;

public class ArrayExample5 {

	public static void main(String[] args) {
		String name="Jyoti";// String is predefined class in java.lang package
		Scanner sc=new Scanner(System.in);
		String names[]=new String[3];

		for(int i=0;i<names.length;i++) {
			
			System.out.print("Enter name ::"+ i);
			names[i]=sc.next();
		}
		
		for(String val : names) {
			System.out.print(val + " ");
		}
	}

}
