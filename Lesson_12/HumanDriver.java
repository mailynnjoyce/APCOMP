import java.util.Scanner;
public class HumanDriver
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter hair: ");
		String hair = kb.nextLine();
		System.out.println("Please enter eyes: ");
		String eyes = kb.nextLine();
		System.out.println("Please enter skin: ");
		String skin = kb.nextLine();
		
		Human object = new Human(hair, eyes, skin);
		
		System.out.println("Info:");
		System.out.println("Hair:    " + object.getHair());
		System.out.println("Eyes:    " + object.getEyes());
		System.out.println("Skin:    " + object.getSkin());
		
		Human object2 = new Human("dirty blonde", "blue", "white");
		
		System.out.println("Info:");
		System.out.println("Hair:    " + object2.getHair());
		System.out.println("Eyes:    " + object2.getEyes());
		System.out.println("Skin:    " + object2.getSkin());
	}
}