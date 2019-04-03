package com.cg.capbook.daoservices;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.cg.capbook.beans.Profile;

public interface ProfileDAO extends JpaRepository<Profile, String>{


}
