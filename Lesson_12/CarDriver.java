import java.util.Scanner;
public class CarDriver
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter paint: ");
		String paint = kb.nextLine();
		System.out.println("Please enter interior: ");
		String interior = kb.nextLine();
		System.out.println("Please enter engine: ");
		String engine = kb.nextLine();
		System.out.println("Please enter tires: ");
		String tires = kb.nextLine();
		
		Car object = new Car(paint, interior, engine, tires);
		
		System.out.println("Your vechile is ready...");
		System.out.println("Paint:       " + object.getPaint());
		System.out.println("Interior:    " + object.getInterior());
		System.out.println("Engine:      " + object.getEngine());
		System.out.println("Tires:       " + object.getTires());
	}
}