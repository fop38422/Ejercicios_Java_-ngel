package conceptosBasicos;

import java.util.Scanner;

/*Escribe un programa que convierta
de euros a dólares. El resultado de
la conversión se mostrará en la
salida estándar con una precisión
de 2 decimales*/

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//iniciar el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimir el título y la pedida del valor en euros
		System.out.print("CALCULADORA DE CONVERSIÓN DE EUROS A DÓLARES\nIntroduce un número de euros: ");
		
		//guardar el valor introducido arriba en la variable para euros
		double eu = sc.nextDouble();
		
		//cerrar Scanner
		sc.close();
		
		//realizar la conversión a dólares y guardar el resultado en una variable
		double dl = eu * 1.11f;
		
		//imprimir el resultado con dos decimales
		System.out.printf("%.2f euros son equivalentes a %.2f dólares.", eu, dl);
	}

}
