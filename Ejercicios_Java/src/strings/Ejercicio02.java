package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Escribe un programa que lea dos cadenas y muestre el número de veces que encuentra cada palabra de
la primera dentro de la segunda
 */

public class Ejercicio02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Introduce una frase: ");
		String cadena1 = bf.readLine();

		System.out.print("Introduce otra frase: ");
		String cadena2 = bf.readLine();

		Scanner sc = new Scanner(cadena1);

		while (sc.hasNext()) {
			String palabra = sc.next();
			int veces = vecesContenida(cadena2, palabra);
			System.out.println("La palabra " + palabra + " está contenida " + veces + " veces en la segunda frase.");
		}

		sc.close();
	}

	public static int vecesContenida(String cadena, String palabra) {
		int veces = 0;
		int indice = 0;

		while (cadena.indexOf(palabra, indice) != -1) {
			veces++;
			indice += palabra.length();
		}

		return veces;
	}

}
