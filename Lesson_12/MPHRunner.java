import java.util.Scanner;
public class MPHRunner
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the distance(in miles): ");
		int distance = kb.nextInt();
		System.out.println("How many hours did it take: ");
		int hours = kb.nextInt();
		System.out.println("Excluding the hours, how many minutes did it take: ");
		int minutes = kb.nextInt();
		
		MilesPerHour object = new MilesPerHour(distance, hours, minutes);
		
		System.out.println(object.getDistance() + " miles in " + object.getHours() + " hours and " + object.getMinutes() + " minutes = " + object.getMPH() + " mph");
		
		MilesPerHour object2 = new MilesPerHour(distance, hours, minutes);
		
		System.out.println(object2.getDistance() + " miles in " + object2.getHours() + " hours and " + object2.getMinutes() + " minutes = " + object2.getMPH() + " mph");
	}
}