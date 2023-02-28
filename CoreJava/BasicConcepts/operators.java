
public class operators {

	public static void main(String[] args) {
		int num1=89;
		int num2=90;
		int num3=100;
		//Relational operators
		System.out.println(num1>num2);
		System.out.println(num1 !=num2);
		//Logical Operators
		System.out.println(num1>num2 && num1> num3);
		System.out.println(num1<num2 || num1> num3);
	
		System.out.println(!(num1>num2 && num1> num3));
		//ternary operators
		System.out.println(num1>num2?"num1 is greater": "num2 is greater");
		System.out.println(num1%2==0?"even":"odd");

	}

}
