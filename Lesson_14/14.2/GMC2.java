import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class GMC2 extends Car2
{
	private double x,y;
	
	public GMC2()
	{
		x = 0;
		y = 0;
	}
	
	public GMC2(double x1, double y1)
	{
		x = x1;
		y = y1;
	}
	
	public double[] getLoc()
	{
		double[] loc = {x,y};
		return loc;
	}
}