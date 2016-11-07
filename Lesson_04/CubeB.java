import java.util.Scanner;

public class CubeB
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the side length:");
		int one = kb.nextInt();
		
		print(calcSurf(one));

	}
	
	public static int calcSurf(int one)
	{
		return (one*one)*6;
	}

	public static void print(int surf)
	{
		System.out.println("The surface area of the cube is "+ surf);
	}
}