import java.util.Scanner;

public class Box
{
	public static void main (String[]args)
	{
		int end = 0;
		int count = 0;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Any word: ");
		String word = kb.next();
		
		for (int i = word.length(); i<=word.length(); i+=end)
		{
			count +=1;
			if (count > word.length()){
				end+=1;
			}
			else {
				System.out.println(word.substring(0,i));
			}
		}
	}
}