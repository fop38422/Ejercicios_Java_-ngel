package conceptosBasicos;

import java.util.Scanner;

/*Escribe un programa que lea una
frase de teclado e indique si es
palíndroma, esto es, que se lee
igual de derecha a izquierda que
de izquierda a derecha sin tener en
cuenta los espacios ni las tildes*/

public class Ejercicio33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe una frase: ");
		String cosa = sc.next();
		sc.close();
		int n = cosa.length();
		boolean p = true;
		
		for (int i = 0; i < (n/2); i++) {
			if (cosa.charAt(i) != cosa.charAt(n-i-1)) {
				p = false;
			}
		}
		
		if (p == true) {
			System.out.println("Es un palíndromo");
		}else{
			System.out.println("No es un palíndromo");
		}
	}

}
