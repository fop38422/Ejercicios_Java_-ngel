package conceptosBasicos;

import java.util.Scanner;

/*Construir un programa que calcule
el perímetro y el área de una
circunferencia leyendo su radio por
teclado. (π = 3.14159)*/

public class Ejercicio06 {

	public static void main(String[] args) {
		//crear el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimir el título y la pedida del dato de entrada (radio)
		System.out.print("CALCULADORA DE PERÍMETRO Y ÁREA DE CIRCUNFERENCIA\nIntroduce el radio de la circunferencia en centímetros: ");
		
		//guardar el valor introducido en una variable
		int r = sc.nextInt();
		
		//cerrar Scanner
		sc.close();
		
		//imprimir los cálculos necesarios
		System.out.println("Perímetro de la circunferencia: π * d = " + r * 2 * Math.PI);
		System.out.println("Área de la circunferencia: π * r² = " + Math.pow(r, 2) * Math.PI);
	}

}