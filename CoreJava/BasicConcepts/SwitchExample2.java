
public class SwitchExample2 {

	public static void main(String[] args) {
		char num='W';
		//switch accepts short, int , string, char, enum
		switch(num) {
		case 'S':
		case 's': System.out.println("Sunday"); break;
		case 'M':
		case 'm': System.out.println("Monday"); break;
		case 'T':
		case 't': System.out.println("Tuesday"); break;
		case 'W':
		case 'w': System.out.println("Wednesday"); break;
		default : System.out.println("Wrong choice");
		
		}
	}

}
