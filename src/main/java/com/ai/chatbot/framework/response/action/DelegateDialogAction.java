package com.ai.chatbot.framework.response.action;

import java.util.Collections;
import java.util.Map;

public class DelegateDialogAction extends DialogAction {

    private final Map<String,String> slots;

    public DelegateDialogAction(Map<String,String> slots) {
        super(DELEGATE);
        if (slots == null || slots.isEmpty()) {
            throw new IllegalArgumentException("Slots are required");
        }
        this.slots = slots;
    }

    public Map<String, String> getSlots() {
        return Collections.unmodifiableMap(slots);
    }
}