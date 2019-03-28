package com.cg.capbook.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Friend {
	@Id
	private String emailId;
	private String firstName;
	private String lastName;
	
	@ManyToOne
	private Profile profile;
	
	public Friend() {
		super();
	}

	public Friend(String emailId, String firstName, String lastName, Profile profile) {
		super();
		this.emailId = emailId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.profile = profile;
	}

	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "Friend [emailId=" + emailId + ", firstName=" + firstName + ", lastName=" + lastName + ", profile="
				+ profile + "]";
	}
}
