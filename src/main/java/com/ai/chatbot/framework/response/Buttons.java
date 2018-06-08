package com.ai.chatbot.framework.response;

public class Buttons {
    String text;
    String value;

    public Buttons() {
    }

    public Buttons(String text, String value) {
        this.text = text;
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}