package com.charity.controller;

import com.charity.model.Lover;
import com.charity.repository.LoverRepository;
import com.charity.service.LoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DonateController {
    @Autowired
    private LoverRepository loverRepository;

    @Autowired
    private LoverService loverService;
    @GetMapping("/donate/{pageNumber}")
    public String donate(Model model, @PathVariable("pageNumber")int pageNumber) {
        Page<Lover> pageLover = loverService.getAllLoverDonate(pageNumber);
        List<Lover> listLover = pageLover.getContent();
        model.addAttribute("currentPage",pageNumber);
        model.addAttribute("totalPages",pageLover.getSize());
        model.addAttribute("listLover",listLover);
        return "user/donate.html";
    }
}
