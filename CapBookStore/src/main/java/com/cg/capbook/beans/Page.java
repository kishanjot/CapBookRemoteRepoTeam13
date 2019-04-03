package com.cg.capbook.beans;

import java.util.Map;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Page {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pageId;
	@OneToOne
	private Profile profile;
	
	public Page() {
		super();
	}

	public Page(int pageId, int pageLikes, Map<Integer, Post> posts) {
		super();
		this.pageId = pageId;
		
	}

	public int getPageId() {
		return pageId;
	}
	public void setPageId(int pageId) {
		this.pageId = pageId;
	}

	@Override
	public String toString() {
		return "Page [pageId=" + pageId + ", profile=" + profile + "]";
	}
}
