package com.cg.capbook.services;

import java.util.List;
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
	Profile editProfile(Profile profile) throws InvalidEmailIdException;
	Profile insertProfilePic(byte[] profilePic);
	byte[] fetchProfilePic();
	List<Profile> searchAllUsersByName(String userName) throws NoUserFoundException;
	
	Profile changePassword(String newPassword);
	String forgotPassword(String emailId, String securityQstn, String securityAns);
	
	Friend acceptFriend(String fromSenderId, String toReceiverId);
	Friend rejectFriend(String fromSenderId, String toReceiverId) ;
	Friend inviteFriend(String fromSenderId, String toReceiverId);
	Friend referFriend(String fromSenderId, String toReceiverId);
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
