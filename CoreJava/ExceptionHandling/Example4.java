package ExceptionHandling;

public class Example4 {

	static void show() throws ArithmeticException{
		System.out.println(5/0);
	}
	public static void main(String[] args) {
		try {
			show();
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}

	}

}
