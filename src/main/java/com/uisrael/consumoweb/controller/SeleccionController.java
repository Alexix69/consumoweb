package com.uisrael.consumoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/seleccion") //url
public class SeleccionController {

	@GetMapping
	public String leerPagina() {
		return "/seleccion/listarseleccion"; //ruta física de la página
	}
}
