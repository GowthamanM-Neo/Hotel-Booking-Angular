package com.example.model;

public class RoomTempModel {

	private String roomID;
	private String roomNo;
	private String adminID;
	private String status;
	private String price;
	private String type;
	public String getRoomID() {
		return roomID;
	}
	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getAdminID() {
		return adminID;
	}
	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "RoomTempModel [roomID=" + roomID + ", roomNo=" + roomNo + ", adminID=" + adminID + ", status=" + status
				+ ", price=" + price + ", type=" + type + "]";
	}
	
}
