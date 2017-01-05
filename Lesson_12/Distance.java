import java.lang.Math.*;
public class Distance
{
	private int x1, y1, x2, y2;
	private double distance;
	
	public Distance()
	{
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
		distance = 0;
	}
	
	public Distance(int xOne, int yOne, int xTwo, int yTwo)
	{
		x1 = xOne;
		y1 = yOne;
		x2 = xTwo;
		y2 = yTwo;
		distance = 0;
	}

	public double getDistance()
	{
		distance = Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
		return distance;
	}
}