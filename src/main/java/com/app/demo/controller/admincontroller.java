package com.app.demo.controller;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.app.demo.Repository.adminrepo;
import com.app.demo.Repository.assetrepo;
import com.app.demo.Repository.cartrepo;
import com.app.demo.Repository.loginrepo;

import com.app.demo.entity.adminentity;
import com.app.demo.entity.assetentity;
import com.app.demo.entity.cartentity;
import com.app.demo.entity.loginentity;

import com.app.demo.exception.adminexception;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

@CrossOrigin(origins="http://localhost:4200/")
@RestController

public class admincontroller {
	
	@Autowired
	private adminrepo rep1;
	@Autowired
	private assetrepo rep2;
	@Autowired
	private loginrepo rep3;
	@Autowired
	private cartrepo rep4;
	
	
	@RequestMapping("/wow")
	public String getData() {
		return "welcome to api";
	}
	
	@RequestMapping("/team")
	public String getData1() {
		return "welcome to DEMO";
	}
	
	@PostMapping("/AddCustomer")
	public adminentity createEmployee(@RequestBody adminentity customer) {
		return rep1.save(customer);
	}
	
	@PostMapping("/forgot")
	public ResponseEntity<String> forgot(@RequestBody loginentity u1)
	{
		
		loginentity users=rep3.findByPhone(u1.getPhone());
		System.out.println(u1.getPhone());
		String otp = new DecimalFormat("0000").format(new Random().nextInt(9999));
		System.out.println(otp);
		  final String ACCOUNT_SID = "AC996cc98ebe2a82a9874c9e14df6dc069";
		  final String AUTH_TOKEN = "b525647e9b183678963e33de5737b5f7";
		    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		    Message message = Message.creator(
//		      new com.twilio.type.PhoneNumber("+919710808800"),
		      new com.twilio.type.PhoneNumber(u1.getPhone()),
		      new com.twilio.type.PhoneNumber("+14107931309"),
		      otp)
		    .create();

		    System.out.println(message.getSid());
		    System.out.println(u1.getPhone());
		   
		    
		    return(ResponseEntity<String>) ResponseEntity.ok(otp);

		    
		
//		if(users.getPhone().equals(u1.getPhone())) {
//			String otp = new DecimalFormat("0000").format(new Random().nextInt(9999));
//			  final String ACCOUNT_SID = "AC996cc98ebe2a82a9874c9e14df6dc069";
//			  final String AUTH_TOKEN = "b525647e9b183678963e33de5737b5f7";
//			    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
//			    Message message = Message.creator(
//			      new com.twilio.type.PhoneNumber("+919710808800"),
////			      new com.twilio.type.PhoneNumber(u1.getPhone()),
//			      new com.twilio.type.PhoneNumber("+14107931309"),
//			      otp)
//			    .create();
//	
//			    System.out.println(message.getSid());
//			    System.out.println(u1.getPhone());
//			    
//			    return(ResponseEntity<String>) ResponseEntity.ok(otp);
//
//		}else {
//			return(ResponseEntity<String>) ResponseEntity.ok("Enter valid number");
//		}

	

	}

	@PutMapping("/change")
	public ResponseEntity<loginentity> change(@RequestBody loginentity u1)
	{
	loginentity users=rep3.findByPhone(u1.getPhone());
	users.setPassword(u1.getPassword());
	loginentity updatedpassword = rep3.save(users);
	return ResponseEntity.ok(updatedpassword);
	}
	
	
	@GetMapping("/AddCustomer")
	public List<adminentity> getAllCustomer(){
		return rep1.findAll();
	}
	
	
	@GetMapping("/AddCustomer/{id}")
	public ResponseEntity<adminentity> goToCustomerPage(@PathVariable Long id){
		adminentity admin1 = rep1.findById(id).orElseThrow(()->new adminexception("Employee not Exists with Id :"+id));
		return ResponseEntity.ok(admin1);
	}
	
	@PostMapping("/AddAsset")
	public assetentity createAsset(@RequestBody assetentity asset) {
		return rep2.save(asset);
	}
	@GetMapping("/AddAsset")
	public List<assetentity> getAllAssets(){
		return rep2.findAll();
		
	}
	
	@GetMapping("/AddAsset/{id}")
	public ResponseEntity<assetentity> goToAssetPage(@PathVariable Long id){
		assetentity admin1 = rep2.findById(id).orElseThrow(()->new adminexception("Asset not Exists with Id :"+id));
		return ResponseEntity.ok(admin1);
	}
	
	
	@PutMapping("/AddAsset/{id}")
	public ResponseEntity<assetentity> updateAsset(@PathVariable Long id,@RequestBody assetentity assetentity1){
		
		assetentity asset = rep2.findById(id).orElseThrow(()->new adminexception("Asset does not Exist with Id :"+id));
		
		asset.setAssetquantity(assetentity1.getAssetquantity());
		assetentity updatedAsset = rep2.save(asset);
		return ResponseEntity.ok(updatedAsset);
		
	}
	
	
	@PutMapping("/AddCustomer/{id}")
	public ResponseEntity<adminentity> updateCustomer(@PathVariable Long id,@RequestBody adminentity adminentity1){
		
		adminentity admin = rep1.findById(id).orElseThrow(()->new adminexception("Customer does not Exist with Id :"+id));
		
		admin.setName(adminentity1.getName());
		admin.setSurname(adminentity1.getSurname());
		admin.setAadhar(adminentity1.getAadhar());
		admin.setPhone(adminentity1.getPhone());
		admin.setEmail(adminentity1.getEmail());
		admin.setAddress(adminentity1.getAddress());
		admin.setDOB(adminentity1.getDOB());
		admin.setGender(adminentity1.getGender());
		admin.setCountry(adminentity1.getCountry());
		admin.setState(adminentity1.getState());
		admin.setConnectionPlan(adminentity1.getConnectionPlan());
		admin.setConnectionType(adminentity1.getConnectionType());
		admin.setSpeed(adminentity1.getSpeed());
		admin.setData(adminentity1.getData());
		admin.setRent(adminentity1.getRent());
		
		adminentity updatedEmployee = rep1.save(admin);
		return ResponseEntity.ok(updatedEmployee);
	}
	
	
	

	@PostMapping("/signup")
	public loginentity signup(@RequestBody loginentity signup)
	{
		return rep3.save(signup);
	}
	
	@PostMapping("/login")
	public Boolean login(@RequestBody loginentity login)
	{
		loginentity admin=rep3.findByEmail(login.getEmail());
		if(admin.getPassword().equals(login.getPassword())) {
			return true;
		}
		return false;
	}
	
	
	@GetMapping("/login/{email}")
	public ResponseEntity<loginentity> loginId(@PathVariable String email)
	{
		loginentity admin=rep3.findByEmail(email);
		return ResponseEntity.ok(admin);
		
	}
	
	@GetMapping("/log/{id}")
	public ResponseEntity<loginentity> goToAdminPage(@PathVariable Long id){
		loginentity admin1 = rep3.findById(id).orElseThrow(()->new adminexception("Admin does not Exists with Id :"+id));
		return ResponseEntity.ok(admin1);
	}
	
	
	@GetMapping("/signup")
	public List<loginentity> getAllAdmin(){
		return rep3.findAll();
	}

	
	
//	@PostMapping("/cart")
//	public cartentity cart(@RequestBody cartentity cartitems) {
//		return rep4.save(cartitems);
//	}
	
	@PostMapping("/cart")
	public cartentity cart(@RequestBody cartentity cart)
	{
		return rep4.save(cart);
	}
	
	@GetMapping("/cart")
	public List<cartentity> getCart(){
		return rep4.findAll();
	}
	
	
	@DeleteMapping("/cart/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteAsset(@PathVariable Long id){
		cartentity cart = rep4.findById(id).orElseThrow(()->new adminexception("Cart with Id:"+id+"doesnot exist"));
		rep4.delete(cart);
		Map<String,Boolean>response=new HashMap<>();
		response.put("deleted",Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	@DeleteMapping("/AddAsset/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteAssetId(@PathVariable Long id){
		assetentity cart = rep2.findByAssetmodelId(id);
	    rep2.delete(cart);
		Map<String,Boolean>response=new HashMap<>();
		response.put("deleted",Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	
	
	
	
	 
	
	

	
	

}
