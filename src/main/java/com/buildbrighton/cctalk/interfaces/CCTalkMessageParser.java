package com.buildbrighton.cctalk.interfaces;

import com.buildbrighton.cctalk.CCTalkMessage;
import com.buildbrighton.cctalk.InvalidMessageException;

public interface CCTalkMessageParser {
	public CCTalkMessage parseMessage(byte[] message) throws InvalidMessageException;
}
