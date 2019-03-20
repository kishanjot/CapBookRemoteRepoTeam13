package com.cg.capbook.beans;
import java.util.Map;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.MapKey;
@Entity
public class Friend {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int friendId;
	private String fromSenderId;
	private String toReceiverId;
	private boolean friendshipStatus;
	@ManyToMany
	@MapKey
	private Map<Integer, Message> messages;
	public Friend() {
		super();
	}
	public Friend(int friendId, String fromSenderId, String toReceiverId) {
		super();
		this.friendId = friendId;
		this.fromSenderId = fromSenderId;
		this.toReceiverId = toReceiverId;
	}
	public Friend(String toReceiverId, String fromSenderId) {
		this.toReceiverId=toReceiverId;
		this.fromSenderId=fromSenderId;
	}
	public int getFriendId() {
		return friendId;
	}
	public void setFriendId(int friendId) {
		this.friendId = friendId;
	}
	public String getfromSenderId() {
		return fromSenderId;
	}
	public void setfromSenderId(String fromSenderId) {
		this.fromSenderId = fromSenderId;
	}
	public String gettoReceiverId() {
		return toReceiverId;
	}
	public void settoReceiverId(String toReceiverId) {
		this.toReceiverId = toReceiverId;
	}
	public boolean isFriendshipStatus() {
		return friendshipStatus;
	}
	public void setFriendshipStatus(boolean friendshipStatus) {
		this.friendshipStatus = friendshipStatus;
	}
	/*public Map<String, Profile> getProfiles() {
		return profiles;
	}
	public void setProfiles(Map<String, Profile> profiles) {
		this.profiles = profiles;
	}*/
	public Map<Integer, Message> getMessages() {
		return messages;
	}
	public void setMessages(Map<Integer, Message> messages) {
		this.messages = messages;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + friendId;
		result = prime * result + (friendshipStatus ? 1231 : 1237);
		result = prime * result + ((fromSenderId == null) ? 0 : fromSenderId.hashCode());
		result = prime * result + ((messages == null) ? 0 : messages.hashCode());
		//result = prime * result + ((profiles == null) ? 0 : profiles.hashCode());
		result = prime * result + ((toReceiverId == null) ? 0 : toReceiverId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Friend other = (Friend) obj;
		if (friendId != other.friendId)
			return false;
		if (friendshipStatus != other.friendshipStatus)
			return false;
		if (fromSenderId == null) {
			if (other.fromSenderId != null)
				return false;
		} else if (!fromSenderId.equals(other.fromSenderId))
			return false;
		if (messages == null) {
			if (other.messages != null)
				return false;
		} else if (!messages.equals(other.messages))
			return false;
		/*if (profiles == null) {
			if (other.profiles != null)
				return false;
		} else if (!profiles.equals(other.profiles))
			return false;
		*/if (toReceiverId == null) {
			if (other.toReceiverId != null)
				return false;
		} else if (!toReceiverId.equals(other.toReceiverId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Friend [friendId=" + friendId + ", fromSenderId=" + fromSenderId + ", toReceiverId=" + toReceiverId
				+ ", friendshipStatus=" + friendshipStatus + "]";
	}
}
