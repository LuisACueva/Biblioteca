package Main;

import java.sql.Connection;
import java.util.Scanner;

import Utilidades.ConexBD;
import Utilidades.Validaciones;

public class MainBiblioteca {
	
	static String menu0 = "Bienvenido a la Biblioteca.\n" + 
							"Seleccione su tipo de Usuario:\n" + 
							"\t\t1. Gestion de Socios.\n" + 
							"\t\t2. Gestion de Proveedores.\n" + 
							"\t\t3. Gestion de Prestamos.\n" +
							"\t\t4. Gestion de Eventos.\n" + 
							"\t\t5. Gestion de Lotes.\n" + 
							"\t\t0. Salir de la Biblioteca.\n";
	
	static String menu01 = "Bienvenido al menú de Gestion Socios:" +
							"\t\t1. Mostar Socios." +
							"\t\t2. Buscar Socio." +
							"\t\t3. Agregar Socio." +
							"\t\t4. Exportar Socios." +
							"\t\t5. Importar Socios." +
							"\t\t0. Volver al Menu Principal.";
	
	static String menu02 = "Bienvenido al menú de Gestion de Proveedores:" +
							"\t\t1. Mostar Proveedores." + 
							"\t\t2. Buscar Proveedor." +
							"\t\t3. Agregar Proveedor." +
							"\t\t4. Exportar Proveedores." +
							"\t\t5. Importar Proveedores." +
							"\t\t0. Volver al Menu Principal.";
	
	static String menu03 = "Bienvenido al menú de Gestion de Prestamos:" +
							"\t\t1. Mostar Prestamos." + 
							"\t\t2. Nuevo Prestamo." +
							"\t\t3. Editar Prestamo." +
							"\t\t4. Exportar Prestamos." +
							"\t\t5. Importar Prestamos." +
							"\t\t0. Volver al Menu Principal.";
	
	static String menu04 = "Bienvenido al menú de Gestion de Eventos:" +
							"\t\t1. Mostar Prestamos." + 
							"\t\t2. Nuevo Prestamo." +
							"\t\t3. Editar Prestamo." +
							"\t\t4. Exportar Prestamos." +
							"\t\t5. Importar Prestamos." +
							"\t\t0. Volver al Menu Principal.";
	
	static String menu05 = "Bienvenido al menú de Gestion de Lotes:" +
							"\t\t1. Mostar Prestamos." + 
							"\t\t2. Nuevo Prestamo." +
							"\t\t3. Editar Prestamo." +
							"\t\t4. Exportar Prestamos." +
							"\t\t5. Importar Prestamos." +
							"\t\t0. Volver al Menu Principal.";
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Biblioteca");
		System.out.println("Por Luis Álvarez Cueva");

		boolean pass = false;
		do {
			//Menu principal de la aplicacion por actualizar
			
			switch(Validaciones.validarMenu(menu0, 0, 5)) {
			case 0:
				pass = true;
				break;
			case 1:
				switch(Validaciones.validarMenu(menu01, 0, 5)) {
				case 0:
					break;
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				};
				break;
			case 2:
				switch(Validaciones.validarMenu(menu02, 0, 5)) {
				case 0:
					break;
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				};
				break;
			case 3:
				switch(Validaciones.validarMenu(menu03, 0, 5)) {
				case 0:
					break;
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				};
				break;
			case 4:
				switch(Validaciones.validarMenu(menu04, 0, 5)) {
				case 0:
					break;
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				};
				break;
			case 5:
				switch(Validaciones.validarMenu(menu05, 0, 5)) {
				case 0:
					break;
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				};
				break;
			}

		} while (!pass);
	}

}
