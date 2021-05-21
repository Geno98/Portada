package com.dwa.portada.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Demo {
	@GetMapping("/Portada")
	public String Portada() {
		return "demo/Portada";
	}

}
