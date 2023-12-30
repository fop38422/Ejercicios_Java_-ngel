package conceptosBasicos;

import java.util.Scanner;

/*Calcule la suma de la serie
1/1 + 1/2 + 1/3 + ... 1/N donde
el número N se introducirá por 
teclado*/

public class Ejercicio12 {

	public static void main(String[] args) {
		//crear el Scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimir la pedida de valor
		System.out.print("Introduce un número entero: ");
		
		//guardar el valor en una variable
		double n = sc.nextDouble();
		
		//cerrar Scanner
		sc.close();
		
		//iniciar la variable del resultado desde 0
		double result = 0;
		
		//crear un bucle que se ejecutará n veces y cada vez añadirá un valor a n
		for (int i = 1; i <= n; i++) {
			result += 1 / i;
		}
		
		//imprimir resultado
		System.out.println("El resultado es " + result);
	}

}
