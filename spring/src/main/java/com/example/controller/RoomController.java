package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.RoomModel;
import com.example.model.RoomTempModel;
import com.example.service.RoomRepository;

@RestController
public class RoomController {

	@Autowired
	RoomRepository RoomRepo;
	
	@PostMapping("/admin/addRoom")
	public void saveRooms(@RequestBody RoomTempModel room) {
		RoomModel r = new RoomModel();
		r.setRoomNo(room.getRoomNo());
		r.setAdminID(room.getAdminID());
		r.setType(room.getType());
		r.setPrice(room.getPrice());
		r.setStatus(room.getStatus());
		RoomRepo.save(r);
		
	}
}
