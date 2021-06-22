package javaStudies;

/**
 * This class illustrate the rules followed by Java when it comes to passing arguments to function <br>
 * Arguments in Java are <strong>always</strong> passed by value, even when it comes to a reference for an object.
 * Because of that, changing a reference for an object passed to a function <strong>does not</strong> change the reference
 * of the object <em>outside</em> the function, as the parameter in the function is just a mere variable which
 * holds a copy of the reference, and, beside, is not the main reference to the object itself as such a reference
 * is held in a variable outside the function. <br>
 * @author davide
 * @version 1.0
 */
public class reassignReference
{

	public static void main(String[] args)
	{
		int[] mainArray = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		System.out.println("Values of the array in main function:");
		printArray(mainArray);
		System.out.println("Now calling reassignment function...");
		reassignArrayReference(mainArray);
		System.out.println("Values of the array in main function after calling the reassignment function:");
		printArray(mainArray);
	}
	
	public static void reassignArrayReference(int[] copyOfReference)
	{
		int[] localArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("----------- Entering Reassignment Function --------------");
		System.out.println("Passed array elements:");
		printArray(copyOfReference);
		System.out.println("Local array elements:");
		printArray(localArray);
		System.out.println("Now overwriting passed array reference with local array reference...");
		copyOfReference = localArray;
		System.out.println("Passed array elements after overwriting reference:");
		printArray(copyOfReference);
		System.out.println("----------- Exiting Reassignment Function ---------------");
	}
	
	public static void printArray(int[] toPrint)
	{
		for(int elem : toPrint)
		{
			System.out.printf("%d\t", elem); //print each element separated by a tab
		}
		
		System.out.print('\n'); //print newline
	}

}
