import java.util.Scanner;

public class AverageNumbers
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		int[] nums = new int[5];

		System.out.println("Please enter 5 numbers: ");

		for (int i = 0; i < nums.length; i++)
		{
		  nums[i] = kb.nextInt();
		}

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