package com.cg.capbook.beans;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	private String newPassword;
	@NotEmpty
	private String firstName;
	@NotEmpty
	private String lastName;
	@NotEmpty
	private String dateOfBirth;
	private String gender;
	@NotEmpty
	private String mobileNo;
	private String securityQstn;
	@NotEmpty
	private String securityAns;
	private String profilePic;
	@NotEmpty
	private String country;
	@NotEmpty
	private String city;
	 @OneToMany(mappedBy = "profile", cascade = CascadeType.ALL,fetch = FetchType.EAGER )
	private List<Post> posts;
	

	public Profile() {
		super();
	}

	public Profile(@NotEmpty @Email String emailId, @NotEmpty String password, String newPassword,
			@NotEmpty String firstName, @NotEmpty String lastName, @NotEmpty String dateOfBirth,
			String gender, @NotEmpty String mobileNo, String securityQstn, @NotEmpty String securityAns,
			String profilePic, @NotEmpty String country, @NotEmpty String city) {
		super();
		this.emailId = emailId;
		this.password = password;
		this.newPassword = newPassword;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.securityQstn = securityQstn;
		this.securityAns = securityAns;
		this.profilePic = profilePic;
		this.country = country;
		this.city = city;
	}
	
	public Profile(@NotEmpty @Email String emailId, @NotEmpty String password, String newPassword) {
		super();
		this.emailId = emailId;
		this.password = password;
		this.newPassword = newPassword;
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
	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
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

	public String getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(String profilePic) {
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

	public String getSecurityQstn() {
		return securityQstn;
	}
	public void setSecurityQstn(String securityQstn) {
		this.securityQstn = securityQstn;
	}

	public String getSecurityAns() {
		return securityAns;
	}
	public void setSecurityAns(String securityAns) {
		this.securityAns = securityAns;
	}

/*	public List<Friend> getFriendList() {
		return friendList;
	}
	public void setFriendList(List<Friend> friendList) {
		this.friendList = friendList;
	}*/

	@Override
	public String toString() {
		return "Profile [emailId=" + emailId + ", password=" + password + ", newPassword=" + newPassword
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", gender=" + gender + ", mobileNo=" + mobileNo + ", securityQstn=" + securityQstn
				+ ", securityAns=" + securityAns + ", profilePic=" + profilePic + ", country=" + country + ", city="
				+ city + "]";
	}
}
