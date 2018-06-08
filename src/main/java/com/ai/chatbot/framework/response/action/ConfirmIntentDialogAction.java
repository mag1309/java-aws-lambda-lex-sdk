package com.ai.chatbot.framework.response.action;

import java.util.Collections;
import java.util.Map;

import com.ai.chatbot.framework.response.Message;
import com.ai.chatbot.framework.response.ResponseCard;

public class ConfirmIntentDialogAction extends DialogActionDetails {

    private final String intentName;
    private final Map<String,String> slots;

    public ConfirmIntentDialogAction(String intentName, Map<String,String> slots) {
        super(CONFIRM);
        if (intentName == null) {
            throw new IllegalArgumentException("Intent Name is required");
        }
        if (slots == null || !slots.isEmpty()) {
            throw new IllegalArgumentException("Slots are required");
        }
        this.intentName = intentName;
        this.slots = slots;
    }

    public ConfirmIntentDialogAction(String intentName, Map<String,String> slots, Message message) {
        this(intentName, slots);
        this.message = message;
    }
   
    public ConfirmIntentDialogAction(String intentName, Map<String,String> slots, ResponseCard responseCard) {
        this(intentName, slots);
        this.responseCard = responseCard;
    }

    public ConfirmIntentDialogAction(String intentName, Map<String,String> slots, Message message, ResponseCard responseCard) {
        this(intentName, slots);
        this.message = message;
        this.responseCard = responseCard;
    }
   
    public String getIntentName() {
        return intentName;
    }

    public Map<String, String> getSlots() {
        return Collections.unmodifiableMap(slots);
    }
}
