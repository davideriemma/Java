package javaStudies;

import javaStudies.*;

public class Test
{
	public static void main(String[] args)
	{
		Superclass original, reference;
		Subclass originalSubclass;
		
		original = new Superclass("Davide", "Riemma");
		originalSubclass = new Subclass("Davide", "Riemma", "in a Movie");
		
		System.out.println(original);
		System.out.println(originalSubclass);
		
		//now assigning subclass reference to superclass variable
		
		reference = originalSubclass;
		
		//should behave like its superclass and print out just the name and the surname.
		
		System.out.println(reference);
		
		//ED IN VECE NO!!
		/*
		 * it behaves like a member of the sublcass, also printing information about the city.
		 * This happens because the call reference.toString() refers to originalSubclass.toString(), 
		 * which is an overridden method which, in turn refers to super.toString() + cityName. */
	}
}
