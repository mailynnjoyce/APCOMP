import java.util.Scanner;

public class Lesson_04b
{
	public static void main(String[]args)
	{
		Lesson_04b form= new Lesson_04b();
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter First Name:");
		String first = kb.next();
		System.out.println("Enter Last Name:");
		String last = kb.next();
		System.out.println("Enter Your Title:");
		String title = kb.next();
		System.out.println("Enter High School:");
		String hs = kb.next();
		System.out.println("Enter Graduation Year:");
		double grad = kb.nextDouble();
		System.out.println("Enter ID Number");
		double id = kb.nextDouble();
		
		form.format(first, last, title, hs, grad, id);
	}
	
	public void format(String first, String last, String title, String hs, double grad, double id)
	{
		System.out.println("*********************");
		
		System.out.printf("\n%15s  %15.4f", hs, grad);
		System.out.printf("\n%15s  %15f", first, last);
		System.out.printf("\n%15s  %15.7f", title, id);
		
		System.out.println("\n*********************");
	}
}