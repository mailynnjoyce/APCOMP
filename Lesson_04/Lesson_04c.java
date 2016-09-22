import java.util.Scanner;

public class Lesson_04c
{
	public static void main(String[]args)
	{
		Lesson_04c calc = new Lesson_04c();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter interest rate:");
		double r = kb.nextDouble();
		System.out.println("Enter principal or original amount:");
		double p = kb.nextDouble();
		System.out.println("Enter number of times the loan is compounded per year:");
		int n = kb.nextInt();
		System.out.println("Enter life of loan in years:");
		double t = kb.nextDouble();
		
		double totalLoan = calc.compoundInterest(r, p, n, t);
		System.out.printf("Your total loan is %10.2f\n", totalLoan);
		double payment = calc.monthly(totalLoan, t);
		System.out.printf("Your total monthly payment is %10.2f\n", payment);

	}
	
	public double compoundInterest(double r, double p, int n, double t)
	{
		return p * Math.pow((1+(r/n)), n*t);
	}
	
	public double monthly(double totalLoan, double t)
	{
		return totalLoan/(t*12);
	}
}