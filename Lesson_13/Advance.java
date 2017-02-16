public class Advance extends Ticket
{
	
	private int daysLeft;
	
	public Advance()
	{
		this(0);
	}
	
	public Advance(int days)
	{
		super();
		daysLeft = days;
	}
	
	public double getPrice()
	{
		if(daysLeft > 9)
		{
			return 30;
		}
		else
		{
			return 40;
		}
	}
}