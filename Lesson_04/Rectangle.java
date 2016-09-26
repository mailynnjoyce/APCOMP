import java.util.Scanner;

public class Rectangle
{
	static int one;
	static int two;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter length:");
		one = kb.nextInt();
		System.out.println("Enter width");
		two = kb.nextInt();
		
		calcPerim();
		print();

	}
	
	public static int calcPerim()
	{
		return (2*one)+(2*two);
	}

	public static void print()
	{
		System.out.println("The perimeter is " + calcPerim());
	}
}