package com.example.chatapp;

public class MessageModel {
    private String msgId;
    private String senderId;
    private String Message;
    public MessageModel(){}
    public MessageModel(String msgId, String senderId, String message) {
        this.msgId = msgId;
        this.senderId = senderId;
        Message = message;
    }
    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }


}
