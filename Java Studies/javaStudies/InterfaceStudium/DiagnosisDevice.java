package javaStudies;

public class DiagnosisDevice implements Pluggable
{
	private final int DeivceID = 3;
	
	@Override
	public boolean sendMessage(int code) 
	{
		System.out.println("device ID: " + DeivceID + " Printing code: " + code);
		return true;
	}
	
	@Override
	public int receiveMessage()
	{
		return 12;
	}
}
