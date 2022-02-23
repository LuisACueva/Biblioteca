package Entidades;

import Abstract.Evento;
import Abstract.TipoConcurso;

public class Concurso extends Evento {

	private TipoConcurso tipo;
	private String premio;

	public Concurso() {
		super();
	}

	public Concurso(TipoConcurso tipo) {
		this.tipo = tipo;
	}

	public TipoConcurso getTipo() {
		return tipo;
	}

	public void setTipo(TipoConcurso tipo) {
		this.tipo = tipo;
	}

	public String getPremio() {
		return premio;
	}

	public void setPremio(String premio) {
		this.premio = premio;
	}

	@Override
	public String toString() {
		return "Concurso [idtipo=" + tipo + ", premio=" + premio + "]";
	}

	
}
