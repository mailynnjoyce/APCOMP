import java.util.ArrayList;

abstract class Car2 implements Location2
{
	public double[] loc;
	private final int id = (int)(Math.random() * 99 + 1);
	
	public Car2()
	{
		loc = new double[2];
	}
	public void move(double x, double y)
	{
		loc[0] += x;
		loc[1] += y;
	}
	
	public int getID()
	{
		return id;
	}
		public double[] getLoc()
	{
		return loc;
	}
}