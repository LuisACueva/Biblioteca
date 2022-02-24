package Entidades;

import java.time.LocalDate;
import java.util.ArrayList;

import Abstract.Elemento;

public class Lote {

	private long idLote;
	private LocalDate llegadaDate;
	private ArrayList<Elemento> listElemento;
	private Proveedor proveedor;
	
	public Lote() {
		
	}
	
	public Lote(LocalDate llegadaDate, ArrayList<Elemento> listElemento, Proveedor proveedor) {
		this.llegadaDate = llegadaDate;
		this.listElemento = listElemento;
		this.proveedor = proveedor;
	}
	
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
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	@Override
	public String toString() {
		return "Lote [idLote=" + idLote + ", llegadaDate=" + llegadaDate + ", listElemento=" + listElemento
				+ ", proveedor=" + proveedor + "]";
	}
}
