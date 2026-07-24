package com.uisrael.consumoweb.model.dto.response;



public class SeleccionResponseDto {
	private int idSeleccion;
	private String nombre;
	private String descripcion;
	private boolean estadoRegistro;
	private GrupoResponseDto fkGrupo;
	
	public int getIdSeleccion() {
		return idSeleccion;
	}
	public void setIdSeleccion(int idSeleccion) {
		this.idSeleccion = idSeleccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isEstadoRegistro() {
		return estadoRegistro;
	}
	public void setEstadoRegistro(boolean estadoRegistro) {
		this.estadoRegistro = estadoRegistro;
	}
	public GrupoResponseDto getFkGrupo() {
		return fkGrupo;
	}
	public void setFkGrupo(GrupoResponseDto fkGrupo) {
		this.fkGrupo = fkGrupo;
	}
}
