package com.ai.chatbot.framework.request;

import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Intent {
    private String name;
    private Map<String, String> slots;
    private String confirmationStatus;
    private Map<String, Details> slotDetails;

    public Map<String, Details> getSlotDetails() {
		return slotDetails;
	}

	public void setSlotDetails(Map<String, Details> slotDetails) {
		this.slotDetails = slotDetails;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getSlots() {
        return slots;
    }

    public void setSlots(Map<String, String> slots) {
        this.slots = slots;
    }

    public String getConfirmationStatus() {
		return confirmationStatus;
	}

	public void setConfirmationStatus(String confirmationStatus) {
		this.confirmationStatus = confirmationStatus;
	}

	@Override
    public String toString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}