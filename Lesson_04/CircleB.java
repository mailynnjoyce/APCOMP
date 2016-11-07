import java.util.Scanner;

public class CircleB
{
	static double one;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the radius:");
		one = kb.nextDouble();
		
		System.out.printf("The area of the circle is %7.2f\n", ((one*one)*3.14159265));

	}
}