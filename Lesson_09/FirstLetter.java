import java.util.Scanner;

public class FirstLetter
{
	public static void main(String[]args)
	{
	   Scanner kb = new Scanner(System.in);
	   String[] words = new String[5];
	   
	   System.out.println("Please enter 5 words: ");
	   
	   for (int i = 0; i < words.length; i++)
	   {
		   words[i] = kb.next();
		   System.out.println("First Letter: " + first(words[i]));
	   }
	}
	public static String first (String word)
	{
		String drow = "";
		char[] array = word.toCharArray();
		drow += array[0];
		return drow;
	}
}