package com.otsdemo.onlineToletSystemDemo.controller;

import com.otsdemo.onlineToletSystemDemo.model.Flat;
import com.otsdemo.onlineToletSystemDemo.model.HouseOwner;
import com.otsdemo.onlineToletSystemDemo.model.Tenant;
import com.otsdemo.onlineToletSystemDemo.repository.FlatRepository;
import com.otsdemo.onlineToletSystemDemo.repository.HouseOwnerRepository;
import com.otsdemo.onlineToletSystemDemo.repository.TenantRepository;
import com.otsdemo.onlineToletSystemDemo.service.HouseOwnerService;
import com.otsdemo.onlineToletSystemDemo.service.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/houseowner")
public class HouseOwnerController {

    @Autowired
    private HouseOwnerService houseOwnerService;

    @Autowired
    private HouseOwnerRepository houseOwnerRepository;

    @Autowired
    private TenantService tenantService;

    @Autowired
    private TenantRepository tenantRepository;

    @Autowired
    private FlatRepository flatRepository;

    @GetMapping
    //@ResponseBody// No need when add HTML page
    public String showFlatList(Model model){
        List<Flat> flats = houseOwnerService.showFlatList();//Done
        model.addAttribute("flats", flats); //Done
        return "houseowner";
    }

    @GetMapping("/addFlat")
    //@ResponseBody// No need when add HTML page
    public String addFlat(Model model){
        model.addAttribute("houseOwner", houseOwnerService.showOwners());

        return "addFlat"; // Get the Form Page for Adding Flat
    }
//    @PostMapping("/addFlat")
//    public String addFlat(@ModelAttribute Flat flat, @RequestParam("houseOwner") String houseOwnerId) {
//        // Fetch the HouseOwner by ID
//        HouseOwner houseOwner = houseOwnerRepository.findByName(houseOwnerId);
//
//        // Associate the Flat with the HouseOwner
//        flat.setHouseOwner(houseOwner);
//
//        // Save the Flat
//        flatRepository.save(flat);
//
//        return "redirect:/houseowner/flatList"; // Redirect to a page or confirmation
//    }

    @PostMapping("/addFlat")
    public String addFlat(@ModelAttribute Flat flat){
        houseOwnerService.addFlat(flat);
        return "registrationSuccess";
    }

    @GetMapping("/{id}/detail")//{id} will be included
    public String getById(@PathVariable Long id, Model model){
        Flat flat = houseOwnerService.getdetails(id);
        model.addAttribute("flat", flat);
        return "flat-detail";
    }

    @GetMapping("/update")//{id} will be included
    public String update(){
        return "Update";
    }

    @GetMapping("/addtenant")
    public String addTenant(Model model){
//        model.addAttribute("tenant", new Tenant());
        model.addAttribute("flat", flatRepository.findAll());
        return "addFlatMember";
    }
    @PostMapping("/addtenant")
    public String addTenant(@ModelAttribute Tenant tenant) {
        tenantRepository.save(tenant);
        return "registrationSuccess";
    }

//    @PostMapping("/{id}/addtenant")
//    public String addTenant(@ModelAttribute Tenant tenant){
//        tenantService.addtenant(tenant);
//        return "redirect:/addFlatMember";
//    }
}
