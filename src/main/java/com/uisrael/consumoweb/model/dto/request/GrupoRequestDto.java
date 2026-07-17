package com.uisrael.consumoweb.model.dto.request;

import lombok.Data;

@Data
public class GrupoRequestDto {
	private int idGrupo;
	private String nombre;
	private String descripcion;
	private boolean estadoRegistro;
}
