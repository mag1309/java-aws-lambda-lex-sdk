package com.ai.chatbot.framework.request;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class LexRequest {
	
	Intent currentIntent;
	Bot bot;
	String userId;
	String inputTranscript;
	String invocationSource;
	String outputDialogMode;
	String messageVersion;
    Map<String, String> sessionAttributes;
    Map<String, String> requestAttributes;
    
	public String getMessageVersion() {
        return messageVersion;
    }

    public void setMessageVersion(String messageVersion) {
        this.messageVersion = messageVersion;
    }
    
    public Map<String, String> getRequestAttributes() {
		return requestAttributes;
	}

	public void setRequestAttributes(Map<String, String> requestAttributes) {
		this.requestAttributes = requestAttributes;
	}

    public String getInvocationSource() {
        return invocationSource;
    }

    public void setInvocationSource(String invocationSource) {
        this.invocationSource = invocationSource;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Map<String, String> getSessionAttributes() {
        return sessionAttributes;
    }

    public void setSessionAttributes(Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    public Bot getBot() {
        return bot;
    }

    public void setBot(Bot bot) {
        this.bot = bot;
    }

    public String getOutputDialogMode() {
        return outputDialogMode;
    }

    public void setOutputDialogMode(String outputDialogMode) {
        this.outputDialogMode = outputDialogMode;
    }

    public Intent getCurrentIntent() {
        return currentIntent;
    }

    public void setCurrentIntent(Intent currentIntent) {
        this.currentIntent = currentIntent;
    }

    public String getInputTranscript() {
        return inputTranscript;
    }

    public void setInputTranscript(String inputTranscript) {
        this.inputTranscript = inputTranscript;
    }

    @Override
    public String toString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }
    
    public static LexRequest fromJson(byte[] requestJson) throws Exception {
        return new ObjectMapper().readValue(requestJson, LexRequest.class);
    }

}