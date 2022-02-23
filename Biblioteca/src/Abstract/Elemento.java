package Abstract;

import Abstract.Genero;

public abstract class Elemento {
	
	private long idElemento;
	private Genero genElemento;

	public long getIdElemento() {
		return idElemento;
	}

	public void setIdElemento(long idElemento) {
		this.idElemento = idElemento;
	}
	
	public Genero getGenElemento() {
		return genElemento;
	}

	public void setGenElemento(Genero genElemento) {
		this.genElemento = genElemento;
	}

}
