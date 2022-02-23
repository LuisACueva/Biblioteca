package Entidades;

import Abstract.Evento;

public class Lectura extends Evento{
	
	private String libro;
	
	public Lectura(String libro) {
		this.libro = libro;
	}
	
	public String getLibro() {
		return this.libro;
	}
	
	public void setLibro(String libro) {
		this.libro = libro;
	}

	@Override
	public String toString() {
		return "Lectura [libro=" + libro + "]";
	}
	
}
