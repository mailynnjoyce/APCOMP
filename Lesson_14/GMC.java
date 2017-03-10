import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class GMC extends Car
{
	private double x,y;
	private int ID;
	
	public GMC()
	{
		x = 0;
		y = 0;
	}
	
	public GMC(double x1, double y1)
	{
		x = x1;
		y = y1;
	}
	
	
	public int getID()
	{
		return (int)(Math.random() * (Math.pow(10, 6) - 1) + 1);
	}
	
	public void move(int x1, int y1)
	{
		x = x1;
		y = y1;
	}
	
	public double[] getLoc()
	{
		return (new double[]{x,y});
	}
}