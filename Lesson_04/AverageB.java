import java.util.Scanner;

public class AverageB
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first number:");
		int one = kb.nextInt();
		System.out.println("Enter your second number:");
		int two = kb.nextInt();
		System.out.println("Enter your third number:");
		int three = kb.nextInt();
		
		System.out.println("The average of "+ one + ", " + two + ", and " + three + " is "+ ((one+two+three)/3));

	}

}