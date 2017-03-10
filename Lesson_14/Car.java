import java.util.ArrayList;

abstract class Car implements Location
{
   public static void main(String[]args)
   {
       ArrayList<Location> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new Honda(honLoc));
       locate.add(new Toyota("8, 9"));
       locate.add(new GMC(3, 8));


       double[] home = {0, 0};
	   
	   int hondaID = locate.get(0).getID();
	   int toyotaID = locate.get(1).getID();
	   int gmcID = locate.get(2).getID();
	   
	   double[] hondaLoc = locate.get(0).getLoc();
	   double[] toyotaLoc = locate.get(1).getLoc();
	   double[] gmcLoc = locate.get(2).getLoc();
	   
	   double[] hondaMove = {(int)(Math.random()*100), (int)(Math.random()*100)};
	   double[] toyotaMove = {(int)(Math.random()*100), (int)(Math.random()*100)};
	   double[] gmcMove = {(int)(Math.random()*100), (int)(Math.random()*100)};
	   
       String printout = "==========================" + "\nStarting locations...";


       printout += "\n  Location for " + hondaID + ": (" + getLocation(hondaLoc) + ")";
	   printout += "\n  Location for " + toyotaID + ": (" + getLocation(toyotaLoc) + ")";
	   printout += "\n  Location for " + gmcID + ": (" + getLocation(gmcLoc) + ")";


       printout += "\n\n" + "==========================" +
                   "\nDistance from home...";
				   
				   
       printout += "\n  Distance for " + hondaID + ": (" + getDistance(hondaLoc, home)+ ")";
	   printout += "\n  Distance for " + toyotaID + ": (" + getDistance(toyotaLoc, home)+ ")";
	   printout += "\n  Distance for " + gmcID + ": (" + getDistance(gmcLoc, home)+ ")";
	   
	   
	   printout += "\n\n" + "==========================";


       printout += "\nAfter " + hondaID + " Moved: (" + getLocation(hondaMove) + ")";
	   printout += "\nNew Location: (" + getNewLocation(hondaLoc, hondaMove) + ")";
	   
	   printout += "\n\nAfter " + toyotaID + " Moved: (" + getLocation(toyotaMove) + ")";
	   printout += "\nNew Location: (" + getNewLocation(toyotaLoc, toyotaMove) + ")";
	   
	   printout += "\n\nAfter " + gmcID + " Moved: (" + getLocation(gmcMove) + ")";
	   printout += "\nNew Location: (" + getNewLocation(gmcLoc, gmcMove) + ")";
	   
	   printout += "\n\n" + "==========================" +
                   "\nNew distance from home...";
				   
				   
       printout += "\n  Distance for " + hondaID + ": (" + getNewDistance(hondaLoc, home, hondaMove)+ ")";
	   printout += "\n  Distance for " + toyotaID + ": (" + getNewDistance(toyotaLoc, home, toyotaMove)+ ")";
	   printout += "\n  Distance for " + gmcID + ": (" + getNewDistance(gmcLoc, home, gmcMove)+ ")";


       System.out.println(printout);
   }


   public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }


   public static String getLocation(double[] loc)
   {
       return loc[0] + ", " + loc[1];
   }
   
   public static double getNewDistance(double[] car, double[] home, double[] move)
   {
       return Math.sqrt((Math.pow((car[0] + move[0]) - home[0], 2)+ Math.pow((car[1] + move[1]) - home[1], 2)));
   }
   
   public static String getNewLocation(double[] loc, double[] move)
   {
       return (loc[0] + move[0]) + ", " + (loc[1] + move[1]);
   }
}