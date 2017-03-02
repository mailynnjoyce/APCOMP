import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Toyota implements Location
{
	private double x,y;
	private int ID;
	
	public Toyota()
	{
		x = 0;
		y = 0;
	}
	
	public Toyota(double x1, double y1)
	{
		x = x1;
		y = y1;
	}
	
	public Toyota(String coordinates)
	{
		String[] parts = coordinates.split(",");
		x = Double.parseDouble(parts[0]);
		y = Double.parseDouble(parts[1]);
	}
	
	public Toyota(double[] coordinates)
	{
		x = coordinates[0];
		y = coordinates[1];
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