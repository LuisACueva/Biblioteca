package Abstract;

import java.time.LocalDateTime;

public abstract class Evento {

	private long idEvento;
	private String nomEvento;
	private LocalDateTime fechEvento;
	
	public long getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(long idEvento) {
		this.idEvento = idEvento;
	}
	public String getNomEvento() {
		return nomEvento;
	}
	public void setNomEvento(String nomEvento) {
		this.nomEvento = nomEvento;
	}
	public LocalDateTime getFechEvento() {
		return fechEvento;
	}
	public void setFechEvento(LocalDateTime fechEvento) {
		this.fechEvento = fechEvento;
	}
	
	
}
