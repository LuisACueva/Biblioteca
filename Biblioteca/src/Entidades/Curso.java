package Entidades;

import Abstract.Evento;

public class Curso extends Evento {
	
	private int duracion;
	private String aula;
	
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getAula() {
		return aula;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	

}
