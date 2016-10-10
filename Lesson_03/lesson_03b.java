import java.util.Scanner;

public class lesson_03b
{
	public static void main (String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("BMI CALCULATOR");
		System.out.println("What is your height(in inches)? ");
		int height = keyboard.nextInt();
		System.out.println("What is your weight(in pounds)? ");
		int weight = keyboard.nextInt();
		double bmi = 703*weight/height/height;
		System.out.println("Your BMI is "+ bmi + ".");
	}
}