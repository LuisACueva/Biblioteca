package Entidades;

import Abstract.Evento;

public class Visionado extends Evento{
	
	private String pelicula;
	private String aula;
	
	public Visionado(String pelicula, String aula) {
		this.pelicula = pelicula;
		this.aula = aula;
	}
	
	public String getPelicula() {
		return pelicula;
	}
	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}
	public String getAula() {
		return aula;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}

	@Override
	public String toString() {
		return "Visionado [pelicula=" + pelicula + ", aula=" + aula + "]";
	}
	
}
