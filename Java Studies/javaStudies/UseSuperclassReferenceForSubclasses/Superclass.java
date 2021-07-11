package javaStudies;

public class Superclass
{
	
	protected String name, surname;
	
	public Superclass(String name, String surname)
	{
		this.name = name;
		this.surname = surname;
	}
	
	@Override
	public String toString()
	{
		return "ID: " + name + " " + surname;
	}
}
