import java.util.ArrayList;
import java.util.Arrays;

public class Composites
{
	public static void main (String[]args)
	{
		Integer [] numbers = {2, 6, 8, 9, 10, 12, 13, 15, 17, 24, 55, 66, 77, 78, 79};
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(numbers));
		System.out.println(nums);
	}
}