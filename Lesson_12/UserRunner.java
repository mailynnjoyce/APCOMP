import java.util.Scanner;
public class UserRunner
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Would you like to use a public avatar? (yes or no)");
		String customer = kb.next();
		if (customer.equals("yes")||customer.equals("Yes"))
		{
			User pH2 = new User("Professor", "Handsome", "profHansizzle");
			System.out.println(pH2);
		}
		else
		{
			User pH = new User("Professor", "Handsome");
			System.out.println(pH);
		}
	}
}