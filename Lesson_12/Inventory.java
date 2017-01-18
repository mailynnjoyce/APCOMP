import java.util.Random;
public class Inventory
{
	private String mancufacturer;
	private String itemName;
	private String category;
	private double price;
	private int upc;

	public Inventory(String m, String i)
	{
	   mancufacturer = m;
	   itemName = i;
	   category = "____";
	   upc = (int)(Math.random() * 1000000) + 1;
	   price = 0;
	}

	public Inventory(String m, String i, String c, double p)
	{
	   mancufacturer = m;
	   itemName = i;
	   category = c;
	   upc = (int)(Math.random() * 1000000) + 1;
	   price = p;
	}
	
	public String toString()
	{
	   return "Item Info..." +
							   "\nManufacturer:   " + mancufacturer +
							   "\nItem:           " + itemName +
							   "\nCategory:       " + category +
							   "\nUPC#:           " + upc +
							   "\nPrice:          $" + price;
	}
	
}