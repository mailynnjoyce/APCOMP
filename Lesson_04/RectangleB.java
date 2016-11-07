import java.util.Scanner;

public class RectangleB
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter length:");
		int one = kb.nextInt();
		System.out.println("Enter width");
		int two = kb.nextInt();
		
		System.out.println("The perimeter is " + ((2*one)+(2*two)));

	}
	
}