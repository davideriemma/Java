/**
 * 
 */
package deitelJavaStudies;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

/**
 * @author davide
 *
 */
public class EliminateDuplicates
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		EliminateDuplicates eliminateEngine = new EliminateDuplicates();
		int[] myArray = eliminateEngine.inputArray(10);
		System.out.println("Array before duplicate elimination:");
		System.out.println(Arrays.toString(myArray));
		eliminateEngine.eliminateDuplicates(myArray);
		System.out.println("Array after duplicate elimination:");
		System.out.println(Arrays.toString(Arrays.stream(myArray).filter(x -> x != -1).toArray()));
	}
	
	public int[] inputArray(int size)
	{
		int[] array = new int[size];
		int dummyValueForDataValidation;
		Scanner arrayIn = new Scanner(System.in);
		
		/*initialize array with -1*/
		Arrays.fill(array, -1);
		
		for(int i = 0; i < array.length /*equal to size*/; ++i)
		{
			try
			{
				System.out.print("Enter an integer value between 10 and 100: ");
				dummyValueForDataValidation = arrayIn.nextInt();
				while(dummyValueForDataValidation < 10 || dummyValueForDataValidation > 100)
				{
					System.out.print("Please, enter an integer value between 10 and 100: ");
					dummyValueForDataValidation = arrayIn.nextInt();
				}
				
				array[i] = dummyValueForDataValidation;
				
			} catch (InputMismatchException e)
			{
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		
		arrayIn.close(); //avoid resource leak
		return array;
	}

	public void eliminateDuplicates(int[] arrayToPurge)
	{
		int[] tempDuplicateArray = new int[arrayToPurge.length];
		Arrays.fill(tempDuplicateArray, -1); //initializes the array to a known state
		
		for(int i = 0; i < tempDuplicateArray.length; ++i)
		{
			if(linearSearch(tempDuplicateArray, arrayToPurge[i]) != -1) //duplicate found
			{
				arrayToPurge[i] = -1; //setta a -1 l'elemento
			}
			else
			{
				tempDuplicateArray[i] = arrayToPurge[i]; //copia l'elemento nell'array
			}
		}
	}
	
	private int linearSearch(int[] toSearch, int key)
	{
		int result = -1;
		
		for(int element : toSearch)
		{
			if(element == key) 
			{
				result = element;
			}
		}
		
		return result;
	}
}
