import java.util.Scanner;

public class Cube
{
	static int one;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the side length:");
		one = kb.nextInt();
		
		calcSurf();
		print();

	}
	
	public static int calcSurf()
	{
		return (one*one)*6;
	}

	public static void print()
	{
		System.out.println("The surface area of the cube is "+ calcSurf());
	}
}