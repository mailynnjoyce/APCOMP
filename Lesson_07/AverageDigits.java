import java.util.Scanner;

public class AverageDigits
{
	static int num;
	static int digits;
	static int average;
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Any whole number: ");
		num = kb.nextInt();
		digits = 0;
		average = -0;
		
		System.out.println("The average of the digits in " + num + " is " + Average());
		
	}
	
	public static int Average()
	{
		while(num>0)
		{
			digits += 1;
			average += (num % 10);
			num /= 10;
		}
		
		return (average/digits);
	}
}