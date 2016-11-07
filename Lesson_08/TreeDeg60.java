import java.util.Scanner;

public class TreeDeg60
{
	public static void main(String[]args)
	{
	   Scanner kb = new Scanner(System.in);
	   System.out.println("Please enter a word: ");
	   String word = kb.next();
	   int start = 0;
	   int stop = word.length();
	   recur(word, start, stop);
	}
	public static void recur(String n, int start, int stop)
	{
	   if (start <= stop)
	   {
		   System.out.println(n.substring(0,start));
		   start +=1;
		   recur(n, start, stop);
	   }
	}
}