package com.buildbrighton.cctalk.interfaces;

import com.buildbrighton.cctalk.CCTalkMessage;

public interface CCTalkListener {
	public void messageReceived(CCTalkMessage message);
}
