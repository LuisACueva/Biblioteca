package Utilidades;

import java.util.Scanner;

public class Validaciones {

	public static int validarMenu(String str, int min, int max) {
		Scanner sc = new Scanner(System.in);
		boolean valid = false;
		int opc;
		
		do {
			System.out.println(str);
			opc = sc.nextInt();
			if(opc>=min || opc<=max) {
				valid = true;
			}
		}while(!valid);
		
		return opc;
	}
}
