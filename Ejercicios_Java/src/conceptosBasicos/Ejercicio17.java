package conceptosBasicos;

import java.util.Scanner;

/*Escribe un programa que lea el
nombre del usuario y a
continuación muestre los
segundos y milisegundos que ha
tardado en contestar, con un
formato de salida que emplee
exactamente 3 dígitos en la parte
decimal*/

public class Ejercicio17 {

	public static void main(String[] args) {
		//crear Scanner
		Scanner sc = new Scanner(System.in);
		
		//empezar contador de tiempo
		double inicio = System.currentTimeMillis();
		
		//imprimir pedida de nombre
		System.out.print("Escribe tu nombre: ");
		
		//guardar nombre en variable
		String nombre = sc.next();
		
		//terminar contador de tiempo
		double fin = System.currentTimeMillis();
		
		//restar tiempo de inicio al de fin para medir el tiempo usado
		double tiempo = (fin - inicio) / 1000;
		
		//cerrar Scanner
		sc.close();
		
		//imprimir nombre y tiempo con tres decimales
		System.out.println("Hola, " + nombre + ". Has tardado " + tiempo + " segundos en escribir tu nombre.");
	}

}
