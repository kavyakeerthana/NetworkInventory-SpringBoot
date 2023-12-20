package com.app.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.demo.entity.adminentity;


@Repository
public interface adminrepo extends JpaRepository<adminentity,Long>{
	
	
}
