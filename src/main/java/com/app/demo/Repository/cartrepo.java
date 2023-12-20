package com.app.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.demo.entity.cartentity;
import com.app.demo.entity.loginentity;

@Repository
public interface cartrepo extends JpaRepository<cartentity,Long> {

	public cartentity findByCustomerId(Long customerId);
}
