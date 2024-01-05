package conceptosBasicos;

import java.util.Scanner;

/*Escribir un programa que realice un
juego que consiste en acertar un
número desconocido generado
aleatoriamente entre uno y cien.
Para ello se leerán de teclado
números, y se compararán con el
número secreto, indicando si son
mayores o menores que este, hasta
acertar.*/

public class Ejercicio16 {

	public static void main(String[] args) {
		//crear Scanner
		Scanner sc = new Scanner(System.in);
		
		//generar número aleatorio entre 1 y 100
		int sol = (int) (Math.random() * 99 + 1);
		
		//imprimir pedida de solución
		System.out.print("Introduce un entero entre 1 y 100: ");
		
		//guardar solución en variable
		int n = sc.nextInt();
		
		//bucle While que pedirá números y dará pistas hasta que se encuentre la solución
		while (n != sol) {
			//condicional If que imprimirá si el número escrito es mayor o menor que la solución
			if (n < sol){
				System.out.println("Prueba con un número más grande");
			}else{
				System.out.println("Prueba con un número más pequeño");
			}
			
			//pedir un nuevo intento
			System.out.print("Prueba otra vez: ");
			
			//sobreescribir el número escrito
			n = sc.nextInt();
		}
		//imprimir último mensaje
		System.out.println("¡Correcto!");
		
		//cerrar Scanner
		sc.close();
	}

}
