package com.cg.capbook.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.cg.capbook.beans.Post;
import com.cg.capbook.beans.Profile;
import com.cg.capbook.daoservices.PostDao;
import com.cg.capbook.daoservices.ProfileDAO;

@Component("postServices")
public class PostServicesImpl implements PostServices{
	@Autowired
	private ProfileDAO accountDao;
	@Autowired
	private PostDao postDao;

	@Autowired
	PostServices postServices;
	@Override
	public Post savePost(String emailId, String postMessage) {
		Profile account=accountDao.findById(emailId).orElse(null);
		Post post=new Post(postMessage, account);
		return postDao.save(post);
	}
	@Override
	public List<Post> ShowAllPosts(String emailId) {
		return postDao.showAllPosts(emailId);
		
	}
	public boolean deletePost(int postId) {
		postDao.deleteById(postId);
		return true;
	}
	
}