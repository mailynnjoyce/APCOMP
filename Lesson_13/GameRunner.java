public class GameRunner{
	
	public static void main(String[]args)
	{
		XBox xbox = new XBox();
		PlayStation ps = new PlayStation();
		PC pc = new PC();
		
		System.out.println(xbox + "\n\n" + ps + "\n\n" + pc);
	}
}