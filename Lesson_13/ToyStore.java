import java.util.ArrayList;

public class ToyStore {
	
    private ArrayList<Toy> toyList = new ArrayList<>();
	
	public ToyStore()
	{
		loadToys("none");
	}
	
    public ToyStore(String toyList) 
	{
		
        loadToys(toyList);
		
	}
    
	
    public void loadToys(String ts) {
		
        String[] toys = ts.split(", ");
		toyList = new ArrayList<Toy>();
		
        for(int i = 0 ; i < toys.length; i+=2)
		{
            String name = toys[i];
            String type = toys[i+1];
			Toy object3 = (getThatToy(name));
			
			if(getThatToy(name) == null)
			{
				if(type.equals("Car")) 
				{
					toyList.add(new Car(name));	
				}
				if(type.equals("AF"))
				{
					toyList.add(new AFigure(name));
				}
			}
			else
				{
					getThatToy(name).addCount();
				}
        }
    }
	
    public Toy getThatToy(String nm) {
		
        for(Toy t : toyList) 
		{
            if(t.getName().equals(nm)) 
			{
                return t;
            }
        }
        return null;
    }
	
    public String getMostFrequentToy() 
	{
        String name = "";
        int max = Integer.MIN_VALUE;
		
        for(Toy t : toyList) {
			
            if(max < t.getCount()) {
				
                max = t.getCount();
                name = t.getName();
				
            }
        }
        return name;
    }
	
    public String getMostFrequentType() {
		
        int cars = 0;
		int figures = 0;
		
        for(Toy t : toyList) 
		{
			if(t.getType().equals("Car"))
			{
				cars += 1;
			}
			if(t.getType().equals("AF"))
			{
				figures += 1;
			}
        }
        if(cars > figures) {
			
            return "Cars";
			
        }
        else if(figures > cars) {
			
            return "Action figures";
			
        }
        else {
			
            return "Equal amounts of action figures and cars";
			
        }
    }
    public String toString() {
		
        return toyList.toString();
		
    }
}