package br.gov.sp.fatec.projectlabiv.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin //Permite que o qualquer front-end de qualquer outro servidor acesse essa rota
public class MainController {
	
	@GetMapping
	public String hello() {
		return "Hello";
	}
	
}
