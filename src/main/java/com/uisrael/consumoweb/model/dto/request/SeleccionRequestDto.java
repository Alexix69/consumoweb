package com.uisrael.consumoweb.model.dto.request;

import lombok.Data;

@Data
public class SeleccionRequestDto {
	private int idSeleccion;
	private String nombre;
	private String descripcion;
	private boolean estadoRegistro;
}
