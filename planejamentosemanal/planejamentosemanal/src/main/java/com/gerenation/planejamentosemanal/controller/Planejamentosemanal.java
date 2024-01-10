package com.gerenation.planejamentosemanal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("plano")
public class Planejamentosemanal{
	
	@GetMapping
	public String Planejamento( ) {
		return "1 - Estudar mais, "
				+ "\n 2- Revisar os conteúdos da GEN, "
				+ "\n 3- Realizar de um á dois commits por semana no Github, "
				+ "\n 4- Me alimentar melhor";
				
	}
	
}