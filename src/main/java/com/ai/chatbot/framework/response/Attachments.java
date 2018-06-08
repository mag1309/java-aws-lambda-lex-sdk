package com.ai.chatbot.framework.response;

public class Attachments {
    String title;
    String subTitle;
    String imageUrl;
    String attachmentLinkUrl;
    Buttons[] buttons;

    public Attachments() {
    }

    public Attachments(String title, String subTitle, Buttons[] buttons) {
        this.title = title;
        this.subTitle = subTitle;
        this.buttons = buttons;
    }
    
    public Attachments(String title, String subTitle, String attachmentLinkUrl, Buttons[] buttons) {
        this.title = title;
        this.subTitle = subTitle;
        this.attachmentLinkUrl = attachmentLinkUrl;
        this.buttons = buttons;
    }
    
    public Attachments(String title, String subTitle, String imageUrl, String attachmentLinkUrl, Buttons[] buttons) {
        this.title = title;
        this.subTitle = subTitle;
        this.imageUrl = imageUrl;
        this.attachmentLinkUrl = attachmentLinkUrl;
        this.buttons = buttons;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getAttachmentLinkUrl() {
        return attachmentLinkUrl;
    }

    public void setAttachmentLinkUrl(String attachmentLinkUrl) {
        this.attachmentLinkUrl = attachmentLinkUrl;
    }

    public Buttons[] getButtons() {
        return buttons;
    }

    public void setButtons(Buttons[] buttons) {
        this.buttons = buttons;
    }
}