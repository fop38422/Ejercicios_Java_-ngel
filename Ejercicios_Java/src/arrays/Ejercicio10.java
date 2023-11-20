package arrays;

import java.util.Arrays;

/*Programa que cree una matriz de números enteros aleatorios con un número de filas y de columnas
aleatorios que estén comprendidos entre 2 y 20.
Escribir un método que reciba una matriz de números enteros y retorne un vector que contenga la
suma de los valores de cada fila.
Escribir otro método que reciba una matriz de números enteros y retorne un vector que contenga la
suma de los valores de cada columna.
Mostrar en la consola la matriz, la suma de las filas a su derecha y la suma de las columnas en la parte
inferior.*/

public class Ejercicio10 {

	public static void main(String[] args) {
		int[][] tabla = new int[aleatorio()][aleatorio()];
		
		for (int i=0; i<tabla.length; i++)
			for (int j=0; j<tabla[i].length; j++)
				tabla[i][j] = (int) Math.round(Math.random() * 1000000);
		System.out.println(Arrays.deepToString(tabla));
	}
	
	static int aleatorio() {
		return (int) Math.round(Math.random() * 18 + 2);
	}
	
	static int [] sumaFilas(int [][] tabla) {
		int [] v = new int[tabla.length];
		
		for (int i=0; i<tabla.length; i++) {
			int suma = 0;
			for (int j=0; j<tabla[i].length; j++)
				suma += tabla[i][j];
		}
			
		return v;
	}
	

}
