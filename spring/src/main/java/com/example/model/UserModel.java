 package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserModel {

	@Id
	String email;
	String password;
	String mobileNumber;
	String username;
	String userRole;
	int age;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	@Override
	public String toString() {
		return "UserModel [email=" + email + ", password=" + password + ", mobileNumber=" + mobileNumber + ", username="
				+ username + ", userRole=" + userRole + ", age=" + age + "]";
	}

}
