import java.util.Scanner;
public class DistanceRunner
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter x1: ");
		int x1 = kb.nextInt();
		System.out.println("Please enter y1: ");
		int y1 = kb.nextInt();
		System.out.println("Please enter x2: ");
		int x2 = kb.nextInt();
		System.out.println("Please enter y2: ");
		int y2 = kb.nextInt();
		
		Distance object = new Distance(x1, y1, x2, y2);
		
		System.out.println("Distance = " + object.getDistance());
		
		Distance object2 = new Distance(7, 3, -1, -2);
		
		System.out.println("Distance = " + object2.getDistance());
	}
}