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
		
		print(calcPerim(one,two));

	}
	
	public static int calcPerim(int one, int two)
	{
		return (2*one)+(2*two);
	}

	public static void print(int p)
	{
		System.out.println("The perimeter is " + p);
	}
}