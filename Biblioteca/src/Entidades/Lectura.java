package Entidades;

import Abstract.Evento;

public class Lectura extends Evento{
	
	private Libro libro;
	
	public Lectura(Libro libro) {
		super();
		this.libro = libro;
	}
	
	public Libro getLibro() {
		return this.libro;
	}
	
	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	
	
}
