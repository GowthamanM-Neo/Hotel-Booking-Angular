package com.example.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.RoomModel;

@Repository
public interface RoomRepository extends CrudRepository<RoomModel, String>{

}
