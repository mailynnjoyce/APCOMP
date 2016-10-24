import java.util.Scanner;

public class Song
{
	public static void main(String[]args)
	{
		System.out.println(sing("Na", 4));
		System.out.println(sing("Na", 4));
		System.out.println(sing("Hey", 3));
		System.out.println(sing("Goodbye!", 1));
	}
	
	public static String sing(String word, int sang)
	{
		String line = word;
		for (int i = 2; i<=sang; i+=1)
		{
			line += (" " + word);
		}
		return line;
	}

}