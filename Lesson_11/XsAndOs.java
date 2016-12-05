import java.util.Random;

public class XsAndOs
{
	public static void main(String[]args)
	{
	   String[][] xAndO = new String[4][4];
	   Random rand = new Random();
	   
	   for (int i = 0; i < xAndO.length; i++)
	   {
		   for (int j = 0; j < xAndO.length; j++)
		   {
			   int pick = rand.nextInt(3);
			   if (pick == 1)
			   {
				   xAndO[i][j] = "x";
			   }
			   if (pick == 2)
			   {
				   xAndO[i][j] = "o";
			   }
			   System.out.println(xAndO[i][j] + "\t");
		   }
		   System.out.println("");
	   }
	}
}