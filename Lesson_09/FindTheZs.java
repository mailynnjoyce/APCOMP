import java.util.Scanner;
import java.io.*;

public class FindTheZs
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[] Array = new String[5];
		
		System.out.println("Please enter 5 words: ");
	   
	    for (int i = 0; i < Array.length; i++)
	    {
		   Array[i] = kb.next();
	    }
		
		System.out.println("For the followings words..." + printArray(Array));
		System.out.println("The " + hasZs(Array) + " have z");
	}
	
	public static String hasZs (String[] x)
	{
		String z = "";
		for (int i = 0; i < x.length; i++) 
		{
			if (x[i].indexOf('z')+1 > 0)
			{	
				z += x[i] + " ";
			}
		}
		return z;
	}
	
	public static String printArray (String[] x)
	{
		String words = "";
		for (int i = 0; i < x.length; i++) 
		{
			if (i > 0)
			{
				words += ", ";
			}
			
			words += x[i];
		}
		
		return words;
	}
}