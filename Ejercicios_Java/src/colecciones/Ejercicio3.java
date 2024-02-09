package colecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/*Crea un programa que lea de la entrada estándar una línea de texto y a continuación almacene en una
colección las palabras que no se repiten y en otra colección las que sí se repiten. El programa finalizará
mostrando el contenido de ambas colecciones (hacerlo sin escribir código para iterar).*/

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		Set<String> seRepiten = new HashSet<>();
		Set<String> sinRepetir = new HashSet<>();
		
		System.out.print("Texto: ");
		String texto = in.readLine();
		
	}

}
