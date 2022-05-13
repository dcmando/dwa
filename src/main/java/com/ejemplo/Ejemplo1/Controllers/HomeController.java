package com.ejemplo.Ejemplo1.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String Saludo() {
		return "ejemplo";
	}
	
	@GetMapping("/Ejemplo1")
	public String Ejemplo1() {
		return "ejemplo1";
	}
}
