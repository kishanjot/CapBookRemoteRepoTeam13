package com.cg.capbook.services;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;
import com.cg.capbook.beans.Comment;
import com.cg.capbook.beans.Friend;
import com.cg.capbook.beans.Post;
import com.cg.capbook.beans.Profile;
import com.cg.capbook.exceptions.EmailAlreadyExistsException;
import com.cg.capbook.exceptions.IncorrectSecurityAnswer;
import com.cg.capbook.exceptions.IncorrectSecurityQusetion;
import com.cg.capbook.exceptions.InvalidEmailIdException;
import com.cg.capbook.exceptions.InvalidPasswordException;
import com.cg.capbook.exceptions.NoUserFoundException;
import com.cg.capbook.exceptions.PasswordMismatchException;
import com.cg.capbook.exceptions.UserDetailsNotFoundException;

public interface CapbookServices {

	Profile signUpUser(Profile profile) throws EmailAlreadyExistsException;
	Profile loginUser(String emailId,String password) throws InvalidEmailIdException, InvalidPasswordException;
	Profile logout();
	public Profile editProfile(String emailId,String userName) throws InvalidEmailIdException, NoUserFoundException;
	Profile addProfilePic(String emailId, MultipartFile file) throws UserDetailsNotFoundException, NoUserFoundException;
	public Profile getUserDetails(String emailId) throws NoUserFoundException;

	
	boolean  changePassword(String emailId,String password,String newPassword,String confirmNewPwd) throws  NoUserFoundException, PasswordMismatchException;
	Profile  forgotPassword(String emaildId, String password,String securityQstn, String securityAns) throws IncorrectSecurityAnswer, NoUserFoundException, IncorrectSecurityQusetion;

	
	public boolean confirmFriendRequest(String senderId,String receiverId); 
	public boolean sendFriendRequest(String senderId, String receiverId); 
	public boolean rejectFriendRequest(String senderId,String receiverId); 
	public List<Friend> showAllFriendRequests(String emailId); 
	public List<Friend> showAllSentFriendRequests(String emailId); 
	public List<Friend> showAllFriends(String emailId);


	Profile getProfile(String emailId);
	Profile update(Profile login);

	
	Post createPost(Post post);
	Post updatePostLikes(Post post);
	Post updatePostDislikes(Post post);

	
	Post addPostComment(Comment comment);
	List<Post> getPosts();

}
