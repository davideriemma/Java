package mainPackageShit;

import mainPackageShit.TestClass;

public class JavaFinalKeywordTest 
{

	public static void main(String[] args) 
	{
		
		TestClass shitJesus = new TestClass();
		TestClass porcaMadonna = new TestClass();
		
		shitJesus.ModifyTest(50);
		System.out.println("Value of the static var is " + porcaMadonna.GetTest());
		System.out.println("La madonna zoccola modifica il valore...");
		porcaMadonna.ModifyTest(100);
		System.out.println("Gesù a pecora dice che il valore inculato è " + shitJesus.GetTest());
		
		System.out.println("Abbiamo così dimostrato che un valore 'static' modificato in unca classe "
				+ "protrae le sue modifiche in tutte le altre istanze della classe. porcamadonna");
	}

}
