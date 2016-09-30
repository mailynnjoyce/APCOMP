public class Lesson_02
{
	public static void main(String[]args)
	{
		//Multiplication
		int x = 5;
		int y = 2;
		int product = x*y;
		
		System.out.println(x + " multiplied by " + y + " is " + product);
		
		//Concatenation
		String  name = "Mailynn Joyce Evangelista";
		String  address= "4180 Via Candidiz #178";
		String  city= "San Diego, CA";
		String  zip= "92130";
		
		System.out.println(name);
		System.out.println(address);
		System.out.println(city + " " + zip);
		
		//Complex Calculation
		int l = 3;
		int h = 4;
		int w = 5;
		int surfaceArea = 2*((w*l)+(h*l)+(h*w));
		
		System.out.println("The surface area of your rectangle is "+ surfaceArea);
		
		
	}
}