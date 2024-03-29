package com.chatserver.messageserver;

/**
 * Message
 */
public class Message {

  public enum MessageType {
    CHAT, JOIN, LEAVE
}

  private MessageType messageType;
  private String content;
  private String sender;
  
  public MessageType getMessageType() {
    return messageType;
  }
  public void setMessageType(MessageType messageType) {
    this.messageType = messageType;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public String getSender() {
    return sender;
  }
  public void setSender(String sender) {
    this.sender = sender;
  }

  
}