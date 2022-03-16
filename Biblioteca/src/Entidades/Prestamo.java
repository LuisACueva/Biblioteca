package Entidades;

import java.time.LocalDate;

import Abstract.Elemento;

public class Prestamo {
	
	private long idPrestamo;
	private LocalDate fechInicio;
	private LocalDate fechDevolucion;
	private Elemento[] listElemento = new Elemento[5];
	private String estado;
	
	public Prestamo(long id, LocalDate fechI, LocalDate fechD, Elemento[] listE, String estado) {
		this.idPrestamo = id;
		this.fechInicio = fechI;
		this.fechDevolucion = fechD;
		this.listElemento = listE;
		this.estado = estado;
	}
	
	public long getIdPrestamo() {
		return idPrestamo;
	}
	public void setIdPrestamo(long idPrestamo) {
		this.idPrestamo = idPrestamo;
	}
	public LocalDate getFechInicio() {
		return fechInicio;
	}
	public void setFechInicio(LocalDate fechInicio) {
		this.fechInicio = fechInicio;
	}
	public LocalDate getFechDevolucion() {
		return fechDevolucion;
	}
	public void setFechDevolucion(LocalDate fechDevolucion) {
		this.fechDevolucion = fechDevolucion;
	}
	public Elemento[] getListElemento() {
		return listElemento;
	}
	public void setListElemento(Elemento[] listElemento) {
		this.listElemento = listElemento;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
