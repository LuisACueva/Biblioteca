package DAO;

import java.util.Collection;

import Entidades.Libro;

public class LibroDAO implements operacionesCRUD<Libro>{

	@Override
	public boolean insertarConID(Libro elemento) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long insertarSinID(Libro elemento) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Libro buscarPorID(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Libro> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modificar(Libro elemento) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(Libro elemento) {
		// TODO Auto-generated method stub
		return false;
	}

}
