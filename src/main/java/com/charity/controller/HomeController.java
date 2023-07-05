package com.charity.controller;

import com.charity.service.MailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Slf4j
@Controller
public class HomeController {

    @Autowired
    private MailService mailService1;

    @GetMapping({"/","/home"})
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

    @PostMapping("/sendMailHome")
    public String sendMail(Model model,
                           @RequestParam("contactName")String name,
                           @RequestParam("contactEmail") String email,
                           @RequestParam("contactSubject") String subject,
                           @RequestParam("contactMessage") String message,
                           RedirectAttributes ra){
        try {
            mailService1.sendEmail(name,email,subject,message);
        }catch (Exception e){
            e.printStackTrace();

        }

        return "redirect:/home";
    }
}
