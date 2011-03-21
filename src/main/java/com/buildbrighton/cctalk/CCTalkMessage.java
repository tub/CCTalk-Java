package com.buildbrighton.cctalk;

import java.util.Arrays;


public class CCTalkMessage {
	protected byte[] data;
	protected byte dest;
	protected Header header;
	protected byte source;

	public byte getDest() {
    	return dest;
    }

	public byte[] getData() {
    	return data;
    }

	public Header getHeader() {
    	return header;
    }

	public byte getSource() {
    	return source;
    }

	public void setDest(byte dest) {
		this.dest = dest;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public void setSource(byte source) {
		this.source = source;
	}

	@Override
    public String toString() {
	    return "CCTalkMessage [data=" + Arrays.toString(data) + ", dest="
	            + dest + ", header=" + header + ", source=" + source + "]";
    }

}
