package com.ai.chatbot.framework.response.action;

import java.util.Map;

import com.ai.chatbot.framework.response.Message;
import com.ai.chatbot.framework.response.ResponseCard;

public class ElicitSlotDialogAction extends DialogActionDetails {

    private final String intentName;
    private final Map<String,String> slots;
    private final String slotToElicit;

    public ElicitSlotDialogAction(String slotToElicit, String intentName, Map<String,String> slots) {
        super(ELICITSLOT);
        if (slotToElicit == null) {
            throw new IllegalArgumentException("slotToElicit is required");
        }
        
        if (intentName == null) {
            throw new IllegalArgumentException("Intent Name is required");
        }
        
        if (slots == null || slots.isEmpty()) {
            throw new IllegalArgumentException("Slots are required");
        }
        this.intentName = intentName;
        this.slotToElicit = slotToElicit;
        this.slots = slots;
    }

    public ElicitSlotDialogAction(String slotToElicit, String intentName, Map<String,String> slots, Message message) {
        this(slotToElicit, intentName, slots);
        this.message = message;
    }
    
    public ElicitSlotDialogAction(String slotToElicit, String intentName, Map<String,String> slots, ResponseCard responseCard) {
        this(slotToElicit, intentName, slots);
        this.responseCard = responseCard;
    }

    public ElicitSlotDialogAction(String slotToElicit, String intentName, Map<String,String> slots, Message message, ResponseCard responseCard) {
        this(slotToElicit, intentName, slots, message);
        this.message = message;
        this.responseCard = responseCard;
    }

    public String getIntentName() {
        return intentName;
    }

    public Map<String, String> getSlots() {
        return slots;
    }

    public String getSlotToElicit() {
        return slotToElicit;
    }
}
