import java.util.Scanner;

public class ReverseNumber
{
	static int num;
	static int rev;
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Any whole number: ");
		num = kb.nextInt();
		rev = 0;
		System.out.println("The sum of the digits in " + num + " is " + getRev());
		
	}
	
	public static int getRev()
	{
		while(num>0)
		{
			rev *= 10;
			rev += (num % 10);
			num /= 10;
		}
		
		return rev;
	}
}