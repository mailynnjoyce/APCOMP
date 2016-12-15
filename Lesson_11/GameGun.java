import java.util.Scanner;

public class GameGun
{
	   public static int bulletCount = 96;
	   public static int CLIPSIZE = 16;
	   public static int shotCount = 0;
	   public static String[] clip = new String[0];
	
	public static void main(String[]args)
	{
		bulletCount = 96;
		shotCount = 0;
		clip = new String[CLIPSIZE];
		
	    resetClip();
	   
	    while (bulletCount > 0 || shotCount > 0)
	    {
		  Scanner kb = new Scanner(System.in);
		  System.out.println("Action (R = Reload) (S = Shoot):");
		  String action = kb.nextLine();
		  
		  if (action.equals("R") || action.equals("r"))
		  {
			  reload();
		  }
		  
		  if (action.equals("S") || action.equals("s"))
		  {
			  shoot();
		  }
		  
		  printClip();
	    }
	   
	    System.out.println("Out of Bullets!!!!");
	}
	
	public static void resetClip()
	{
		for (int i = 0; i < clip.length; i++)
		{
			clip[i] = "[]";
		}
	}
	
	public static void shoot()
	{
		if (shotCount > 0)
		{
			clip[shotCount-1] = "[]";
			shotCount -= 1;
			System.out.println("Boom!");
		}
		else
			System.out.println("Reload!!!");
	}
	
	public static void reload()
	{
		bulletCount = bulletCount - 16;
		shotCount += 16;
			
		resetClip();
		for (int i = 0; i < shotCount; i++)
		{
			clip[i] = " * ";
		}
	}
	
	public static void printClip()
	{
		String output = "Bullets:\t" + bulletCount + "\n" + "Clip:\t";
		
		for (int i = 0; i < 16; i++)
		{
			output += clip[i];
		}
		
		System.out.println(output);
	}
}