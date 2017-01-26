import java.util.Scanner;
import java.util.Random;

public class AverageNumbers
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Random rand = new Random();
		int[] nums = new int[5];

		for (int i = 0; i < nums.length; i++)
		{
		  nums[i] = rand.nextInt(100);
		}
		
		for (int i = 0; i < nums.length; i++) 
		{
			if (i > 0) {
				System.out.print(", ");
			}
			
			System.out.print(nums[i]);
		}
		
		System.out.println("");
		System.out.println("Average: " + average(nums));
	}
	public static int average (int[] n)
	{
		int sum = 0;
		for(int num: n)
		{
		   sum += num;
		}
		return sum/5;
	}
}