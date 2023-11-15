package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Programa que, utilizando una cantidad mínima de variables, simule el lanzamiento de un dado N veces,
siendo N un número entero que se introducirá por teclado. Antes de finalizar mostrará el número de
veces que salió cada una de las caras.*/

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("¿Cuántas veces quieres lanzar el dado?");
		int n = Integer.parseInt(in.readLine());
		
		int[] dado = {0, 1, 2, 3, 4, 5};
		
		int cara1, cara2, cara3, cara4, cara5, cara6;
		cara1 = cara2 = cara3 = cara4 = cara5 = cara6 = 0;
		
		for (int i = 0; i < n; i++) {
			int resultDado = dado[(int) Math.round(Math.random() * 5)];
			
			switch (resultDado) {
			case 0:
				++cara1;
				break;
			case 1:
				++cara2;
				break;
			case 2:
				++cara3;
				break;
			case 3:
				++cara4;
				break;
			case 4:
				++cara5;
				break;
			case 5:
				++cara6;
				break;
			}
		}
		
		System.out.println("Resultados:");
		System.out.println("Cara 1: " + cara1 + " veces");
		System.out.println("Cara 2: " + cara2 + " veces");
		System.out.println("Cara 3: " + cara3 + " veces");
		System.out.println("Cara 4: " + cara4 + " veces");
		System.out.println("Cara 5: " + cara5 + " veces");
		System.out.println("Cara 6: " + cara6 + " veces");
		
	}

}
