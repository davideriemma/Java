/**
 * 
 */
package javaStudies;
import static java.lang.System.*;
/**
 * This is the test class for the Static Initialization test. Refer to {@link StaticKeywordInitialization}
 * for details of this study
 * @author davide
 * @see StaticKeywordInitialization
 */
public class SKITest
{

	/**
	 * This method simply creates an object of the {@link StaticKeywordInitialization} class, then
	 * modifies the static variable, creates another object of the above class and shows that the 
	 * value of its copy of the static variable is not reverted back to 23, but start with the current, 
	 * modified value
	 * @param args usual command line arguments
	 */
	public static void main(String[] args)
	{
		StaticKeywordInitialization instance1 = new StaticKeywordInitialization();
		out.println(instance1.getStaticInizializedVariable());
		instance1.setStaticInitializedVariable(24);
		out.println(instance1.getStaticInizializedVariable());
		StaticKeywordInitialization instance2 = new StaticKeywordInitialization();
		out.println(instance2.getStaticInizializedVariable());

	}

}
