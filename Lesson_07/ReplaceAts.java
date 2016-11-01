import java.util.Scanner;

public class ReplaceAts
{
	static String sentence;
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Any sentence or phrase: ");
		sentence = kb.nextLine();
		System.out.println("The sentence replaces with @s: " + replace());
		
	}
	
	public static String replace()
	{
		while(sentence.indexOf("a") >= 0)
		{
			sentence = sentence.substring(0, sentence.indexOf("a")) + "@" + sentence.substring(sentence.indexOf("a")+1);
		}

		return sentence;
	}
}