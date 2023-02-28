import java.util.Scanner;

public class IfExample2 {
//Nested If
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter I value");
		int num1=sc.nextInt();
		System.out.println("Enter II value");
		int num2=sc.nextInt();
		System.out.println("Enter III value");
		float num3=sc.nextFloat();
		
		if(num1>num2)
		{
				if(num1>num3)
					System.out.println("num1 is greatest");
				else
					System.out.println("num3 is greatest");
		}
		else
		{
			if(num2>num3)
			
			System.out.println("num2 is gretest");
			else 
			System.out.println("num3 is greatest");
		}
	}

}
