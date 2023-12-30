package conceptosBasicos;

import java.util.Scanner;

/*Construir un programa que indique
si un número introducido por
teclado es positivo, negativo o
cero*/

public class Ejercicio11 {

	public static void main(String[] args) {
		//crear el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimir pedida de valor
		System.out.print("Introduce un número entero: ");
		
		//guardar el valor en una variable
		int n = sc.nextInt();
		
		//cerrar Scanner
		sc.close();
		
		//si n es 0, imprimir que es 0
		if (n == 0) {
			System.out.println(n + " no es ni positivo ni negativo.");
		}else if (n > 0) {
			System.out.println(n + " es un número positivo.");
		}else{
			System.out.println(n + " es un número negativo.");
		}
	}

}
