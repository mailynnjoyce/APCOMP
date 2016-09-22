import java.util.Scanner;

public class Lesson_04d
{
	public static void main(String[]args)
	{
		Lesson_04d calc = new Lesson_04d();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter height:");
		int h = kb.nextInt();
		System.out.println("Enter length:");
		int l = kb.nextInt();
		System.out.println("Enter width");
		int w = kb.nextInt();
		
		int subwoofer = calc.volume(h, l , w);
		double subwooferVol = 0.000578704*subwoofer;
		System.out.printf("The volume is %5.2f\n", subwooferVol);

	}
	
	public int volume(int h, int l, int w)
	{
		return h*l*w;
	}

}