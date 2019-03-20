package com.cg.capbook.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.capbook.beans.Page;

public interface PageDAO extends JpaRepository<Page, Integer>{

}
