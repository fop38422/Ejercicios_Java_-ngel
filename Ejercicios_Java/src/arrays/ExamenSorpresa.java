package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
			Un restaurante nos ha encargado una aplicación para colocar a los clientes en
			sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
			(mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
			el programa no está preparado para colocar a grupos mayores a 4, por tanto,
			si un cliente dice por ejemplo que son un grupo de 6, el programa dará el
			mensaje "Lo siento, no admitimos grupos de 6, haga grupos de 4
			personas como máximo e intente de nuevo". Para el grupo que llega,
			se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas
			libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el
			grupo es de dos personas, se podrá colocar donde haya una o dos personas.
			Inicialmente, las mesas se cargan con valores aleatorios entre 0 y 4. Cada
			vez que se sientan nuevos clientes se debe mostrar el estado de las mesas.
			Los grupos no se pueden romper aunque haya huecos sueltos suficientes. El
			funcionamiento del programa se ilustra a continuación:
*/

public class ExamenSorpresa {

	public static void main(String[] args) {
		
		Random rand = new Random();//crea objeto para generar números aleatorios
		Scanner sc = new Scanner(System.in);
		
		int[][]	mesas = { {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {rand.nextInt(5), rand.nextInt(5), rand.nextInt(5), rand.nextInt(5), rand.nextInt(5), rand.nextInt(5), rand.nextInt(5), rand.nextInt(5), rand.nextInt(5), rand.nextInt(5)} };
		//fija el número de mesas en 10 y les da un número a priorio de comensales aleatorio entre 0 y 4
		
		System.out.println(Arrays.deepToString(mesas));//deeptostring imprime todos los elementos del array multidimensional
		
		System.out.print("¿Cuántos comensales quieren comer?: ");
		int n = sc.nextInt();//lee el número de comensales introducido
		
		if (n >= 5) {
			System.out.println("Lo siento, no admitimos grupos de más de 4 comensales, haga grupos de 4 personas como máximo e intente de nuevo.");
		}else if (n <= 0){
			System.out.println("Por favor, introduce un número válido de comensales e intente de nuevo.");
		}else{
			
		}
		
		sc.close();
	}

}
