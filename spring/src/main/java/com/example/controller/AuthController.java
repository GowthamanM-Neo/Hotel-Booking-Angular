package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.LoginModel;
import com.example.model.SellerModel;
import com.example.model.UserModel;
import com.example.service.SellerRepository;
import com.example.service.UserRepository;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class AuthController {
	
	@Autowired
	UserRepository UserRepo;
	
	@Autowired
	SellerRepository AdminRepo;
	
	//	User Login Method
	@PostMapping("/user/login")
	public boolean isUserPresent(@RequestBody LoginModel data) {
		try {
			var a = UserRepo.findById(data.getEmail());
			if(a.isEmpty()) {
				return false;
			}else {
				if(a.get().getPassword().equals(data.getPassword())) {
					return true;								
				}else {
					return false;
				}
			}
		}catch(Exception e){
			return false;
		}
		
	}
	
	//	Admin Login Method
	@PostMapping("/admin/login")
	public boolean isAdminPresent(@RequestBody LoginModel data) {
		System.out.println(data);
		try {
			var a = AdminRepo.findById(data.getEmail());
			if(a.isEmpty()) {
				return false;
			}else {
				if(a.get().getPassword().equals(data.getPassword())) {
					return true;								
				}else {
					return false;
				}
			}
		}catch(Exception e){
			return false;
		}
	}
	
	//User SignUp Method
	@PostMapping("/user/signup")
	public void saveUser(@RequestBody UserModel user) {
		UserRepo.save(user);
	}
	
	//Admin SignUp Method
	@PostMapping("/admin/signup")
	public boolean saveAdmin(@RequestBody SellerModel admin) {
		try {
			AdminRepo.save(admin);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
}
