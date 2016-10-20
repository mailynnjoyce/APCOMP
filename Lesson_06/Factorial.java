import java.util.Scanner;

public class Factorial
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Any number: ");
		int num = kb.nextInt();
		
		for (int i = num-1; i>=1; i--)
		{
			num *= i;
		}
		
		System.out.println("The factorial is " + num);
	}
}