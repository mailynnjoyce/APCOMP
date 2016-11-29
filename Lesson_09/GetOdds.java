import java.util.Random;

public class GetOdds
{
	public static void main(String[]args)
	{
		int[] Array = new int[10];
		
		for (int i = 0; i < Array.length; i++)
		{
			Random rand = new Random();
			Array[i] = rand.nextInt(100);
		}
		
		System.out.println("For the followings numbers..." + printArray(Array));
		System.out.println("The " + getOdds(Array) + " are the odd numbers");
	}
	
	public static String getOdds (int[] x)
	{
		String nums = "";
		for (int i = 0; i < x.length; i++) 
		{
			if (x[i]%2 != 0)
			{	
				nums += x[i] + " ";
			}
		 }
		 return nums;
	}
	public static String printArray (int[] x)
	{
		String nums = "";
		for (int i = 0; i < x.length; i++) 
		{
			if (i > 0)
			{
				nums += ", ";
			}
			
			nums+= x[i];
		 }
		 return nums;
	}
}