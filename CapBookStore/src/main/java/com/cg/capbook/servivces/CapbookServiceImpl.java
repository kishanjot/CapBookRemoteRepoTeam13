package com.cg.capbook.servivces;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.billing.exceptions.CustomerDetailsNotFoundException;
import com.cg.capbook.beans.Comment;
import com.cg.capbook.beans.Friend;
import com.cg.capbook.beans.Message;
import com.cg.capbook.beans.Page;
import com.cg.capbook.beans.Post;
import com.cg.capbook.beans.Profile;
import com.cg.capbook.daoservices.CommentDAO;
import com.cg.capbook.daoservices.FriendDAO;
import com.cg.capbook.daoservices.MessageDAO;
import com.cg.capbook.daoservices.PageDAO;
import com.cg.capbook.daoservices.PostDAO;
import com.cg.capbook.daoservices.ProfileDAO;
import com.cg.capbook.exceptions.EmailAlreadyExistsException;
import com.cg.capbook.exceptions.InvalidEmailIdException;

@Component("capbookServices")
public class CapbookServiceImpl implements CapbookServices{
	@Autowired
	ProfileDAO profileDao;
	@Autowired
	PostDAO postDao;
	@Autowired
	PageDAO pageDao;
	@Autowired
	MessageDAO messageDao;
	@Autowired
	FriendDAO friendDao;
	@Autowired
	CommentDAO commentDao;

	Profile profiles;
	Post posts;
	Page pages;
	Message messages;
	Friend friends;
	Comment comments;
	static String sessionEmailId;

	@Override
	public Profile signUpUser(Profile profile) throws EmailAlreadyExistsException {
		if(profileDao.findById(profile.getEmailId()).isPresent())
			throw new EmailAlreadyExistsException();
		profile=profileDao.save(profile);
		return profile;
	}

	@Override
	public Profile loginUser(Profile profile) throws InvalidEmailIdException {
		Profile profile1=profileDao.findById(profile.getEmailId()).orElseThrow(()->new InvalidEmailIdException("Incorrect EmailId Entered!"));
		sessionEmailId=profile.getEmailId();
		return profile1;
	}

	@Override
	public Profile logout() {
		sessionEmailId=null;
		return null;
	}

	
	@Override
	public Profile editProfile(Profile profile) {
		return null;
	}

	@Override
	public Profile insertProfilePic(byte[] profilePhoto) {
		return null;
	}

	@Override
	public byte[] fetchProfilePhoto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Profile> searchAllUsersByName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profile changePassword(String newPassword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String forgotPassword(String emailId, String securityQstn, String securityAns) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Friend acceptFriend(String fromSenderId, String toReceiverId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Friend rejectFriend(String fromSenderId, String toReceiverId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Friend inviteFriend(String fromSenderId, String toReceiverId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Friend referFriend(String fromSenderId, String toReceiverId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Profile> getFriendList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Friend addFriend(String toUserId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profile getProfile(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sendMessage(Message message) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Message> viewSentMessages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Message> viewReceivedMessages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post createPost(Post post) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post updatePostLikes(Post post) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post updatePostDislikes(Post post) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post addPostComment(Comment comment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> getPosts() {
		// TODO Auto-generated method stub
		return null;
	}


}
