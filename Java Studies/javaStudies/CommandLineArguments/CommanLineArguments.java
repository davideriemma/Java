package javaStudies;

/**
 * The CommandLineArguments class demonstrate the use of command line arguments in java. <br>
 * It specifically answers the questions "Is the name of the program a command-line argument itself, as it is in
 * C/C++?"
 * @author davide
 * @version 1.0
 */
public class CommanLineArguments
{
	/**
	 * Entry point of the program, it answers the question(s) asked in the documentation of the classe
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.printf("Number of Command-line arguments: %d%n", args.length);
		
		System.out.println("Command-line arguments: ");
		for(String element : args)
		{
			System.out.println(element);
		}
	}

}
