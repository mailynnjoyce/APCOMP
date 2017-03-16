import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Honda2 extends Car2
{
	private double x,y;
	
	public Honda2()
	{
		x = 0;
		y = 0;
	}
	
	public Honda2(double x1, double y1)
	{
		x = x1;
		y = y1;
	}
	
	public Honda2(String coordinates)
	{
		String[] parts = coordinates.split(",");
		x = Double.parseDouble(parts[0]);
		y = Double.parseDouble(parts[1]);
	}
	
	public Honda2(double[] coordinates)
	{
		x = coordinates[0];
		y = coordinates[1];
	}
	
	public double[] getLoc()
	{
		return (new double[]{x,y});
	}
}