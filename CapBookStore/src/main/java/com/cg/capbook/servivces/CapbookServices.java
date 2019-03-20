package com.cg.capbook.servivces;

import java.util.List;
import com.cg.capbook.beans.Comment;
import com.cg.capbook.beans.Friend;
import com.cg.capbook.beans.Message;
import com.cg.capbook.beans.Post;
import com.cg.capbook.beans.Profile;

public interface CapbookServices {

	Profile signUpUser(Profile profile);
	Profile loginUser(Profile profile);
	Profile logout();
	Profile editProfile(Profile profile);
	Profile insertProfilePic(byte[] profilePhoto);
	byte[] fetchProfilePhoto();
	List<Profile> searchAllUsersByName(String userName);
	
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
