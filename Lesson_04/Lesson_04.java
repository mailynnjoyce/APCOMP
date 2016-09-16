import java.util.Scanner;

public class Lesson_04
{
	public static void main(String[]args)
	{
		Lesson_04 form= new Lesson_04();
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter item 1:");
		String item1 = kb.nextLine();
		System.out.println("Please enter the price:");
		double price1 = kb.nextDouble();
		kb.nextLine();
		System.out.println("Please enter item 2:");
		String item2 = kb.nextLine();
		System.out.println("Please enter the price:");
		double price2 = kb.nextDouble();
		kb.nextLine();
		System.out.println("Please enter item 3:");
		String item3 = kb.nextLine();
		System.out.println("Please enter the price:");
		double price3 = kb.nextDouble();
		
		form.format(item1, price1, item2, price2, item3, price3);
	}
	
	public void format(String item1, double price1, String item2, double price2, String item3, double price3)
	{
		System.out.println("<<<<<__Receipt__>>>>>");
		
		System.out.printf("\n%11s  %5.2f", item1, price1);
		System.out.printf("\n%11s  %5.2f", item2, price2);
		System.out.printf("\n%11s  %5.2f", item3, price3);
		
		System.out.printf("\n%11s  %5.2f", "Subtotal:", price1+price2+price3);
		System.out.printf("\n%11s  %5.2f", "Tax:", (price1+price2+price3)*0.075);
		System.out.printf("\n%11s  %5.2f", "Total:", ((price1+price2+price3)*0.075)+ price1+price2+price3);
		System.out.println("\n\n----------------------");
	}
}