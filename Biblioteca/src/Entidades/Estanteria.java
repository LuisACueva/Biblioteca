package Entidades;

import Abstract.Elemento;

public class Estanteria {

	private long idEstanteria;
	private String codEstanteria;
	private boolean completa; //True para completa, False si tiene espacio disponible
	
	public long getIdEstanteria() {
		return idEstanteria;
	}
	public void setIdEstanteria(long idEstanteria) {
		this.idEstanteria = idEstanteria;
	}
	public String getCodEstanteria() {
		return codEstanteria;
	}
	public void setCodEstanteria(String codEstanteria) {
		this.codEstanteria = codEstanteria;
	}
	public boolean isCompleta() {
		return completa;
	}
	public void setCompleta(boolean completa) {
		this.completa = completa;
	}
	
}
