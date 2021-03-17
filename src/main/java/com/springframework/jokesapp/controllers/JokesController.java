package com.springframework.jokesapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springframework.jokesapp.services.JokeService;

@Controller
public class JokesController {
	
	private final JokeService jokeService;

	@Autowired
	public JokesController(JokeService jokeService) {
		super();
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/jokes",""})
	public String showJoke(Model model) {
		
		model.addAttribute("jokes", jokeService.getJokes());
		return "index";
		
	}
	
	

}
