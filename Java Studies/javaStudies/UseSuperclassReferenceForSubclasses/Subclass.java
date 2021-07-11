package javaStudies;

public class Subclass extends Superclass
{
	private String cityName;
	
	public Subclass(String name, String surname, String city)
	{
		super(name, surname);
		cityName = city;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + ", living in " + cityName; 
	}
}
