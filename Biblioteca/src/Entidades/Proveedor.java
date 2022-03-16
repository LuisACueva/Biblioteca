package Entidades;

public class Proveedor {

	private long idProveedor;
	private String nomProveedor;
	private String telefono;
	
	public Proveedor(long id, String nom, String tel) {
		this.idProveedor = id;
		this.nomProveedor = nom;
		this.telefono = tel;
	}
	
	public long getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(long idProveedor) {
		this.idProveedor = idProveedor;
	}
	public String getNomProveedor() {
		return nomProveedor;
	}
	public void setNomProveedor(String nomProveedor) {
		this.nomProveedor = nomProveedor;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
