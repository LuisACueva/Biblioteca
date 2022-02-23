package Entidades;

import Abstract.Elemento;

public class Dvd extends Elemento {

	private String nomDvd;

	public Dvd(String nomDvd) {
		this.nomDvd = nomDvd;
	}

	public String getNomDvd() {
		return nomDvd;
	}

	public void setNomDvd(String nomDvd) {
		this.nomDvd = nomDvd;
	}

	@Override
	public String toString() {
		return "Dvd [nomDvd=" + nomDvd + "]";
	}

}
