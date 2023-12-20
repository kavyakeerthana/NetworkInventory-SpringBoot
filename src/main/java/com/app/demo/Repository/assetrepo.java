package com.app.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.demo.entity.assetentity;


@Repository
public interface assetrepo extends JpaRepository<assetentity,Long>{
	
	public assetentity findByAssetname(String name);
	public assetentity findByAssetmodelId(Long assetmodelId);
	

}
