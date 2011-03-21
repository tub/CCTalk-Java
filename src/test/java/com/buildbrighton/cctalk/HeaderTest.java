package com.buildbrighton.cctalk;

import static org.junit.Assert.*;

import org.junit.Test;

public class HeaderTest {

	@Test
	public void testToString() {
		assertEquals(Header.ReturnMessage.toString(), "ReturnMessage(00000000)");
		assertEquals(Header.ResetDevice.toString(), "ResetDevice(00000001)");
		assertEquals(Header.FactorySetUpAndTest.toString(), "FactorySetUpAndTest(11111111)");
	}
	
	@Test
	public void testValueOf(){
		byte value = Header.ConfigurationToEeprom.getValue();
		assertEquals(Header.valueOf(value), Header.ConfigurationToEeprom);
	}

}
