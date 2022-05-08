package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import Entidades.Libro;
import Utilidades.ConexBD;

public class LibroDAO implements operacionesCRUD<Libro> {
	Connection conex;

	public LibroDAO(Connection conex) {
		if (this.conex == null)
			this.conex = conex;
	}

	@Override
	public boolean insertarConID(Libro elemento) {
		boolean ret = false;

		String consultaInsertStr1 = "insert into libros(idLibro, nomLibro, editorial, autor, numPaginas) values (?,?,?,?,?)";

		try {
			if (this.conex == null || this.conex.isClosed())
				this.conex = ConexBD.establecerConexion();
			PreparedStatement pstmt = conex.prepareStatement(consultaInsertStr1);
			pstmt.setLong(1, elemento.getIdElemento());
			pstmt.setString(2, elemento.getNomLibro());
			pstmt.setString(3, elemento.getEditorial());
			pstmt.setString(4, elemento.getAutor());
			pstmt.setInt(5, elemento.getNumPaginas());
			int resultadoInsercion = pstmt.executeUpdate();
			if (resultadoInsercion == 1) {
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
	public long insertarSinID(Libro elemento) {
		long ret = -1;

		String consultaInsertStr1 = "insert into libros(nomLibro, editorial, autor, numPaginas) values (?,?,?,?)";

		try {
			if (this.conex == null || this.conex.isClosed())
				this.conex = ConexBD.establecerConexion();
			PreparedStatement pstmt1 = conex.prepareStatement(consultaInsertStr1);
			pstmt1.setString(1, elemento.getNomLibro());
			pstmt1.setString(2, elemento.getEditorial());
			pstmt1.setString(3, elemento.getAutor());
			pstmt1.setInt(4, elemento.getNumPaginas());
			int resultadoInsercion = pstmt1.executeUpdate();
			if (resultadoInsercion == 1) {
				String consultaSelect1 = "SELECT id FROM libros WHERE (nomLibro=? AND editorial=? AND autor=? AND numPaginas=?)";
				PreparedStatement pstmt2 = conex.prepareStatement(consultaSelect1);
				pstmt2.setString(1, elemento.getNomLibro());
				pstmt2.setString(2, elemento.getEditorial());
				pstmt2.setString(3, elemento.getAutor());
				pstmt2.setInt(4, elemento.getNumPaginas());
				ResultSet result = pstmt2.executeQuery();
				while (result.next()) {
					long idlibro = result.getLong("idLibro");
					if (idlibro != -1) {
						System.out.println(
								"Se ha insertado correctamente el nuevo Libro de id: " + idlibro);
						if (conex != null)
							conex.close();
						return idlibro;
					}
				}
			}
			
		} catch (

		SQLException e) {
			System.out.println("Se ha producido una SQLException:" + e.getMessage());
			e.printStackTrace();
			return -1;
		}

		return ret;
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
