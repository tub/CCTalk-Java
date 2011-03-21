package com.buildbrighton.cctalk;

import org.junit.Test;


public class ChecksumMessageParserTest {
	
	@Test
	public void testParseMessage() throws InvalidMessageException{
		ChecksumMessageParser mp = new ChecksumMessageParser();
		mp.parseMessage(new byte[]{0x00, 0x01, 0x02, 0x03});
	}
}
