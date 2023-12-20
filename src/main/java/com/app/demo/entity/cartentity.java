package com.app.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CartList")
public class cartentity {
	
	

	public cartentity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CartID")
	public Long cartId;
	
	@Column(name="CustomerID")
	public Long customerId;
	
	@Column(name="ModelID")
	public Long assetmodelId;
	
	@Column(name="AssetID")
	public Long assetId;
	
	@Column(name="AssetName")
	public String assetname;
	
	@Column(name="AssetModel")
	public String assetmodel;
	
	@Column(name="AssetQuantity")
	public Long assetquantity;
	

	

	public cartentity(Long customerId, Long assetmodelId, Long assetId, String assetname, String assetmodel,
			Long assetquantity) {
		super();
		this.customerId = customerId;
		this.assetmodelId = assetmodelId;
		this.assetId = assetId;
		this.assetname = assetname;
		this.assetmodel = assetmodel;
		this.assetquantity = assetquantity;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
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
