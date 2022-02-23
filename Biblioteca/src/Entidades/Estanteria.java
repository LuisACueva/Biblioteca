package Entidades;

import java.util.ArrayList;

import Abstract.Elemento;

public class Estanteria {

	private long idEstanteria;
	private String codEstanteria; // Letra Mayuscula, Ubicacion
	private boolean completa; // True para completa, False si tiene espacio disponible
	private ArrayList<Elemento> listElemento;

	public Estanteria() {

	}

	public Estanteria(long idEstanteria, String codEstanteria, boolean completa, ArrayList<Elemento> listElemento) {
		this.idEstanteria = idEstanteria;
		this.codEstanteria = codEstanteria;
		this.completa = completa;
		this.listElemento = listElemento;
	}

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

	public ArrayList<Elemento> getListElemento() {
		return listElemento;
	}

	public void setListElemento(ArrayList<Elemento> listElemento) {
		this.listElemento = listElemento;
	}

	@Override
	public String toString() {
		return "Estanteria [idEstanteria=" + idEstanteria + ", codEstanteria=" + codEstanteria + ", completa="
				+ completa + ", listElemento=" + listElemento + "]";
	}

}
