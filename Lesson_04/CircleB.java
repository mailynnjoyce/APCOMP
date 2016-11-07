import java.util.Scanner;

public class CircleB
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the radius:");
		int one = kb.nextInt();
		
		print(calcArea(one));

	}
	
	public static double calcArea(int one)
	{
		return (one*one)*3.14159265;
	}

	public static void print(double area)
	{
		System.out.printf("The area of the circle is %7.2f\n", area);
	}
}