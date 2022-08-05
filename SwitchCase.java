import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		x = s.nextInt();
		switch(x)
		{
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
			
		default:
			System.out.println("Number out of case");
			break;
		}

	}

}
