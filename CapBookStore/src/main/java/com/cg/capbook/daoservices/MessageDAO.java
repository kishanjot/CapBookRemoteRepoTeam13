package com.cg.capbook.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.capbook.beans.Message;

public interface MessageDAO extends JpaRepository<Message, Integer>{

}
