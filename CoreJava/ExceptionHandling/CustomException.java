package ExceptionHandling;

import java.util.Scanner;

class InvalidVoterException extends Exception{
	public InvalidVoterException(String str) {
		super(str);
	}
}
public class CustomException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try {
		if(age>18)
			System.out.println("Valid Voter");
		else
			throw new InvalidVoterException("Invalid Voter");
		}
		catch(InvalidVoterException e) {
			e.printStackTrace();
		}
		
	}

}
//Take amount from the user which he wants to withdrawl. 
//If amount is lesser than balance then throw exception