package ExceptionHandling;
//Exception - an unavoidable condition which is generate due to lack of resources or inforamtion . It stops our program forcefully
//checked- handle by prg
//unchecked- not handle in prg
//try - block of statements which can generate exception
//throw- use to throw excdeption from try block to catch block
//catch- block use to handle exception
//finally- always execute whether exception occurs or not
public class Example1 {

	public static void main(String[] args) {
		int a=5;
		int b=0;
		try {
			System.out.println(a/b);
		//throw new ArithmeticException();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("finally block");
		}
		
		System.out.println("End of prg");
	}

}
