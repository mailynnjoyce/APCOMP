import java.util.Scanner;

public class Center
{
	public static void main(String[]args)
	{
	   Scanner kb = new Scanner(System.in);
	   System.out.println("Please enter a word: ");
	   String word1 = kb.next();
	   System.out.println("Please enter a word: ");
	   String word2 = kb.next();
	   System.out.println("Please enter a word: ");
	   String word3 = kb.next();
	   System.out.println(recur(word1));
	   System.out.println(recur(word2));
	   System.out.println(recur(word3));
	}
	public static String recur(String n)
	{
	   if (n.length()>=20)
	   {
		   return n;
	   }
	   else
	   {
		   n = " " + n + " ";
		   return recur(n);
	   }
	}
}