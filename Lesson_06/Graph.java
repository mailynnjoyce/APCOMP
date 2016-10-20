import java.util.Scanner;

public class Graph
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Any number: ");
		int num1 = kb.nextInt();
		System.out.println("Amount of times mulitplied: ");
		int stop = kb.nextInt();
		
		System.out.println("Multiplication Table for " + num1);
		
		for (int i = 1; i<=stop; i+=1)
		{
			System.out.println(i + "    " + (i*num1));
		}
	}
}