package com.buildbrighton.cctalk;

/**
 * Thrown when an invalid CCTalk message is encountered
 * @author tub
 */
public class InvalidMessageException extends Exception {
	
    private static final long serialVersionUID = -3258256268402518828L;
    
	private String message;
    
    public String getMessage() {
    	return message;
    }

	public InvalidMessageException(){
    	
    }
    
    public InvalidMessageException(String message){
    	this.message = message;
    }

	@Override
    public String toString() {
	    return "InvalidMessageException [message=" + message + "]";
    }

}
