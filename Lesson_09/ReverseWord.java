import java.util.Scanner;

public class ReverseWord
{
	public static void main(String[]args)
	{
	   Scanner kb = new Scanner(System.in);
	   String[] words = new String[5];
	   
	   System.out.println("Please enter 5 words: ");
	   
	   for (int i = 0; i < words.length; i++)
	   {
		   words[i] = kb.next();
		   System.out.println(words[i]);
		   System.out.println("Reversed: " + reverse(words[i]));
	   }
	}
	public static String reverse (String word)
	{
		String drow = "";
		char[] array = word.toCharArray();
		for (int i = word.length()-1; i>=0; i-=1)
		{
			drow += array[i];
		}
		return drow;
	}
}