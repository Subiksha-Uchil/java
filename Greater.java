import java.util.*;
public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.println("Enter 3 numbers :");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		
		if(a>b)
		{
			if(b>c)
			{
				System.out.println(a+" is the greatest number");
			}
		}
		else if(b>c)
		{
			if(b>a)
			{
				System.out.println(b+" is the greatest number");
			}
		}
		else
		{
			System.out.println(c+" is the greatest number");
		}
		
	}

}
