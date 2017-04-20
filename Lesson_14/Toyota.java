import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Toyota extends Car
{	
	public Toyota(String coordinates)
	{
		String[] parts = coordinates.split(",");
		loc[0] = Double.parseDouble(parts[0]);
		loc[1] = Double.parseDouble(parts[1]);
	}
}