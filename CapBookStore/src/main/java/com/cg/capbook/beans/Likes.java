package com.cg.capbook.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Likes {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int likeId;
	private String dislikeBy;
	private String likeBy;
	private int noOfDislikes;
	private int noOfLikes;
	
	public Likes() {
		super();
	}

	public Likes(int likeId, String dislikeBy, String likeBy, int noOfDislikes, int noOfLikes) {
		super();
		this.likeId = likeId;
		this.dislikeBy = dislikeBy;
		this.likeBy = likeBy;
		this.noOfDislikes = noOfDislikes;
		this.noOfLikes = noOfLikes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dislikeBy == null) ? 0 : dislikeBy.hashCode());
		result = prime * result + ((likeBy == null) ? 0 : likeBy.hashCode());
		result = prime * result + likeId;
		result = prime * result + noOfDislikes;
		result = prime * result + noOfLikes;
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
		Likes other = (Likes) obj;
		if (dislikeBy == null) {
			if (other.dislikeBy != null)
				return false;
		} else if (!dislikeBy.equals(other.dislikeBy))
			return false;
		if (likeBy == null) {
			if (other.likeBy != null)
				return false;
		} else if (!likeBy.equals(other.likeBy))
			return false;
		if (likeId != other.likeId)
			return false;
		if (noOfDislikes != other.noOfDislikes)
			return false;
		if (noOfLikes != other.noOfLikes)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Likes [likeId=" + likeId + ", dislikeBy=" + dislikeBy + ", likeBy=" + likeBy + ", noOfDislikes="
				+ noOfDislikes + ", noOfLikes=" + noOfLikes + "]";
	}
}
