import java.util.Scanner;

public class shop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the quanity:");
		double n= sc.nextDouble();
		if(n>1000) {
			System.out.println("The total cost is:"+(n-(n*0.10)));
		}
		else {
			System.out.println("The total cost is:"+n);
		}
	}

}
