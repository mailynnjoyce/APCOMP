import java.util.Scanner;

public class LeftTri
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Any word: ");
		String word = kb.next();
		
		for (int i = 0; i<=word.length(); i+=1)
		{
			System.out.println(word.substring(i,word.length()));
		}
		
	}
}