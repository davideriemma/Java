/**
 * 
 */
package javaStudies;

/**
 * The purpose of this class is to provide a static class-wide variable initialized to a certain
 * value. The aim is to prove that a static variable in a class is always intialized once 
 * to the specified value, as soon as the first instance of such class is created.
 * @author davide
 *
 */
public class StaticKeywordInitialization
{
		
	/*
	 * static initialized variable. This varible is set to 23 just once, as soon as the first
	 * instance of the class is created. This program shows that, 
	 * if this value is modified and then a new instance
	 * of this class is created, the value of the variable is not reverted back to 23 and
	 * the new instance starts its execution with the modified value.*/
	private static int staticInitializedVariable = 23;
	
	/***
	 * getter accessor for the static variable value.
	 * @return the static variable value
	 */
	public int getStaticInizializedVariable()
	{
		return staticInitializedVariable;
	}
	
	/***
	 * setter mutator for the static variable value
	 * @param value the new value to assign to the static variable
	 */
	public void setStaticInitializedVariable(int value)
	{
		staticInitializedVariable = value;
	}

}
