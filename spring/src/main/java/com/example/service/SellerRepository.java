package com.example.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.SellerModel;

@Repository
public interface SellerRepository extends CrudRepository<SellerModel, String>{

}
