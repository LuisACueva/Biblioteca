package Utilidades;

import java.time.LocalDate;

import Abstract.Elemento;
import Abstract.Evento;
import Entidades.Concurso;
import Entidades.Curso;
import Entidades.Dvd;
import Entidades.Libro;
import Entidades.Lote;
import Entidades.Prestamo;
import Entidades.Proveedor;
import Entidades.Socio;

public class Datos {
	
	public static Socio[] SOCIOS= {
			new Socio(1, "Luis", "Alvarez", "Cueva", "74851364L", "695417845", "C/Fake 123"), 
			new Socio(2, "Pablo", "Jimenez", "Calleja", "75448963U", "618112254", "C/Cajal 356"), 
			new Socio(3, "Beatriz", "Sanchez", "Fernandez", "87444755P", "651269365", "C/Las Rosas 447"), 
			new Socio(4, "Julio", "Bola", "Cuadrado", "23666553H", "612365524", "C/Pablo Iglesias 23"), 
			new Socio(5, "Pablo", "Nunez", "Alvarez", "879999665D", "699583321", "C/Argentina 36"),
	};
	
	public static Proveedor[] PROVEEDORES= {
			new Proveedor(1, "Javier", "669985471"), 
			new Proveedor(2, "Dante", "645448761"), 
			new Proveedor(3, "Pedro", "612363658"), 
			new Proveedor(4, "Amanda", "644785125"), 
			new Proveedor(5, "Laura", "698987456")
	};
	
//	public static Prestamo[] PRESTAMOS= {
//			new Prestamo(1, LocalDate.of(2020, 6, 25), LocalDate.of(2021, 7, 8), ,), 
//			new Prestamo(2,), 
//			new Prestamo(3,), 
//			new Prestamo(4,), 
//			new Prestamo(5,)
//	};
	
	public static Evento[] EVENTOS= {
			new Concurso(), 
			new Concurso(), 
			new Concurso(), 
			new Concurso(), 
			new Concurso(),
			
			new Curso(), 
			new Curso(), 
			new Curso(), 
			new Curso(), 
			new Curso()
	};
	
	public static Lote[] LOTES= {
			new Lote(), 
			new Lote(), 
			new Lote(), 
			new Lote(), 
			new Lote(),
	};
	
//	public static Elemento[] ELEMENTOS = {
//			new Libro(), 
//			new Libro(), 
//			new Libro(), 
//			new Libro(), 
//			new Libro(),
//			
//			new Dvd(), 
//			new Dvd(), 
//			new Dvd(), 
//			new Dvd(), 
//			new Dvd()
//	}
}
