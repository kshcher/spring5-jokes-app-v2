package com.example.demo.controllers;

import com.example.demo.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JokeController {
    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public ModelAndView getJoke() {
        ModelAndView modelAndView = new ModelAndView("/index.html");
        modelAndView.addObject("joke", jokeService.getJoke());
        return modelAndView;
    }
}
