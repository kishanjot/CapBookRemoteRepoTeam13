package com.cg.capbook.beans;

import java.util.Arrays;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
public class Profile {

	@Id
	@NotEmpty
	@Email
	private String emailId;
	@NotEmpty
	private String password;
	@NotEmpty
	private String firstName;
	@NotEmpty
	private String lastName;
	private String userName;
	@NotEmpty
	private String dateOfBirth;
	private String gender;
	@NotEmpty
	private String mobileNo;

	@Column(columnDefinition = "BLOB")
	private byte[] profilePic;
	@NotEmpty
	private String country;
	@NotEmpty
	private String city;

	/*
	 * @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 * 
	 * @JoinTable(name = "profile_friend", joinColumns =
	 * { @JoinColumn(name="emailId") }, inverseJoinColumns = { @JoinColumn(name =
	 * "friendId") }) private Map<Integer, Friend> friends;
	 * 
	 * @OneToMany(mappedBy = "profile", cascade = CascadeType.ALL
	 * ,fetch=FetchType.EAGER )
	 * 
	 * @MapKey private Map<Integer, Post> posts;
	 */

	public Profile() {
		super();
	}
	
	public Profile(@NotEmpty @Email String emailId, @NotEmpty String password, @NotEmpty String firstName,
			@NotEmpty String lastName, String userName, @NotEmpty String dateOfBirth, String gender,
			@NotEmpty String mobileNo, byte[] profilePic, @NotEmpty String country, @NotEmpty String city) {
		super();
		this.emailId = emailId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.profilePic = profilePic;
		this.country = country;
		this.city = city;
	}


	public Profile(@NotEmpty @Email String emailId, @NotEmpty String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public byte[] getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(byte[] profilePic) {
		this.profilePic = profilePic;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Profile [emailId=" + emailId + ", password=" + password + ", firstName=" + firstName + ", lastName="
				+ lastName + ", userName=" + userName + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender
				+ ", mobileNo=" + mobileNo + ", profilePic=" + Arrays.toString(profilePic) + ", country=" + country
				+ ", city=" + city + "]";
	}

}
