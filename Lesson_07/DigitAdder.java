import java.util.Scanner;

public class DigitAdder
{
	static int num;
	static int sum;
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Any whole number: ");
		num = kb.nextInt();
		sum = 0;
		System.out.println("The sum of the digits in " + num + " is " + sumDigits());
		
	}
	
	public static int sumDigits()
	{
		while(num>0)
		{
			sum += (num % 10);
			num /= 10;
		}
		
		return sum;
	}
}