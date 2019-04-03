package com.cg.capbook.beans;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Page {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pageId;
	@OneToOne
	private Profile profile;
	@OneToMany(mappedBy="page", cascade = CascadeType.ALL)
	@MapKey
	private Map<Integer, Post> posts = new HashMap<Integer, Post>();
	public Page() {
		super();
	}

	public Page(int pageId, int pageLikes, Map<Integer, Post> posts) {
		super();
		this.pageId = pageId;
		this.posts = posts;
	}

	public int getPageId() {
		return pageId;
	}
	public void setPageId(int pageId) {
		this.pageId = pageId;
	}

	public Map<Integer, Post> getPosts() {
		return posts;
	}
	public void setPosts(Map<Integer, Post> posts) {
		this.posts = posts;
	}

	@Override
	public String toString() {
		return "Page [pageId=" + pageId + ", profile=" + profile + ", posts=" + posts + "]";
	}
}
