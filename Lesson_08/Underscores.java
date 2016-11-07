import java.util.Scanner;

public class Underscores
{
	public static void main(String[]args)
	{
	   Scanner kb = new Scanner(System.in);
	   System.out.println("Please enter a sentence: ");
	   String sentence = kb.nextLine();
	   System.out.println(recur(sentence));
	}
	public static String recur(String n)
	{
	   if (n.indexOf(" ")<0)
	   {
		   return n;
	   }
	   else
	   {
		   n = n.substring(0, n.indexOf(" ")) + "_" + n.substring(n.indexOf(" ")+1);
		   return recur(n);
	   }
	}
}