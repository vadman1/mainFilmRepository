package com.mainfilms.mainfilms.controllers;


import com.mainfilms.mainfilms.models.Film_100;
import com.mainfilms.mainfilms.repo.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainControllers {

    @Autowired
    private FilmRepository filmRepository;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "mainPage";
    }

    @GetMapping("/top-100")
    public String top100(Model model) {
        Iterable<Film_100> films_100 = filmRepository.findAll();
        model.addAttribute("films", films_100);
        return "top-100";
    }



}
