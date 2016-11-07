import java.util.Scanner;

public class Average
{
	static int one;
	static int two;
	static int three;
	static int a;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first number:");
		one = kb.nextInt();
		System.out.println("Enter your second number:");
		two = kb.nextInt();
		System.out.println("Enter your third number:");
		three = kb.nextInt();
		
		calcAverage();
		print();

	}
	
	public static int calcAverage()
	{
		a=(one+two+three)/3;
		return a;
	}

	public static void print()
	{
		System.out.println("The average of "+ one + ", " + two + ", and " + three + " is "+ a);
	}
}