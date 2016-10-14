import java.util.Scanner;

public class Adventure
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("You are stressed and want to stay home for a day. Do you:\n1. Pretend to be sick\n2. Tell your parents the truth\n");
		int option1 = kb.nextInt();
		
		
		
		if (option1 == 1){
			System.out.println("You decide to pretend to be sick. Do you:\n1. Make fake vomit\n2. Cough and complain you don't feel well\n");
			int option2a = kb.nextInt();
			if (option2a == 1){
				System.out.println("When you go to make fake vomit, you mainly use:\n1. Oatmeal with ketchup\n2. Your baby sister's food with last night's leftovers\n");
				int option3a = kb.nextInt();
				if (option3a == 1)
					{System.out.println("You use oatmeal and ketchup. Parents mistake the ketchup for blood.\nYou are rushed to the emergency room. The end.");
					System.exit(0);}
				if (option3a == 2)
					{System.out.println("You use the baby food and last night's leftovers.Your parents let\nyou stay home. The end.");
					System.exit(0);}
				System.out.println("You must have spelled something wrong. It's either 1 or 2.");
				System.exit(0);
			}
			if (option2a == 2){
				System.out.println("You pretend to cough and you complain you don't feel well to your parents. They want to take your\ntemperature with a thermometer. Do you:\n1. Stick it under hot water\n2. Try to warm it with your breathe\n");
				int option3b = kb.nextInt();
				if (option3b == 1)
					{System.out.println("You stick it under hot water and the temperature is 103 degrees.\nYour parents let you stay home. The end.");
					System.exit(0);}
				if (option3b == 2)
					{System.out.println("You try and warm it with your breathe. It fails to rise the \ntemperature. You are forced to go to school. The end.");
					System.exit(0);}
				System.out.println("You must have spelled something wrong. It's either 1 or 2.");
				System.exit(0);
			}
			System.out.println("You must have spelled something wrong. It's either 1 or 2.");
			System.exit(0);
		}
			
			
			
			
		if (option1 == 2){
			System.out.println("You decide to tell your parents the truth. They refuse. Do you:\n1. Tell them you aren't prepared for a test that you've studied for\n2. Beg them to let you stay home\n");
			int option2b = kb.nextInt();
			if (option2b == 1){
				System.out.println("You tell you aren't prepared for a test that you studied for. They still refuse. Do you\n1. Cry and plead\n2. Give up and go to school\n");
				int option3c = kb.nextInt();
				if (option3c == 1)
					{System.out.println("You cry and plead. Your parents don't care. You go to school in\na terrible mood. The end.");
					System.exit(0);}
				if (option3c == 2)
					{System.out.println("You give up and go to school. You have a terrible day. The end.");
					System.exit(0);}
				System.out.println("You must have spelled something wrong. It's either 1 or 2.");
				System.exit(0);
			}
			if (option2b == 2){
				System.out.println("You beg them to let you stay home. They ask you why. Do you:\n1. Tell them you are stressed\n2. Tell them you have trouble with a teacher when you don't\n");
				int option3d = kb.nextInt();
				if (option3d == 1)
					{System.out.println("You tell them that you are stressed. They don't care. You go to school. The end.");
					System.exit(0);}
				if (option3d == 2)
					{System.out.println("You tell them a lie about your teacher. Your parents call the school. The end.");
					System.exit(0);}
				System.out.println("You must have spelled something wrong. It's either 1 or 2.");
				System.exit(0);
			}
			System.out.println("You must have spelled something wrong. It's either 1 or 2.");
			System.exit(0);
		}
			
			
		
		System.out.println("You must have spelled something wrong. It's either 1 or 2.");
		System.exit(0);
		
		
	}
}