package javaStuides;

import java.util.Arrays;

/***
 * This class behaves as a simple class for checking wether a module for registering a username is able
 * to check and throw an error if the name is already present in the list.
 * @author davide
 *
 */
public class JUnitTestSubjectClass
{
	private String[] usernames = {"dave", "annarl", "kira"};
	
	public JUnitTestSubjectClass(String username)
	{
		Arrays.sort(usernames);
		if(Arrays.binarySearch(usernames, username) < 0)
		{
			System.out.println("Key valid: " + username);
		}
		else
		{
			System.out.println("Username already present: " + username);
		}
	}
	
	@Override
	public String toString()
	{
		return Arrays.toString(usernames);
	}
}
