package com.loginDemo.controller;

import com.loginDemo.model.Owner;
import com.loginDemo.service.OwnerLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class OwnerLoginCntroller {

    @Autowired
    OwnerLoginService ownerLoginService;

    @GetMapping("/home")
    public String index(){
        return "home";
    }

//    @GetMapping("/login")
//    public String ownerLogin(){
//        return "login";
//    }

    @PostMapping("/login")
    @ResponseBody
    public String ownerLogin(@ModelAttribute Owner owner){

        boolean sameUserName = ownerLoginService.checkUserName(owner.getUserName());
        boolean samePassword = ownerLoginService.checkPassword(owner.getPassword());
        //Checking if the username already Exists or not
        if(!sameUserName || !samePassword){
            return "Username or Password not matching!";
        }
        //if Username does not exist, complete registration
        return "You Are Successfully Logged In!";
    }
}
