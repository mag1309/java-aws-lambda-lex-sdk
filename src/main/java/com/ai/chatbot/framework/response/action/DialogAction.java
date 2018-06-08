package com.ai.chatbot.framework.response.action;

/**
 * This abstract class will be used by other DialogAction classes
 * @author Manish
 *
 */
public abstract class DialogAction {

    /**
     * This attribute will define DialogAction type i.e.
     * "Close","ConfirmIntent","Delegate","ElicitIntent","ElicitSlot"
     */
	public static final String FULFILLED_STATE = "Fulfilled";
    public static final String FAILED_STATE = "Failed";
    public static final String ELICITINTENT = "ElicitIntent";
    public static final String ELICITSLOT = "ElicitSlot";
    public static final String CONFIRM = "ConfirmIntent";
    public static final String DELEGATE = "Delegate";
    public static final String CLOSE = "Close";
	private String type = null;
    
    public DialogAction(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }   
}