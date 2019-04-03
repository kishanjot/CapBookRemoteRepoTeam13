package com.cg.capbook.services;

import java.util.List;

import com.cg.capbook.beans.Post;

public interface PostServices {
	Post savePost(String emailId, String postContent);
	List<Post> ShowAllPosts(String emaildId);
	public boolean deletePost(int postId);
}

