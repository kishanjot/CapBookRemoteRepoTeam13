package com.cg.capbook.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
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
import com.cg.capbook.exceptions.InvalidPasswordException;
import com.cg.capbook.exceptions.NoUserFoundException;

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
	static String currentEmailId;
	static String currentPassword;


	@Override
	public Profile signUpUser(Profile profile) throws EmailAlreadyExistsException {
		if(profileDao.findById(profile.getEmailId()).isPresent())
			throw new EmailAlreadyExistsException();
		profile=profileDao.save(profile);
		return profile;
	}

	@Override
	public Profile loginUser(String emailId,String password) throws InvalidEmailIdException, InvalidPasswordException  {
		Profile profile1=profileDao.findById(emailId).orElseThrow(()->new InvalidEmailIdException("Incorrect EmailId Entered!"));
		currentEmailId=profile1.getEmailId();
		if( profile1.getPassword().equals(password) )	
			return profile1;
		throw new InvalidPasswordException("Invalid Pssword")  ;
	}

	@Override
	public Profile logout() {
		currentEmailId=null;
		return null;
	}

	@Override
	public Profile editProfile(Profile profile) throws InvalidEmailIdException {
		return profile;
//		Profile profile1=profileDao.findById(currentEmailId).orElseThrow(()->new InvalidEmailIdException());
//		if(!profile.getCity().isEmpty())
//			profile1.setCity(profile.getCity());
//		profile= profileDao.save(profile1);
//		profile.setProfilePic(null);
//		return profile;
	}

	@Override
	public Profile insertProfilePic(byte[] profilePic) {
		return null;
	}

	@Override
	public byte[] fetchProfilePic() {
		Profile profile=profileDao.findById(currentEmailId).get();		
		return profile.getProfilePic();
	}

	@Override
	public List<Profile> searchAllUsersByName(String userName) throws NoUserFoundException {
		//		List<Profile> listUser=profileDao.searchAllUsersByName(userName);
		//		for (Profile profile : listUser) 
		//			profile.setProfilePic(null);
		//		if(listUser.isEmpty())
		//			throw new NoUserFoundException();
		//		return listUser;
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
		post.setEmailId(currentEmailId);
		postDao.save(post);
		return post;
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



