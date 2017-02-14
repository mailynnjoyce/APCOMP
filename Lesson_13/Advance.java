public class Advance extends Ticket
{
	private int daysLeft;
	
	Scanner kb = new Scanner(System.in);
	System.out.print("How many days are there left?");
	int daysLeft = kb.nextInt();
	public double getPrice()
	{
		if(daysLeft > 9)
		{
			int price = 30;
		}
		else
		{
			int price = 40;
		}
	}
}