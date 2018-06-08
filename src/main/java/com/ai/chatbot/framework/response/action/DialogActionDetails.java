package com.ai.chatbot.framework.response.action;

import com.ai.chatbot.framework.response.Message;
import com.ai.chatbot.framework.response.ResponseCard;

/**
 * This abstract class will be used by other DialogAction classes 
 * except DelegateDialogAction
 * @author Manish
 *
 */
public abstract class DialogActionDetails extends DialogAction {

    protected Message message;
    protected ResponseCard responseCard;
    
    public DialogActionDetails(String type) {
        super(type);
    }

    public Message getMessage() {
        return message;
    }

    public ResponseCard getResponseCard() {
        return responseCard;
    }

}