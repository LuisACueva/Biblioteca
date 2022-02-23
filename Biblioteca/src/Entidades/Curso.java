package Entidades;

import Abstract.Evento;

public class Curso extends Evento {

	private int duracion;
	private String aula;

	public Curso() {

	}

	public Curso(int duracion, String aula) {
		this.aula = aula;
		this.duracion = duracion;
	}

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

	@Override
	public String toString() {
		return "Curso [duracion=" + duracion + ", aula=" + aula + "]";
	}

}
