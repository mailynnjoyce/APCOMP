public class ToyRunnner
{
	public static void main(String[]args)
	{
		AFigure object = new AFigure("Deadpool");
		
		Car object2 = new Car("BMW");
		
		ToyStore store = new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		
		System.out.println(store.toString());
		System.out.println("Most Frequent Toy:             " + store.getMostFrequentToy());
		System.out.println("Most Frequent Type of Toy:     " + store.getMostFrequentType());
	}
}