package com.uisrael.consumoweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uisrael.consumoweb.model.dto.request.GrupoRequestDto;
import com.uisrael.consumoweb.model.dto.response.GrupoResponseDto;
import com.uisrael.consumoweb.services.IGrupoService;

@Controller
@RequestMapping("/grupo") // url
public class GrupoController {

	@Autowired
	private IGrupoService servicioGrupo;

	@GetMapping
	public String leerPagina(Model model) {
		List<GrupoResponseDto> resultadoBD = servicioGrupo.listarGrupos();
		System.out.println(resultadoBD);
		model.addAttribute("listagrupos", resultadoBD);
		return "/grupos/listargrupo"; // ruta física de la página
	}

	@GetMapping("/nuevo")
	public String crearGrupo(Model model) {
		model.addAttribute("grupo", new GrupoRequestDto());
		return "/grupos/creargrupo";
	}

	@PostMapping("/guardar")
	public String guardarGrupo(@ModelAttribute GrupoRequestDto grupo) {
		servicioGrupo.guardarGrupo(grupo);
		return "redirect:/grupo";
	}
}
