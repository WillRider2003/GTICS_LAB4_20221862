package org.example.apisgtics.controller;

import org.example.apisgtics.repository.ApisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class apisController {


    @Autowired
    private ApisRepository apisRepository;


    @GetMapping("/apis")
    public String listApis(Model model) {


        model.addAttribute("apis", apisRepository.findAll());


        return "apis";
    }
}
