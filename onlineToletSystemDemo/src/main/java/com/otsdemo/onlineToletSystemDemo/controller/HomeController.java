package com.otsdemo.onlineToletSystemDemo.controller;

import com.otsdemo.onlineToletSystemDemo.model.Flat;
import com.otsdemo.onlineToletSystemDemo.service.HouseOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    HouseOwnerService houseOwnerService;

    @GetMapping
    public String home(){
        return "home";
    }

    @GetMapping("/flatlist")
    public String flatlist(Model model){
        List<Flat> flats = houseOwnerService.showFlatList();
        model.addAttribute("flats", flats);
        return "flat_list";
    }


    @GetMapping("/{id}/detail")//{id} will be included
    public String getById(@PathVariable Long id, Model model){
        Flat flat = houseOwnerService.getdetails(id);
        model.addAttribute("flat", flat);
        return "flat-detail";
    }
}
