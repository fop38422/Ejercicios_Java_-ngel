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
		
		//calcular el resto de la división entre 23 de ese número y guardarlo en otra variable
		int n = dni % 23;
		
		//crear condicional switch con un caso para cada posibilidad de resto (de 0 a 22
		switch (n) {
			case 0:
				System.out.println("La letra de tu DNI es la T");
				break;
			case 1:
				System.out.println("La letra de tu DNI es la R");
				break;
			case 2:
				System.out.println("La letra de tu DNI es la W");
				break;
			case 3:
				System.out.println("La letra de tu DNI es la A");
				break;
			case 4:
				System.out.println("La letra de tu DNI es la G");
				break;
			case 5:
				System.out.println("La letra de tu DNI es la M");
				break;
			case 6:
				System.out.println("La letra de tu DNI es la Y");
				break;
			case 7:
				System.out.println("La letra de tu DNI es la F");
				break;
			case 8:
				System.out.println("La letra de tu DNI es la P");
				break;
			case 9:
				System.out.println("La letra de tu DNI es la D");
				break;
			case 10:
				System.out.println("La letra de tu DNI es la X");
				break;
			case 11:
				System.out.println("La letra de tu DNI es la B");
				break;
			case 12:
				System.out.println("La letra de tu DNI es la N");
				break;
			case 13:
				System.out.println("La letra de tu DNI es la J");
				break;
			case 14:
				System.out.println("La letra de tu DNI es la Z");
				break;
			case 15:
				System.out.println("La letra de tu DNI es la S");
				break;
			case 16:
				System.out.println("La letra de tu DNI es la Q");
				break;
			case 17:
				System.out.println("La letra de tu DNI es la V");
				break;
			case 18:
				System.out.println("La letra de tu DNI es la H");
				break;
			case 19:
				System.out.println("La letra de tu DNI es la L");
				break;
			case 20:
				System.out.println("La letra de tu DNI es la C");
				break;
			case 21:
				System.out.println("La letra de tu DNI es la K");
				break;
			case 22:
				System.out.println("La letra de tu DNI es la E");
				break;
		}
	}

}
