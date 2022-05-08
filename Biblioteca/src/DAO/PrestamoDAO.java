package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

import Entidades.Prestamo;
import Utilidades.ConexBD;

public class PrestamoDAO implements operacionesCRUD<Prestamo>{
	Connection conex;

	public PrestamoDAO(Connection conex) {
		if (this.conex == null)
			this.conex = conex;
	}
	
	@Override
	public boolean insertarConID(Prestamo elemento) {
		boolean ret = false;

//		String consultaInsertStr1 = "insert into personas(idLibro, nomLibro, editorial, autor, numPaginas) values (?,?,?,?,?)";
//		
//		try {
//			if (this.conex == null || this.conex.isClosed())
//				this.conex = ConexBD.establecerConexion();
//			PreparedStatement pstmt = conex.prepareStatement(consultaInsertStr1);
//			pstmt.setLong(1, elemento.getIdElemento());
//			pstmt.setString(2, elemento.getNomLibro());
//			pstmt.setString(3, elemento.getEditorial());
//			pstmt.setString(4, elemento.getAutor());
//			pstmt.setInt(5, elemento.getNumPaginas());
//			int resultadoInsercion = pstmt.executeUpdate();
//			if(resultadoInsercion == 1) {
//				ret = true;
//			}
//		} catch (SQLException e) {
//			System.out.println("Se ha producido una SQLException:" + e.getMessage());
//			e.printStackTrace();
//			return false;
//		}

		return ret;
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
