import java.util.Scanner;

public class CubeB
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the side length:");
		int one = kb.nextInt();
		
		System.out.println("The surface area of the cube is "+ ((one*one)*6));

	}

}