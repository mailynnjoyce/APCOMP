import java.util.Scanner;
public class InventoryRunner
{
	public static void main (String[]args)
	{
		String m = "";
		String i = "";
		String c = "";
		double p = 0;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Would you like to enter category and price? (yes or no)");
		String person = kb.nextLine();
		
		if (person.equals("yes")||person.equals("Yes"))
		{
			System.out.println("Please enter manufacturer: ");
			m = kb.nextLine();
			System.out.println("Please enter item: ");
			i = kb.nextLine();
			System.out.println("Please enter category: ");
			c = kb.nextLine();
			System.out.println("Please enter price: ");
			p = kb.nextDouble();
			Inventory thing = new Inventory(m, i, c, p);
			System.out.println(thing);
		}
		else
		{
			System.out.println("Please enter manufacturer: ");
			m = kb.nextLine();
			System.out.println("Please enter item: ");
			i = kb.nextLine();
			Inventory thing2 = new Inventory(m, i);
			System.out.println(thing2);
		}
	}
}