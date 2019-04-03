package com.cg.capbook.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int messageId;
	private String  senderEmailId;
	private String receiverEmailId;
	private String message;
	
	
	public Message() {
		super();
	}
	
	public Message(int messageId, String senderEmailId, String receiverEmailId, String message) {
		super();
		this.messageId = messageId;
		this.senderEmailId = senderEmailId;
		this.receiverEmailId = receiverEmailId;
		this.message = message;
	}
	
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	
	public String getSenderEmailId() {
		return senderEmailId;
	}
	public void setSenderEmailId(String senderEmailId) {
		this.senderEmailId = senderEmailId;
	}
	
	public String getReceiverEmailId() {
		return receiverEmailId;
	}
	public void setReceiverEmailId(String receiverEmailId) {
		this.receiverEmailId = receiverEmailId;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "Message [messageId=" + messageId + ", senderEmailId=" + senderEmailId + ", receiverEmailId="
				+ receiverEmailId + ", message=" + message + "]";
	}
}
