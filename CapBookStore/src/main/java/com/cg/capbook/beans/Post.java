package com.cg.capbook.beans;

import java.util.Arrays;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;

@Entity
public class Post {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int postId;
	private String emailId;
	private String postMaterial;
	@Column(columnDefinition="BLOB")
	private byte[] postPic;
	private int postLikes;
	private int postDislikes;
	
	@ManyToOne
	private Page page;
	@ManyToOne
	private Profile profile;
	
	@OneToMany(cascade = CascadeType.ALL/* ,fetch=FetchType.EAGER */ )
	@MapKey
	private Map<Integer, Comment> comments;
	
	public Post() {
		super();
	}

	public Post(String emailId, String postMaterial, byte[] postPic, int postLikes, int postDislikes,
			Map<Integer, Comment> comments) {
		super();
		this.emailId = emailId;
		this.postMaterial = postMaterial;
		this.postPic = postPic;
		this.postLikes = postLikes;
		this.postDislikes = postDislikes;
		this.comments = comments;
	}

	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPostMaterial() {
		return postMaterial;
	}
	public void setPostMaterial(String postMaterial) {
		this.postMaterial = postMaterial;
	}

	public byte[] getPostPic() {
		return postPic;
	}
	public void setPostPic(byte[] postPic) {
		this.postPic = postPic;
	}

	public int getPostLikes() {
		return postLikes;
	}
	public void setPostLikes(int postLikes) {
		this.postLikes = postLikes;
	}


	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public int getPostDislikes() {
		return postDislikes;
	}
	public void setPostDislikes(int postDislikes) {
		this.postDislikes = postDislikes;
	}

	public Map<Integer, Comment> getComments() {
		return comments;
	}
	public void setComments(Map<Integer, Comment> comments) {
		this.comments = comments;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + postDislikes;
		result = prime * result + postId;
		result = prime * result + postLikes;
		result = prime * result + ((postMaterial == null) ? 0 : postMaterial.hashCode());
		result = prime * result + Arrays.hashCode(postPic);
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
		Post other = (Post) obj;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (postDislikes != other.postDislikes)
			return false;
		if (postId != other.postId)
			return false;
		if (postLikes != other.postLikes)
			return false;
		if (postMaterial == null) {
			if (other.postMaterial != null)
				return false;
		} else if (!postMaterial.equals(other.postMaterial))
			return false;
		if (!Arrays.equals(postPic, other.postPic))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Post [postId=" + postId + ", emailId=" + emailId + ", postMaterial=" + postMaterial + ", postPic="
				+ Arrays.toString(postPic) + ", postLikes=" + postLikes + ", postDislikes=" + postDislikes + ", page="
				+ page + ", profile=" + profile + ", comments=" + comments + "]";
	}

	
}
