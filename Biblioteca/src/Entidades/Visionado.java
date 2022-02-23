package Entidades;

import Abstract.Evento;

public class Visionado extends Evento {

	private Dvd pelicula;
	private String aula;

	public Visionado(Dvd pelicula, String aula) {
		this.pelicula = pelicula;
		this.aula = aula;
	}

	public Dvd getPelicula() {
		return pelicula;
	}

	public void setPelicula(Dvd pelicula) {
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
