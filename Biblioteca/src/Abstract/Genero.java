package Abstract;

public enum Genero {
	
	AVENTURA(1, "Aventura"),
	TERROR(2, "Terror"),
	AMOR(3, "Amor"),
	COMEDIA(4, "Comedia"),
	HISTORIA(5, "Historia");
	
	private long idGenero;
	private String nomGenero;
	
	private Genero(long idGenero, String nomGenero) {
		this.idGenero = idGenero;
		this.nomGenero = nomGenero;
	}

}
