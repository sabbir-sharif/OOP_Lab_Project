package com.otsdemo.onlineToletSystemDemo.controller;

import com.otsdemo.onlineToletSystemDemo.model.HouseOwner;
import com.otsdemo.onlineToletSystemDemo.repository.HouseOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @Autowired
    HouseOwnerRepository houseOwnerRepository;

    @GetMapping("/houseowner/registration")
    public String houseOwnerRegistration(Model model){
        model.addAttribute("houseOwner", new HouseOwner());
        return "ownerRegistrationForm";
    }
    @PostMapping("/houseowner/registration")
    public String registerHouseOwner(@ModelAttribute("houseOwner") HouseOwner houseOwner) {
        // Logic to save houseOwnerDto to the database or handle registration
        houseOwnerRepository.save(houseOwner);
        System.out.println("Registered Owner: " + houseOwner.getName());
        return "registrationSuccess"; // Redirect to a success page
    }

    @GetMapping("/tenant/registration")
    public String tenantRegistration(){
        return "tenantRegistrationForm";
    }
}
