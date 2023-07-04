package com.charity.controller;

import com.charity.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ContactController {
    @Autowired
    private MailService mailService1;
    @PostMapping("/sendMail")
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

    return "user/contact.html";
    }
}
