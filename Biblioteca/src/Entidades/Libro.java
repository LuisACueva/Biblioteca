package Entidades;

import Abstract.Elemento;

public class Libro extends Elemento {

	private String nomLibro;
	private String editorial;
	private String autor;
	private int numPaginas;

	public Libro() {
		super();
	}

	public Libro(String nomLibro, String editorial, String autor, int numPaginas) {
		super();
		this.nomLibro = nomLibro;
		this.editorial = editorial;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}

	public String getNomLibro() {
		return nomLibro;
	}

	public void setNomLibro(String nomLibro) {
		this.nomLibro = nomLibro;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	@Override
	public String toString() {
		return "Libro [nomLibro=" + nomLibro + ", editorial=" + editorial + ", autor=" + autor + ", numPaginas="
				+ numPaginas + "]";
	}
	
}
