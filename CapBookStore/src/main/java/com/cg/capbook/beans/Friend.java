package com.cg.capbook.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Friend {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private String friendId;
	private String emailId;
	
	private int relationId;
	private String senderEmailId;
	private String receiverEmailId;
	private String status;

//	@ManyToOne
	//private Profile profile;

	public Friend() {
		super();
	}
	
	public Friend(String friendId, String emailId, int relationId, String senderEmailId, String receiverEmailId,
			String status, Profile profile) {
		super();
		this.friendId = friendId;
		this.emailId = emailId;
		this.relationId = relationId;
		this.senderEmailId = senderEmailId;
		this.receiverEmailId = receiverEmailId;
		this.status = status;
		//this.profile = profile;
	}

	public Friend(String emailId, Profile profile) {
		super();
		this.emailId = emailId;
		//this.profile = profile;
	}

	public Friend(int relationId, String senderEmailId, String receiverEmailId, String status) {
		super();
		this.relationId = relationId;
		this.senderEmailId = senderEmailId;
		this.receiverEmailId = receiverEmailId;
		this.status = status;
	}

	public Friend(String senderEmailId, String receiverEmailId, String status) {
		super();
		this.senderEmailId = senderEmailId;
		this.receiverEmailId = receiverEmailId;
		this.status = status;
	}

	public String getFriendId() {
		return friendId;
	}
	public void setFriendId(String friendId) {
		this.friendId = friendId;
	}

	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getRelationId() {
		return relationId;
	}
	public void setRelationId(int relationId) {
		this.relationId = relationId;
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

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	/*public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}*/

	@Override
	public String toString() {
		return "Friend [friendId=" + friendId + ", emailId=" + emailId + ", relationId=" + relationId
				+ ", senderEmailId=" + senderEmailId + ", receiverEmailId=" + receiverEmailId + ", status=" + status
				+ ", profile= ]";
	}	
}

