package javaStudies;

public interface Pluggable 
{
	public final int INTERFACE_ID = 1;
	/**
	 * Sends a message to the connected object
	 * @param code
	 * @return
	 */
	boolean sendMessage(int code);
	
	/**
	 * Receives a message form the connected object
	 * @return
	 */
	int receiveMessage();
}
