import java.util.Scanner;

public class BMIPart2
{
	static double bmi;
	
	public static void main (String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("BMI CALCULATOR");
		System.out.println("What is your height(in inches)? ");
		int height = keyboard.nextInt();
		System.out.println("What is your weight(in pounds)? ");
		int weight = keyboard.nextInt();
		bmi = 703*weight/height/height;
		condition();
		System.out.println("Your BMI is "+ bmi + ".");
		System.out.println("You are "+ condition() + ".");
	}
	public static String condition()
	{
		if (bmi < 18.5)
			{return "underweight";}
		if (18.5 < bmi || bmi < 24.9)
			{return "normal";}
		if (25 < bmi || bmi < 29.9)
			{return "overweight";}
		if (29.9 < bmi || bmi < 34.9)
			{return "obese";}
		if (35 < bmi || bmi < 39.9)
			{return "very obese";}
		if (bmi > 39.9)
			{return "morbidly obese";}
		return "";
	}
}