package Beautifier;

import java.util.Scanner;

/**
 * This class implements a simple method to "beautify" a string by Capitalizing it and adding a trailing period.
 * @author davide
 * @version 1.0
 * @since 1.0
 */
public class BeautifyStrings {

	/**
	 * Test Drive the BeautifyString class
	 * @param args command line arguments (not needed here)
	 */
	public static void main(String[] args) 
	{
		Scanner inputStrings = new Scanner(System.in);
		
		System.out.print("Please, input the string to beautify: ");
		
		String stringRed = inputStrings.nextLine();
		
		System.out.println("The string you entered is: " + stringRed);
		System.out.println("beautified string: " + beautifyString(stringRed));
		
		inputStrings.close();
	}
	
	/**
	 * Tests if the first letter of the string is a capital letter. <br>  
	 * If not, the string is capitalized, otherwise the string given as argument is returned. 
	 * @param toCapitalize the string to capitalize
	 * @return the capitalized string, or the string given as argument if this string is already capitalized.
	 */
	private static String setCapitalLetter(String toCapitalize)
	{
		String retval = toCapitalize;
		
		if(retval.charAt(0) != Character.toUpperCase(retval.charAt(0)))
		{
			retval = Character.toUpperCase(retval.charAt(0)) + retval.substring(1);
		}
		
		return retval;
	}
	
	/**
	 * Tests if the string ends with a full stop.<br>
	 * If not, a trailing full stop is added to the string, otherwise the string given as argument is returned.
	 * @param toSetFullStop the string to append the period to
	 * @return the string with a trailing period added, or the string given as argument if the string already terminates with a period
	 */
	private static String setFullStop(String toSetFullStop)
	{
		String retval = toSetFullStop;
		
		if(!retval.endsWith(".")) //do i have to explicitly set != true
		{
			retval = retval + ".";
		}
		
		return retval;
	}
	
	public static String beautifyString(String toBeautify)
	{
		return setCapitalLetter(setFullStop(toBeautify));
	}

}
