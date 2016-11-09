import java.util.Scanner;

public class TreeDeg60
{
	public static void main(String[]args)
	{
	   Scanner kb = new Scanner(System.in);
	   System.out.println("Please enter a word: ");
	   String n = kb.next();
	   
	   int start = 0;
	   int stop = n.length();
	   int numSpace = stop;
	   String space = " ";
	   
	   recur(n, start, stop, numSpace, space);
	}
	
	public static void recur(String n, int start, int stop, int numSpace, String space)
	{
	   if (start <= stop)
	   {
		   String multiSpace = new String(new char[numSpace+1]).replace("\0", space);
		   System.out.println(multiSpace + n.substring(0,start));
		   start += 1;
		   numSpace -= 1;
		   recur(n, start, stop, numSpace, space);
	   }
	}
}