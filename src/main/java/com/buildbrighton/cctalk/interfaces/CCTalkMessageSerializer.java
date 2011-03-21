package com.buildbrighton.cctalk.interfaces;

import com.buildbrighton.cctalk.CCTalkMessage;

public interface CCTalkMessageSerializer {
	public byte[] serialize(CCTalkMessage message);
}
