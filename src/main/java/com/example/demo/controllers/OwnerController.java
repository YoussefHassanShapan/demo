package com.example.demo.controllers;


import com.example.demo.repositories.OwnerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {
    private final OwnerRepository ownerRepository;
    public OwnerController(OwnerRepository ownerRepository){
        this.ownerRepository = ownerRepository;
    }
    @GetMapping("/ownerlist")
    public String getAll(Model model){
        model.addAttribute("owners", this.ownerRepository.findAll());
        return "owners/ownerlist"; // Ensure this path matches the directory structure
    }
}
