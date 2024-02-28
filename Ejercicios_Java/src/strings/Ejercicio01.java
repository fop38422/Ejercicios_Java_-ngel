package strings;

import java.util.Scanner;

/*
 * Programa que lee dos cadenas y muestra el número de veces
 * que la segunda está contenida en la primera.
 * 
 */

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce una primera cadena: ");
		String grande = sc.next();

		System.out.print("Introduce una segunda cadena: ");
		String peque = sc.next();

		sc.close();

		int veces = 0;
		int indice = 0;

		while (grande.indexOf(peque, indice) != -1) {
			veces++;
			indice += peque.length();
		}

		System.out.println("La segunda cadena está contenida en la primera " + veces + " veces.");
	}

}
