package com.ai.chatbot.framework.response;


import java.util.HashMap;
import java.util.Map;

import com.ai.chatbot.framework.response.action.DialogAction;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LexResponse {
    
	private Map<String, String> sessionAttributes;
    private DialogAction dialogAction;

    public LexResponse() { }

    public LexResponse(DialogAction dialogAction) {
        this.dialogAction = dialogAction;
    }

    public LexResponse(DialogAction dialogAction, Map<String, String> sessionAttributes) {
        this(dialogAction);
        this.sessionAttributes = sessionAttributes;
    }

    public DialogAction getDialogAction() {
        return dialogAction;
    }

    public void setDialogAction(DialogAction dialogAction) {
        this.dialogAction = dialogAction;
    }

    public Map<String, String> getSessionAttributes() {
        return sessionAttributes;
    }

    public void setSessionAttributes(Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    public void addAttribute(String k, String v) {
        if (sessionAttributes == null) {
            sessionAttributes = new HashMap<String, String>();
        }
        sessionAttributes.put(k, v);
    }

    public void clearAttributes() {
        if (sessionAttributes != null) {
            sessionAttributes.clear();
        }
    }
    
    public byte[] toJson() throws Exception {
        return new ObjectMapper().writeValueAsBytes(this);
    }
}