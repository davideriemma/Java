package javaStudies;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiagnosisDeviceTest
{

	DiagnosisDevice dev = new DiagnosisDevice();
	
	@Test
	void testSendMessage()
	{
		if(dev.sendMessage(12) != true)
		{
			fail("Error Sending Message");
		}
	}

	@Test
	void testReceiveMessage()
	{
		if(dev.receiveMessage() < 0)
		{
			fail("Error Receiving message");
		}
	}

}
