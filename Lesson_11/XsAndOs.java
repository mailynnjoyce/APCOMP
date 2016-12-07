import java.util.Random;

public class XsAndOs
{
	public static void main(String[]args)
	{
	   String[][] xAndO = new String[4][4];
	   Random rand = new Random();
	   
	   for (int i = 0; i < xAndO.length; i++)
	   {
		   for (int j = 0; j < xAndO[i].length; j++)
		   {
			   int pick = rand.nextInt(2);
			   if (pick == 1)
			   {
				   xAndO[i][j] = "x";
			   }
			   else
			   {
				   xAndO[i][j] = "o";
			   }
			   System.out.print(xAndO[i][j] + "\t");
		   }
		   System.out.println();
	   }
	}
}