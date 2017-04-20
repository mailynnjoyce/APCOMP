public class Toyota2 extends Car2
{	
	public Toyota2(String coordinates)
	{
		String[] parts = coordinates.split(",");
		loc[0] = Double.parseDouble(parts[0]);
		loc[1] = Double.parseDouble(parts[1]);
	}
}