package Entidades;

import java.time.LocalDate;

public class Prestamo {
	
	private long idPrestamo;
	private LocalDate fechInicio;
	private LocalDate fechDevolucion;
	
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
	
	
}
