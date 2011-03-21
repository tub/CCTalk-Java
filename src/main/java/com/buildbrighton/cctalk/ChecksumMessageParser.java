package com.buildbrighton.cctalk;

import java.util.Arrays;

import com.buildbrighton.cctalk.interfaces.CCTalkMessageParser;

public class ChecksumMessageParser implements CCTalkMessageParser {

	@Override
	public CCTalkMessage parseMessage(byte[] message)
	        throws InvalidMessageException {
		if (message == null || message.length < 2) {
			throw new InvalidMessageException(
			        "Message was less than two bytes long, therefore did not contain a data length byte");
		}
		//Convert unsigned byte to signed
		int dataLength = (int) (message[1] & 0xFF);
									// data + source, destination, checksum, numBytes, header
		int expectedMessageLength = dataLength + 5;
		
		if(message.length < expectedMessageLength){
			throw new InvalidMessageException("Message was shorter than expected length of "+expectedMessageLength+" bytes");
		}

		int sum = 0;
		for(int i = 4; i < expectedMessageLength; i++){
			sum += (message[i] & 0xff);
		}
		if(sum % 256 != 0){
			throw new InvalidMessageException("Invalid checksum result");
		}
		
		CCTalkMessage ccMessage = new CCTalkMessage();
		ccMessage.setDest(message[0]);
		ccMessage.setSource(message[2]);
		ccMessage.setHeader(Header.valueOf(message[3]));
		ccMessage.setData(Arrays.copyOfRange(message, 4, expectedMessageLength - 1));
		
		return ccMessage;
	}
}
