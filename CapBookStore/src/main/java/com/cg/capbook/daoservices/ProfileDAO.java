package com.cg.capbook.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.capbook.beans.Profile;

public interface ProfileDAO extends JpaRepository<Profile, String>{

}
