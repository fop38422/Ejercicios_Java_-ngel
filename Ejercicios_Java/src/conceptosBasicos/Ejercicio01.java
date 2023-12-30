package conceptosBasicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio01 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Escriba su nombre: ");
		String nombre = in.readLine();
		
		System.out.print("Escriba su edad: ");
		String edad = in.readLine();
		
		System.out.print("Escriba su dirección: ");
		String direccion = in.readLine();
		
		System.out.println("Información del alumno:\n" + nombre + "\n" + edad + "\n" + direccion);
	}

}
