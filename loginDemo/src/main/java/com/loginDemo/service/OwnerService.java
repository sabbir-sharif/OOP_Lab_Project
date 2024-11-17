package com.loginDemo.service;

import com.loginDemo.model.Property;
import com.loginDemo.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {

    @Autowired
    OwnerRepository ownerRepository;

    public List<Property> getAllProperty(){
        return ownerRepository.findAll();
    }

    public void addProperty(Property property){
        ownerRepository.save(property);
    }

    public void updateProperty(Property property){
        ownerRepository.save(property);
    }

    public void deleteProperty(int propertyId){
        ownerRepository.deleteById(propertyId);
        System.out.println("Successfully Deleted!");
    }
}
