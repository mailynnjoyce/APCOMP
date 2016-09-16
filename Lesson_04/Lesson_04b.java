import java.util.Scanner;

public class Lesson_04b
{
	public static void main(String[]args)
	{
		Lesson_04b form = new Lesson_04b();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter First Name:");
		String first = kb.next();
		System.out.println("Enter Last Name:");
		String last = kb.next();
		System.out.println("Enter Your Title:");
		String title = kb.next();
		kb.nextLine();
		System.out.println("Enter High School:");
		String hs = kb.nextLine();
		System.out.println("Enter Graduation Year:");
		int grad = kb.nextInt();
		System.out.println("Enter ID Number");
		int id = kb.nextInt();
		
		form.format(first, last, title, hs, grad, id);
	}
	
	public void format(String first, String last, String title, String hs, int grad, int id)
	{
		System.out.println("********************************");
		System.out.printf("/n%15s  %15d", hs, grad);
		System.out.printf("\n%15s  %15s", last, first);
		System.out.printf("\n%15s  %15d", title, id);
		System.out.println("\n********************************");
	}
}