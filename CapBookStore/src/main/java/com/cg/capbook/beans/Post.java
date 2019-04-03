package com.cg.capbook.beans;
import java.util.List;
import java.util.Map;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
//abcd
@Entity
public class Post {
	@Override
	public String toString() {
		return "Post [postId=" + postId + ", postContent=" + postContent + ", postPic=" + postPic + ", profile="
				+ profile + "]";
	}
	public Post() {
		super();
		// TODO Auto-generated constructor stub
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
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int postId;
	private String postContent,postPic;
	@ManyToOne
	private Profile profile;
}
	//@OneToMany(mappedBy="posts",cascade=CascadeType.ALL,orphanRemoval=true)
	//private List<Likes> likes;
	//@OneToMany(mappedBy="posts",cascade=CascadeType.ALL,orphanRemoval=true)
	//private List<Dislikes> dislikes;
	//@OneToMany(mappedBy="posts",cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval=true)
	//@MapKey
	//private Map<Integer, Comments> comments;
	
