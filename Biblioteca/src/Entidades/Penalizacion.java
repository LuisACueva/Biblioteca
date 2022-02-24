package Entidades;

import java.time.LocalDate;

public class Penalizacion {

	private long idPenalizacion;
	private String motivo;
	private LocalDate vigencia;

	public Penalizacion() {

	}

	public Penalizacion(String motivo, LocalDate vigencia) {
		this.motivo = motivo;
		this.vigencia = vigencia;
	}

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

	@Override
	public String toString() {
		return "Penalizacion [idPenalizacion=" + idPenalizacion + ", motivo=" + motivo + ", vigencia=" + vigencia + "]";
	}
}
