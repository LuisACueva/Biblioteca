package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

import Entidades.Socio;
import Utilidades.ConexBD;

public class SocioDAO implements operacionesCRUD<Socio>{
	Connection conex;

	public SocioDAO(Connection conex) {
		if (this.conex == null)
			this.conex = conex;
	}
	
	@Override
	public boolean insertarConID(Socio elemento) {
		boolean ret = false;

		String consultaInsertStr1 = "insert into socios(idSocio, nomSocio, priApellido, secApellido, nif, telefono, direccion) values (?,?,?,?,?,?,?)";
		
		try {
			if (this.conex == null || this.conex.isClosed())
				this.conex = ConexBD.establecerConexion();
			PreparedStatement pstmt = conex.prepareStatement(consultaInsertStr1);
			pstmt.setLong(1, elemento.getIdSocio());
			pstmt.setString(2, elemento.getNomSocio());
			pstmt.setString(3, elemento.getPriApellido());
			pstmt.setString(4, elemento.getSecApellido());
			pstmt.setString(5, elemento.getNif());
			pstmt.setString(6, elemento.getTelefono());
			pstmt.setString(7, elemento.getDireccion());
			int resultadoInsercion = pstmt.executeUpdate();
			if(resultadoInsercion == 1) {
				ret = true;
			}
		} catch (SQLException e) {
			System.out.println("Se ha producido una SQLException:" + e.getMessage());
			e.printStackTrace();
			return false;
		}

		return ret;
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
