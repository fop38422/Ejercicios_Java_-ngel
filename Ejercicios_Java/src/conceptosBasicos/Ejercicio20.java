package conceptosBasicos;

import java.util.Scanner;

/*Pedir un número por teclado y
dibujar un triángulo rectángulo con
asteriscos. Por ejemplo, con n=4 el
triángulo será de la forma
* * * *
* * *
* *
*
*/

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número de filas: ");
		int n = sc.nextInt();
		sc.close();
		
		System.out.println("Aquí tienes tu triángulo rectángulo de base " + n + ".");
		/*
		 * el bucle i ejecuta el bucle j n veces en su primera vuelta y al terminar 
		 * hace un salto de página. en la siguiente vuelta hará lo mismo pero con un
		 * valor menos hasta que solo lo haga una vez
		 */
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
