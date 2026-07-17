package com.uisrael.consumoweb.services;

import java.util.List;

import com.uisrael.consumoweb.model.dto.request.GrupoRequestDto;
import com.uisrael.consumoweb.model.dto.response.GrupoResponseDto;

public interface IGrupoService {
	List<GrupoResponseDto> listarGrupos();
	
	void guardarGrupo(GrupoRequestDto nuevo);
}
