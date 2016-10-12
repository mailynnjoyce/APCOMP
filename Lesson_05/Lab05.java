import java.util.Scanner;

public class Lab05
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter class 1 letter grade:");
		String class1 = kb.next();
		System.out.println("Please enter class 2 letter grade:");
		String class2 = kb.next();
		System.out.println("Please enter class 3 letter grade:");
		String class3 = kb.next();
		System.out.println("Please enter class 4 letter grade:");
		String class4 = kb.next();
		System.out.println("Please enter class 5 letter grade:");
		String class5 = kb.next();
		System.out.println("Please enter class 6 letter grade:");
		String class6 = kb.next();
		System.out.println("Please enter class 7 letter grade:");
		String class7 = kb.next();
		double gpa = (calcPoints(class1)+calcPoints(class2)+calcPoints(class3)+calcPoints(class4)+calcPoints(class5)+calcPoints(class6)+calcPoints(class7))/7;
		System.out.println("Your GPA is " + gpa);
	}
	
	public static double calcPoints(String grade)
	{
		if (grade.equals("AA"))
			{return 5.0;}
		if (grade.equals("A"))
			{return 4.0;}
		if (grade.equals("B"))
			{return 3.0;}
		if (grade.equals("C"))
			{return 2.0;}
		if (grade.equals("D"))
			{return 1.0;}
		if (grade.equals("F"))
			{return 0.0;}
		return 0.0;
	}

}