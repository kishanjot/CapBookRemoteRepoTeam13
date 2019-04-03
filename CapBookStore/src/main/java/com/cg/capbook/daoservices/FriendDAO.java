package com.cg.capbook.daoservices;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import com.cg.capbook.beans.Friend;

public interface FriendDAO extends JpaRepository<Friend, Integer>{

}
