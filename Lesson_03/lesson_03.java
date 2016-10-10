import java.util.Scanner;

public class lesson_03
{
	public static void main (String[]args)
	{
		System.out.println("RUDE AI");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hi my name is RudeAI.");
		System.out.println("I'd like to ask you a few questions.");
		System.out.println("What is your name? ");
		String name = keyboard.nextLine();
		System.out.println(name + "? Really, that's your name? Wow.");
		System.out.println("How old are you, " + name + "? ");
		int age = keyboard.nextInt();
		System.out.println(age + " is getting up there.");
		keyboard.nextLine();
		System.out.println("What do you do for fun, " + name + "? ");
		String fun = keyboard.nextLine();
		System.out.println(fun + "? How lame.");
		System.out.println("What kind of music do you like, " + name + "? ");
		String music = keyboard.nextLine();
		System.out.println("Ew "+ music+ ".");
		System.out.println("How many siblings do you have, " + name + "? ");
		int sib = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Oh "+ sib + "? Your family must LOVE you. lmao.");
		System.out.println("What do you want to be when you're older, " + name + "? ");
		String job = keyboard.nextLine();
		System.out.println(job + "? Good luck with that! I think you need to be smarter for that.");

	}
}