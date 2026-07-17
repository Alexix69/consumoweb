package com.uisrael.consumoweb.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.uisrael.consumoweb.model.dto.request.GrupoRequestDto;
import com.uisrael.consumoweb.model.dto.response.GrupoResponseDto;
import com.uisrael.consumoweb.services.IGrupoService;

@Service
public class GrupoServiceImpl implements IGrupoService {

	private final WebClient webClient;

	public GrupoServiceImpl(WebClient webClient) {
		this.webClient = webClient;
	}

	@Override
	public List<GrupoResponseDto> listarGrupos() {
		return webClient.get().uri("/grupo").retrieve().bodyToFlux(GrupoResponseDto.class).collectList().block();
	}

	@Override
	public void guardarGrupo(GrupoRequestDto nuevo) {
		webClient.post().uri("/grupo").bodyValue(nuevo).retrieve().toBodilessEntity().block();
	}

}
