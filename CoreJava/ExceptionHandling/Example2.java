package ExceptionHandling;

import java.sql.SQLException;

public class Example2 {

	public static void main(String[] args) {

		int arr[]=new int [4];
		try {
			/*arr[0]=56;
			arr[1]=78;
			arr[2]=34;
			arr[3]=19;
			arr[4]=90;
			for(int val : arr) {
				System.out.println(val);
				
			}
			System.out.println(5/0);*/
			int a=Integer.parseInt("A101");
			System.out.println(a);
		}catch(ArithmeticException|ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("End program");
	}


}
