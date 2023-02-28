import java.util.Scanner;

public class LoopsExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value");
		int num=sc.nextInt();
		//for loop
		int fact=1;
		/*for(;num>1;num--) {
		fact=fact*num;
	}

	System.out.println("Factorial="+fact);	*/

		//while loop
		/*while(num>1) {
			fact=fact*num;
			num--;
		}
		System.out.println("Factorial="+fact);*/
		//do while	
		do {
			fact=fact*num;
			num--;
		}while(num>1);
		System.out.println("Factorial="+fact);
	}

}
