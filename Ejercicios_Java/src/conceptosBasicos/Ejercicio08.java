package conceptosBasicos;

import java.util.Scanner;

/*Escribe un programa que permita
convertir las componentes de un
color en el espacio RGB a sus
componentes en el espacio YIQ,
según las expresiones matemáticas
siguientes:
y = 0,299𝑟 + 0,587𝑔 + 0,114𝑏
i = 0,596𝑟 − 0,275𝑔 − 0,321𝑏
q = 0,212𝑟 − 0,528𝑔 + 0,311𝑏
El usuario introducirá por teclado el
valor de cada componente RGB
(rojo, verde y azul)*/

public class Ejercicio08 {

	public static void main(String[] args) {
		//crear el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		//pedir el valor de r
		System.out.print("Introduce el valor del componente rojo (R): ");
		
		//guardar el valor en la variable r
		short r = sc.nextShort();
		
		//pedir el valor de g
		System.out.print("Introduce el valor del componente verde (G): ");
		
		//guardar el valor en la variable g
		short g = sc.nextShort();
		
		//pedir el valor de b
		System.out.print("Introduce el valor del componente azul (B): ");
		
		//guardar el valor en la variable b
		short b = sc.nextShort();
		
		//cerrar Scanner
		sc.close();
		
		//operar con los valores para guardar el dato y
		double y = 0.299 * r + 0.587 * g + 0.114 * b;
		
		//operar con los valores para guardar el dato i
		double i = 0.596 * r + 0.275 * g + 0.321 * b;
		
		//operar con los valores para guardar el dato q
		double q = 0.212 * r + 0.528 * g + 0.311 * b;
		
		//imprimir el resultado
		System.out.printf("Valores YIQ: %.4f, %.4f, %.4f", y, i, q);
	}

}
