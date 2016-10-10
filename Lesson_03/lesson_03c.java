import java.util.Scanner;

public class lesson_03c
{
	public static void main (String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("AREA CALCULATOR");
		System.out.println("What is the length? ");
		int l = keyboard.nextInt();
		System.out.println("What is the width? ");
		int w = keyboard.nextInt();
		int area = l*w;
		System.out.println("The area is "+ area + ".");
	}
}