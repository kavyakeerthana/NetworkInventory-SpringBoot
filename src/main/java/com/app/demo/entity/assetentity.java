package com.app.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="AssetList")
public class assetentity {
	
	
	public assetentity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ModelID")
	public Long assetmodelId;
	
	@Column(name="ID")
	public Long assetId;
	
	@Column(name="AssetName")
	public String assetname;
	
	@Column(name="AssetModel")
	public String assetmodel;
	
	@Column(name="AssetQuantity")
	public Long assetquantity;

	public assetentity(Long assetId, String assetname, String assetmodel, Long assetquantity) {
		super();
		this.assetId = assetId;
		this.assetname = assetname;
		this.assetmodel = assetmodel;
		this.assetquantity = assetquantity;
	}

	
	
	public assetentity(String assetname) {
		super();
		this.assetname = assetname;
	}



	public Long getAssetmodelId() {
		return assetmodelId;
	}

	public void setAssetmodelId(Long assetmodelId) {
		this.assetmodelId = assetmodelId;
	}

	public Long getAssetId() {
		return assetId;
	}

	public void setAssetId(Long assetId) {
		this.assetId = assetId;
	}

	public String getAssetname() {
		return assetname;
	}

	public void setAssetname(String assetname) {
		this.assetname = assetname;
	}

	public String getAssetmodel() {
		return assetmodel;
	}

	public void setAssetmodel(String assetmodel) {
		this.assetmodel = assetmodel;
	}

	public Long getAssetquantity() {
		return assetquantity;
	}

	public void setAssetquantity(Long assetquantity) {
		this.assetquantity = assetquantity;
	}
	
	

	
	

}
