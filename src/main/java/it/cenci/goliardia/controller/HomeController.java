package it.cenci.goliardia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		return "home";
	}
	
	@GetMapping("/login")
	public String index(Model model) {
		return "login";
	}
}
