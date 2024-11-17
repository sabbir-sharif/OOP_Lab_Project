package com.loginDemo.controller;

import com.loginDemo.model.Property;
import com.loginDemo.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/login")
public class OwnerController {

    @Autowired
    OwnerService ownerService;

    @GetMapping("/show")
    public List<Property> home(){
        return ownerService.getAllProperty();
    }

    @PostMapping("/add")
    public void addProperty(@RequestBody Property property){
        ownerService.addProperty(property);
    }

    @PatchMapping("/update")
    public void updateProperty(@RequestBody Property property){
        ownerService.updateProperty(property);
    }

    @DeleteMapping("/delete/{propertyId}")
    public void deleteProperty(@PathVariable int propertyId){
        ownerService.deleteProperty(propertyId);
    }
}
