package examenes;

import java.util.Arrays;
import java.util.Scanner;

public class Recuperacion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿Cuántos valores tiene tu vector?: ");
		int numero = sc.nextInt();
		
		int[] vector = new int[numero];
		
		for (int a = 0; a < numero; a++) {
			int indice = a + 1;
			System.out.print("Introduce el valor " + indice + ": ");
			vector[a] = sc.nextInt();
		}
		
		int solucion = centro(vector);
		
		if (solucion == -1) {
			System.out.println("El vector " + Arrays.toString(vector) + " no tiene centro.");
		}else {
			System.out.println("El centro del vector " + Arrays.toString(vector) + " es el número " + vector[solucion] + ", con índice " + solucion + ".");
		}
		
		sc.close();
	}
	
	public static int centro(int[] v) {
		int centro = -1;
		
		for (int c = 0; c < v.length; c++) {
			int parte1 = 0;
			int parte2 = 0;
			
			for (int i = 0; i <= c - 1; i++) {
				int x = (c - i) * v[i];
				parte1 += x;
			}
			
			for (int j = c + 1; j <= v.length - 1; j++) {
				int y = (j - c) * v[j];
				parte2 += y;
			}
			
			if (parte1 == parte2) {
				centro = c + 1;
				break;
			}
		}
		
		return centro;
	}

}
