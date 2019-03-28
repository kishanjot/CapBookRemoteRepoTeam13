package com.cg.capbook.services;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;
import com.cg.capbook.beans.Comment;
import com.cg.capbook.beans.Friend;
import com.cg.capbook.beans.Message;
import com.cg.capbook.beans.Post;
import com.cg.capbook.beans.Profile;
import com.cg.capbook.exceptions.EmailAlreadyExistsException;
import com.cg.capbook.exceptions.InvalidEmailIdException;
import com.cg.capbook.exceptions.InvalidPasswordException;
import com.cg.capbook.exceptions.NoUserFoundException;

public interface CapbookServices {

	Profile signUpUser(Profile profile) throws EmailAlreadyExistsException;
	 Profile loginUser(String emailId,String password) throws InvalidEmailIdException, InvalidPasswordException;
	Profile logout();
	public Profile editProfile(String emailId,String userName) throws InvalidEmailIdException, NoUserFoundException;
	Profile addProfilePic(String emailId, MultipartFile file) throws UserDetailsNotFoundException, NoUserFoundException;
	public Profile getUserDetails(String emailId) throws NoUserFoundException;
	
	public boolean changePassword(String emailId,String oldPassword,String newPassword);
	 public boolean forgotPassword(String emaildId, String password,String securityQstn,String securityAns);
	
	 public boolean sendFriendRequest(String senderEmailId, String receiverEmailId);
	 public boolean confirmFriendRequest(String senderEmailId,String receiverEmailId);
	 public boolean declineFriendRequest(String senderEmailId, String receiverEmailId);
	 public void showAllFriendRequest(String emailId);
	Friend inviteFriend(String senderEmailId, String receiverEmailId);
	Friend referFriend(String senderEmailId, String receiverEmailId);
	List<Profile> getFriendList();
	
	Friend addFriend(String toUserId);
	Profile getProfile(String emailId);
	
	void sendMessage(Message message);
	List<Message> viewSentMessages();
	List<Message> viewReceivedMessages();

	Post createPost(Post post);
	Post updatePostLikes(Post post);
	Post updatePostDislikes(Post post);

	Post addPostComment(Comment comment);
	List<Post> getPosts();
}
