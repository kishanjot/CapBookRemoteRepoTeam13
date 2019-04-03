package com.cg.capbook.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Post {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int postId;
	private String postContent,postPic;
	@ManyToOne
	private Profile profile;


	public Post() {
		super();
	}

	public Post(int postId, String postContent, String postPic, Profile profile) {
		super();
		this.postId = postId;
		this.postContent = postContent;
		this.postPic = postPic;
		this.profile = profile;
	}
	
	public Post(String postContent, Profile profile) {
		this.postContent=postContent;
		this.profile=profile;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getPostContent() {
		return postContent;
	}
	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}
	public String getPostPic() {
		return postPic;
	}
	public void setPostPic(String postPic) {
		this.postPic = postPic;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
	@Override
	public String toString() {
		return "Post [postId=" + postId + ", postContent=" + postContent + ", postPic=" + postPic + ", profile="
				+ profile + "]";
	}
}
