import java.util.Random;

public class RandomNumbers
{
	public static void main(String[]args)
	{
	   int[][] nums = new int[4][4];
	   
	   for (int i = 0; i < nums.length; i++)
	   {
		   for (int j = 0; j < nums[i].length; j++)
		   {
			   Random rand = new Random();
			   nums[i][j] = rand.nextInt(100);
		   }
	   }
	   
	   for (int i = 0; i < nums.length; i++)
	   {
		   for (int j = 0; j < nums[i].length; j++)
		   {
			   System.out.print(nums[i][j] + "\t");
		   }
		   
		   System.out.println();
	   }
	}
}