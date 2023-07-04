package com.charity.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Slf4j
@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(Model model){
        return "user/index.html";
    }
    @GetMapping("/gallery")
    public String gallery(Model model){
    	return "user/gallery.html";
    }
    @GetMapping("/contact")
    public String contact(Model model){
    	return "user/contact.html";
    }
    @GetMapping("/donate")
    public String donate(Model model){
    	return "user/donate.html";
    }
    @GetMapping("/about")
    public String about(Model model){
    	return "user/about.html";
    }
}
