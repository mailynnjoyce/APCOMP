import java.util.Scanner;

public class password
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Username:");
		String user = kb.next();
		System.out.println("Password:");
		String pass = kb.next();
		
		if (user.equals("mailynnjoyce") && pass.equals("mailynn123"))
		{
			System.out.println("You are granted access.");
			System.exit(0);
		}
		if (!(user.equals("mailynnjoyce")) && pass.equals("mailynn123"))
		{
			System.out.println("Your username is invalid.");
			System.exit(0);
		}
		if (!(pass.equals("mailynn123")) && user.equals("mailynnjoyce"))
		{
			System.out.println("Your password is invalid.");
			System.exit(0);
		}
		
		else
		{
			System.out.println("Your inputs are invalid.");
			System.exit(0);
		}
	}
}