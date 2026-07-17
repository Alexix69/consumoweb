package com.uisrael.consumoweb.model.dto.response;

import lombok.Data;

@Data
public class GrupoResponseDto {
	private int idGrupo;
	private String nombre;
	private String descripcion;
	private boolean estadoRegistro;
}
