package Entidades;

import java.time.LocalDate;

public class Penalizacion {

	private long idPenalizacion;
	private String motivo;
	private LocalDate vigencia;
	
	public long getIdPenalizacion() {
		return idPenalizacion;
	}
	public void setIdPenalizacion(long idPenalizacion) {
		this.idPenalizacion = idPenalizacion;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public LocalDate getVigencia() {
		return vigencia;
	}
	public void setVigencia(LocalDate vigencia) {
		this.vigencia = vigencia;
	}
	
	
}
