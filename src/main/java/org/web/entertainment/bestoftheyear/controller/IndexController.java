package org.web.entertainment.bestoftheyear.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String info(Model model) {
        model.addAttribute("name", "Nikol");
        return "index";
    }
}
