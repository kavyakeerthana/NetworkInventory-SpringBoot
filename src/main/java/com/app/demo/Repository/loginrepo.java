package com.app.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.demo.entity.loginentity;

@Repository
public interface loginrepo extends JpaRepository<loginentity,Long> {
	
	public loginentity findByEmail(String email);
	
	public loginentity findByPhone (String phone);

}
