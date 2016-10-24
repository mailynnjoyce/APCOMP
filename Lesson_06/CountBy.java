import java.util.Scanner;

public class CountBy
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Count By: ");
		int num1 = kb.nextInt();
		System.out.println("Count Up To: ");
		int stop = kb.nextInt();
		
		
		String print = Integer.toString(num1);
		for (int i = 2; stop>=(i*num1); i+=1)
		{
			print += (", " + (i*num1));
		}
		System.out.println(print);
	}
}