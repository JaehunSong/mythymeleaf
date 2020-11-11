package com.example.mythymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    public String greetinh(@RequestParam(name = "name", required = false, defaultValue = "World") String name,  Model model){
        model.addAttribute(name, "name");
        return "greeting";
    }
}
