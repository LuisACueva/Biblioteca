package Abstract;

public enum TipoConcurso {
	LITERATURA(1, "Literatura"),
	HISTORIA(2, "Historia"),
	CIENCIA(3, "Ciencia"),
	MATEMATICAS(4, "Matematicas"),
	GEOGRAFIA(5, "Geografia");
	
	private long idTipo;
	private String nomTipo;
	
	private TipoConcurso(long idTipo, String nomTipo) {
		this.idTipo = idTipo;
		this.nomTipo = nomTipo;
	}
}
