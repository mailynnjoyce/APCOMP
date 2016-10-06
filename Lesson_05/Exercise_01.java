import java.util.Random;
public class Exercise_01
{
	static int player;
	static int comp;
	static String winner;
	
	public static void main(String[]args)
	{
		Random rand = new Random();
		player = rand.nextInt(6)+1;
		System.out.println("You rolled a " + player);
		comp = rand.nextInt(6)+1;
		System.out.println("The computer rolled a " + comp);
		
		if (player > comp)
		{
			winner = "The winner is the player";
		}
		if (player < comp)
		{
			winner = "The winner is the computer";
		}
		if (player == comp)
		{
			winner = "The winner is NO ONE";
		}
		System.out.println(winner);
	}

}