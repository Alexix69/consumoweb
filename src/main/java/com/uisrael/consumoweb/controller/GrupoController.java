package com.uisrael.consumoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/grupo") //url
public class GrupoController {

	@GetMapping
	public String leerPagina() {
		return "/grupos/listargrupo"; //ruta física de la página
	}
}
