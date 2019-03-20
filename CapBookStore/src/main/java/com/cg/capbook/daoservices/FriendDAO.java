package com.cg.capbook.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.capbook.beans.Friend;

public interface FriendDAO extends JpaRepository<Friend, Integer>{

}
