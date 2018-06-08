package com.ai.chatbot.framework.response.action;

import com.ai.chatbot.framework.response.Message;
import com.ai.chatbot.framework.response.ResponseCard;

public class ElicitIntentDialogAction extends DialogActionDetails {

	public ElicitIntentDialogAction() {
    	super(ELICITINTENT);
    }

	public ElicitIntentDialogAction(Message message) {
    	this();
		this.message = message;
    }
	
	public ElicitIntentDialogAction(ResponseCard responseCard) {
    	this();
		this.responseCard = responseCard;
    }
	
	public ElicitIntentDialogAction(Message message, ResponseCard responseCard) {
		this();
		this.message = message;
		this.responseCard = responseCard;
	}
}