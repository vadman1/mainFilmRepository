package com.mainfilms.mainfilms;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainControllers {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "mainPage";
    }

    @GetMapping("/top-100")
    public String top100(Model model) {
        model.addAttribute("title", "Топ-100");
        return "top-100";
    }

}
