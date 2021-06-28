package com.faraz.chucknorrisjokesassignment.controllers;

import com.faraz.chucknorrisjokesassignment.services.GetJokes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final GetJokes getJokes;

    public JokesController(GetJokes getJokes) {
        this.getJokes = getJokes;
    }

    @RequestMapping("/getJokes")
    public String getJoke(Model model){
        model.addAttribute("joke",getJokes.getRandomQuote());
        return "jokes/joke";
    }
}
