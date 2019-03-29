package com.cg.capbook.services;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

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
import com.cg.capbook.exceptions.BothPasswordsSameException;
import com.cg.capbook.exceptions.EmailAlreadyExistsException;
import com.cg.capbook.exceptions.IncorrectSecurityAnswer;
import com.cg.capbook.exceptions.InvalidEmailIdException;
import com.cg.capbook.exceptions.InvalidPasswordException;
import com.cg.capbook.exceptions.NoUserFoundException;
import com.cg.capbook.exceptions.UserDetailsNotFoundException;

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

	private static String storageLocation = "C:\\Users\\ADM-IG-HWDLAB1D\\git\\CapBookLocalRepoTeam13\\CapBookStore\\src\\main\\resources\\static\\images\\";

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
	public Profile editProfile(String emailId,String userName) throws InvalidEmailIdException, NoUserFoundException {
		Profile profile1=getUserDetails(emailId);
		profile1.setUserName(userName);
		return profileDao.save(profile1);
	}

	@Override
	public Profile addProfilePic(String emailId, MultipartFile file) throws UserDetailsNotFoundException, NoUserFoundException {
		Profile profile=getUserDetails(emailId);
		try {
			Path path=Paths.get(storageLocation + file.getOriginalFilename());
			file.transferTo(path);
			profile.setProfilePic("/images/"+file.getOriginalFilename()); 
		}
		catch(IOException e) {
			e.printStackTrace();	
		}
		return profileDao.save(profile);
	}

	@Override
	public Profile getUserDetails(String emailId) throws NoUserFoundException {
		Profile profile3=profileDao.findById(emailId).orElseThrow(()->new NoUserFoundException("User Not Found!"));
		return profile3;
	}

	public String encryptPassword(String password) {
		String encryptedPassword="";
		for(int i=password.length()-1; i>=0; i--)
			encryptedPassword += password.charAt(i);
		encryptedPassword += "090";
		return encryptedPassword;
	}
	
	@Override
	public Profile changePassword(String emailId, String password) throws BothPasswordsSameException, NoUserFoundException {
		Profile profile =  getUserDetails(emailId);
		if(profile.getPassword().equals(encryptPassword(password)))
			throw new BothPasswordsSameException("Both the  passwords cannot be same!");
		profile.setPassword(encryptPassword(password));
		return profileDao.save(profile);		
	}

	@Override
	public Profile forgotPassword(String emaildId, String password, String securityQstn, String securityAns) throws IncorrectSecurityAnswer, NoUserFoundException {
		Profile profile = getUserDetails(emaildId);
		if((!profile.getSecurityQstn().equals(securityQstn))   && (!profile.getSecurityAns().equals(securityAns)))
			throw new IncorrectSecurityAnswer("Security Question or Password Incorrect!");
		return profile;
	}

	@Override
	public boolean sendFriendRequest(String senderEmailId, String receiverEmailId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean confirmFriendRequest(String senderEmailId, String receiverEmailId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean declineFriendRequest(String senderEmailId, String receiverEmailId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void showAllFriendRequest(String emailId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Friend inviteFriend(String senderEmailId, String receiverEmailId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Friend referFriend(String senderEmailId, String receiverEmailId) {
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



