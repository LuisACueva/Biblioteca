package Entidades;

import Abstract.Evento;

public class Concurso extends Evento{

	private String tipo;
	private String premio;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPremio() {
		return premio;
	}
	public void setPremio(String premio) {
		this.premio = premio;
	}
	
	
}
