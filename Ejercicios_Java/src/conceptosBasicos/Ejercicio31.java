package conceptosBasicos;

import java.util.Scanner;

/*Escribe un programa que incluya un
método que lleve como parámetro
un String introducido por teclado y
que busque en él las vocales
indicándonos la posición en la que
están*/

public class Ejercicio31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe una palabra o enunciado: ");
		String cosa = sc.next();
		sc.close();
		int n = cosa.length();
		sacaVocales(cosa, n);
	}

	static void sacaVocales(String cosa, int n) {
		for (int i = 0; i < n; i++) {
			char letra = cosa.charAt(i);
			if (letra == 'a'|| letra == 'e'|| letra == 'i'|| letra == 'o'|| letra == 'u' || letra == 'A'|| letra == 'E'|| letra == 'I'|| letra == 'O'|| letra == 'U') {
				System.out.println("Vocal \"" + letra + "\" en la posición " + (i + 1));
			}
		}
	}
}
