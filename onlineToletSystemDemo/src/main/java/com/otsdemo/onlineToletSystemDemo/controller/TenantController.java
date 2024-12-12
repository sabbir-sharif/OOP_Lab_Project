package com.otsdemo.onlineToletSystemDemo.controller;

import com.otsdemo.onlineToletSystemDemo.model.Tenant;
import com.otsdemo.onlineToletSystemDemo.repository.FlatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/tenant")
public class TenantController {

    @Autowired
    FlatRepository flatRepository;

    @GetMapping
    public String profileHome(){
        return "tenant";
    }

    @GetMapping("/addflatmate")
    public String addFlatMate(Model model){

        model.addAttribute("tenant", new Tenant());
        model.addAttribute("flat", flatRepository.findAll());
        return "addFlatMember";
    }

    @GetMapping("/profile")//{id} will also be included
    public String profiledetails(){
        return "Profile";
    }

    @GetMapping("/review")//{id} will also be included
    public String review(){
        return "Review";
    }
}
