import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ExpressionSolver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter equation with spaces: ");
		String expression = kb.nextLine();
		
		ArrayList<String> equation = new ArrayList<>(Arrays.asList(expression.split(" ")));
		System.out.println(doEquation(equation));
	}
	
	public static ArrayList<String> doEquation (ArrayList<String> x)
	{
		int i = 0;
		while (i < x.size())
		{
			if (x.get(i).equals("*") || x.get(i).equals("/"))
			{
				if (x.get(i).equals("*"))
				{
					x.set(i, "" + (Integer.parseInt(x.get(i-1)) * Integer.parseInt(x.get(i+1))));
				}
				else
				{
					x.set(i, "" + (Integer.parseInt(x.get(i-1)) / Integer.parseInt(x.get(i+1))));
				}
				x.remove(i-1);
				x.remove(i);
			}
			else
			{
				i++;
			}
		}
		
		i = 0;
		
		while (i < x.size())
		{
			if (x.get(i).equals("+") || x.get(i).equals("-"))
			{
				if (x.get(i).equals("+"))
				{
					x.set(i, "" + (Integer.parseInt(x.get(i-1)) + Integer.parseInt(x.get(i+1))));
				}
				else
				{
					x.set(i, "" + (Integer.parseInt(x.get(i-1)) - Integer.parseInt(x.get(i+1))));
				}
				x.remove(i-1);
				x.remove(i);
			}
			else
			{
				i++;
			}
		}
		return x;
	}
}