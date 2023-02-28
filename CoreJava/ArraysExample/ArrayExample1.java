package ArraysExample;
import java.util.Scanner;
public class ArrayExample1 {

	public static void main(String[] args) {
		
		//Array is collection of similar data types
		int marks[]= {67,89,90};
		System.out.println(marks[1]);
		System.out.println("Total Elements="+marks.length);//tell total number of elements
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i]+" ");
		}
	}

}
