
public class SwitchStatement {

	public static void main(String[] args) {
		
		char c='B';
		
		switch(c) {
		
		case 'M':
			System.out.println("Monday");
		case 'T':
			System.out.println("Tuesday");
		case 'W':
			System.out.println("Wednesday");
		case 'H':
			System.out.println("Thursday");
		case 'F':
			System.out.println("Friday");
		case 'S':
			System.out.println("Saturday");
			break;
		case 'U':
			System.out.println("Sunday");
		default:
			System.out.println("No case matched");
		
		}

	}

}
