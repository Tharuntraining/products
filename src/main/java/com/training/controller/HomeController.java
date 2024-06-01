package com.training.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("getmoviecatalog")
	public String getWelcomeMessage() {
		return "welcome to movie catalog";
	}

}
