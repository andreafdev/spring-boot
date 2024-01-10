package com.gerenation.bsm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bsm")
public class BSM {
	
	@GetMapping
	public String Bsm( ) {
		return "Responsabilidade Pessoal, "
				+ "\n Mentalidade de Crescimento, "
				+ "\n Orientação ao futuro, "
				+ "\n Persistência, "
				+ "\n Comunicação, "
				+ "\n Atenção aos detalhes, "
				+ "\n Atenção aos detalhes, "
				+ "\n Trabalho em equipe, "
				+ "\n Persistência, ";
	}
	
}