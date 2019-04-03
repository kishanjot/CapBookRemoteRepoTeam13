package com.cg.capbook.daoservices;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import com.cg.capbook.beans.Friend;

public interface FriendDAO extends JpaRepository<Friend, Integer>{
	
	/* public Friend findFriendRequest(@Param("senderId")String senderId, @Param("receiverId")String receiverId);
	 
	 public List<Friend> showAllFriendRequests(@Param("emailId") String emailId); 
	 
	 public List<Friend> showAllSentFriendRequests(@Param("emailId") String emailId);

	 public List<Friend> showAllFriends(@Param("emailId") String emailId); */
}
