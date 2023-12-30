package conceptosBasicos;

/*Escribe un programa que muestre
en la consola la división de 1234
entre 532, siendo ambos números
reales. El resultado se mostrará con
un máximo de 15 dígitos, de los
cuales dos se utilizarán para la
parte decimal.*/

public class Ejercicio02 {

	public static void main(String[] args) {
		System.out.printf("%-15.2f", 1234f / 532f);
	}

}
