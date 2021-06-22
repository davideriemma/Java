package mainPackageShit;

public class TestClass 
{
	private static int testVar;
	
	public TestClass()
	{
		testVar = 0;
	}
	
	public void ModifyTest(int value)
	{
		testVar = value;
	}
	
	public int GetTest()
	{
		return testVar;
	}
}
