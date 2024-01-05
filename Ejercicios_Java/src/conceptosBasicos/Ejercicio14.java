package conceptosBasicos;

import java.util.Scanner;

/*Escribe un programa que calcule la
letra del DNI introducido por
teclado sabiendo que tenemos 23
letras en el abecedario y que existe
una correspondencia entre letras y
números tal que así:
	
0 1 2 3 4 5 6 7
T R W A G M Y F

8 9 10 11 12 13 14 15
P D X  B  N  J  Z  S

16 17 18 19 20 21 22
Q  V  H  L  C  K  E*/

public class Ejercicio14 {

	public static void main(String[] args) {
		//crear Scanner
		Scanner sc = new Scanner(System.in);
		
		//pedir valor de entrada
		System.out.print("Introduce un DNI (sin letra): ");
		
		//guardar valor en variable
		int dni = sc.nextInt();
		
		//cerrar Scanner
		sc.close();
		
		//crear String con todas las letras posibles ordenadas según el resto
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		
		//imprimir letra de la String en la posición según n
		System.out.println("La letra de tu DNI es la " + letras.charAt(dni % 23));
	}

}
