package Entidades;

public class Socio {
	
	private long numSocio;	//identificador único de cada socio
	private String nomSocio;
	private String priApellido;
	private String secApellido;
	private String nif;
	private String telefono;
	private String direccion;
	
	public long getNumSocio() {
		return numSocio;
	}
	public void setNumSocio(long numSocio) {
		this.numSocio = numSocio;
	}
	public String getNomSocio() {
		return nomSocio;
	}
	public void setNomSocio(String nomSocio) {
		this.nomSocio = nomSocio;
	}
	public String getPriApellido() {
		return priApellido;
	}
	public void setPriApellido(String priApellido) {
		this.priApellido = priApellido;
	}
	public String getSecApellido() {
		return secApellido;
	}
	public void setSecApellido(String secApellido) {
		this.secApellido = secApellido;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
