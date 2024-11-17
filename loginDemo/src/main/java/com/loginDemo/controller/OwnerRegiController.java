package com.loginDemo.controller;

import com.loginDemo.model.Owner;
import com.loginDemo.service.OwnerRegiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class OwnerRegiController {

    @Autowired
    OwnerRegiService ownerRegiService;

//    @GetMapping("/register")
//    public String register(){
//        return "register";
//    }

    @PostMapping("/register")
    @ResponseBody
    public String ownerRegistration(@ModelAttribute Owner owner){

        boolean sameUserName = ownerRegiService.checkUserName(owner.getUserName());
        //Checking if the username already Exists or not
        if(sameUserName){
            return "Duplicate Username!";
        }
        //if Username does not exist, complete registration
        ownerRegiService.register(owner);
        return "Registration Successful!";
    }
}
