package com.uisrael.consumoweb.model.dto.request;

import java.util.Date;

import lombok.Data;

@Data
public class JugadorRequestDto {
	private int idJugador;
	private String nombre;
	private String apellido;
	private int numero;
	private String ci;
	private Date fechaNacimiento;
}
