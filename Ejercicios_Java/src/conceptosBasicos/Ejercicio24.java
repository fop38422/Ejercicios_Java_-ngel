package conceptosBasicos;

import java.util.Scanner;

/*Escribir y ejecutar un programa que
resuelva una ecuación de 2º grado
introduciendo por teclado las
constantes a, b y c.
Resuelve el ejercicio con un
método que lleve como
parámetros los coeficientes de la
ecuación de segundo grado*/

public class Ejercicio24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número A: ");
		int a = sc.nextInt();
		System.out.print("Introduce un número B: ");
		int b = sc.nextInt();
		System.out.print("Introduce un número C: ");
		int c = sc.nextInt();
		sc.close();
		ecuacion(a, b, c);
	}

	static void ecuacion(int a, int b, int c) {
		double parte1 = b * b - 4 * a * c;
		double raiz = Math.sqrt(parte1);
		double result1 = (-b + raiz) / (2 * a);
		double result2 = (-b - raiz) / (2 * a);
		System.out.println("Las dos soluciones son " + result1 + " y " + result2);
	}

}
