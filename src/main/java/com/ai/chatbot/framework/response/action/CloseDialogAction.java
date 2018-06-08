package com.ai.chatbot.framework.response.action;

import com.ai.chatbot.framework.response.Message;
import com.ai.chatbot.framework.response.ResponseCard;

public class CloseDialogAction extends DialogActionDetails {

	/**
	 * Fulfilled or Failed
	 */
	private String fulfillmentState = null;
	
	public CloseDialogAction(String fulfillmentState) {
    	super(CLOSE);
    	if (fulfillmentState == null) {
            throw new IllegalArgumentException("Fulfillment Status is required");
        }
    	this.fulfillmentState = fulfillmentState;
    }

    public CloseDialogAction(String fulfillmentState, Message message) {
        this(fulfillmentState);
        this.message = message;
    }
    
    public CloseDialogAction(String fulfillmentState, ResponseCard responseCard) {
        this(fulfillmentState);
        this.responseCard = responseCard;
    }

    public CloseDialogAction(String fulfillmentState, Message message, ResponseCard responseCard) {
        this(fulfillmentState, message);
        this.responseCard = responseCard;
    }

	public String getFulfillmentState() {
		return fulfillmentState;
	}
}