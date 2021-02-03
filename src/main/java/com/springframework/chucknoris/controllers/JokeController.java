package com.springframework.chucknoris.controllers;

import com.springframework.chucknoris.services.ChuckNorisJoke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    public final ChuckNorisJoke chuckNorisJoke;

    @Autowired
    public JokeController(ChuckNorisJoke chuckNorisJoke) {
        this.chuckNorisJoke = chuckNorisJoke;
    }

    @RequestMapping({"/", ""})
    String showJoke(Model model) {
        model.addAttribute("joke", chuckNorisJoke.getJoke());
        return "chucknorris";
    }
}
