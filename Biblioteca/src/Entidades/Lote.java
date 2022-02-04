package Entidades;

import java.time.LocalDate;
import java.util.ArrayList;

import Abstract.Elemento;

public class Lote {

	private long idLote;
	private LocalDate llegadaDate;
	private ArrayList<Elemento> listElemento;
	
	public long getIdLote() {
		return idLote;
	}
	public void setIdLote(long idLote) {
		this.idLote = idLote;
	}
	public LocalDate getLlegadaDate() {
		return llegadaDate;
	}
	public void setLlegadaDate(LocalDate llegadaDate) {
		this.llegadaDate = llegadaDate;
	}
	public ArrayList<Elemento> getListElemento() {
		return listElemento;
	}
	public void setListElemento(ArrayList<Elemento> listElemento) {
		this.listElemento = listElemento;
	}
	
	
}
