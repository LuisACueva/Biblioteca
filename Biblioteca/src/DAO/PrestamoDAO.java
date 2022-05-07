package DAO;

import java.util.Collection;

import Entidades.Prestamo;

public class PrestamoDAO implements operacionesCRUD<Prestamo>{

	@Override
	public boolean insertarConID(Prestamo elemento) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long insertarSinID(Prestamo elemento) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Prestamo buscarPorID(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Prestamo> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modificar(Prestamo elemento) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(Prestamo elemento) {
		// TODO Auto-generated method stub
		return false;
	}

}
