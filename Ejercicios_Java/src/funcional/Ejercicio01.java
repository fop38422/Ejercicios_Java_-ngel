package funcional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Function<Integer, String> convertirAString = (num) -> String.valueOf(num);
        System.out.println("Convertir a String: " + convertirAString.apply(42));

        Predicate<String> esLongitudMayorA5 = (str) -> str.length() > 5;
        System.out.println("¿La longitud es mayor a 5? " + esLongitudMayorA5.test("HolaMundo"));

        Consumer<String> imprimirMensaje = (mensaje) -> System.out.println("Mensaje: " + mensaje);
        imprimirMensaje.accept("¡Hola, mundo!");

        Supplier<Double> obtenerNumeroAleatorio = () -> Math.random();
        System.out.println("Número aleatorio: " + obtenerNumeroAleatorio.get());
	}

}
