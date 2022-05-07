package DAO;

import java.util.Collection;

import Entidades.Socio;

public class SocioDAO implements operacionesCRUD<Socio>{

	@Override
	public boolean insertarConID(Socio elemento) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long insertarSinID(Socio elemento) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Socio buscarPorID(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Socio> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modificar(Socio elemento) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(Socio elemento) {
		// TODO Auto-generated method stub
		return false;
	}

}
