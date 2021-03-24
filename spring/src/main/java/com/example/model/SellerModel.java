package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SellerModel {

	@Id
	String email;
	String password;
	String mobileNumber;
	String sellerName;
	String userRole;
	String hotelName;
	String hotelImageURL;
	String hotelAddress;
	int earnings;
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
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelAddress() {
		return hotelAddress;
	}
	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getHotelImageURL() {
		return hotelImageURL;
	}
	public void setHotelImageURL(String hotelImageURL) {
		this.hotelImageURL = hotelImageURL;
	}
	public int getEarnings() {
		return earnings;
	}
	public void setEarnings(int earnings) {
		this.earnings = earnings;
	}
	@Override
	public String toString() {
		return "SellerModel [email=" + email + ", password=" + password + ", mobileNumber=" + mobileNumber
				+ ", sellerName=" + sellerName + ", userRole=" + userRole + ", hotelName=" + hotelName
				+ ", hotelImageURL=" + hotelImageURL + ", hotelAddress=" + hotelAddress + ", earnings=" + earnings
				+ "]";
	}
	
}
