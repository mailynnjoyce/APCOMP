import java.util.Scanner;

public class Exercise_02
{
	static String item1;
	static double price1;
	static String item2;
	static double price2;
	static String item3;
	static double price3;
	static String item4;
	static double price4;
	static double discount;
	static String output;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter item 1:");
		item1 = kb.nextLine();
		System.out.println("Please enter the price:");
		price1 = kb.nextDouble();
		kb.nextLine();
		System.out.println("Please enter item 2:");
		item2 = kb.nextLine();
		System.out.println("Please enter the price:");
		price2 = kb.nextDouble();
		kb.nextLine();
		System.out.println("Please enter item 3:");
		item3 = kb.nextLine();
		System.out.println("Please enter the price:");
		price3 = kb.nextDouble();
		kb.nextLine();
		System.out.println("Please enter item 4:");
		item4 = kb.nextLine();
		System.out.println("Please enter the price:");
		price4 = kb.nextDouble();
		format();
		System.out.println(output);
	}
	
	public static double discount()
	{
		if ((price1+price2+price3+price4)>=2000)
		{
			return (price1+price2+price3+price4)*0.15;
		}
		return 0.0;
	}
	
	public static String format()
	{
		output = "";
		output += "<<<<<__Receipt__>>>>>";
		output += String.format("\n%11s  %5.2f", item1, price1);
		output += String.format("\n%11s  %5.2f", item1, price1);
		output += String.format("\n%11s  %5.2f", item2, price2);
		output += String.format("\n%11s  %5.2f", item3, price3);
		output += String.format("\n%11s  %5.2f", item4, price4);
		output += String.format("\n%11s  %5.2f", "Total:", (price1+price2+price3+price4));
		output += String.format("\n%11s  %5.2f", "Tax:", (price1+price2+price3+price4)*0.075);
		output += String.format("\n%11s  %5.2f", "Subtotal:", ((price1+price2+price3+price4)+(price1+price2+price3)*0.075)-discount());
		output += "\n______________________";
		return output;
	}

}