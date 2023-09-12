package org.web.entertainment.bestoftheyear.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.web.entertainment.bestoftheyear.model.Info;

@Controller
@RequestMapping ("/")
public class IndexController {

    @GetMapping
    public String info(Model model){
        Info myInfo = new Info("Nikol", "Graminova");
        model.addAttribute("info", myInfo);
        return "index";
    }

    @GetMapping ("movies")
    public String movies(){
        return "movies";
    }
    @GetMapping ("songs")
    public String songs(){
        return "songs";
    }
}
