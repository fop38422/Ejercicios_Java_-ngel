package retratoRobotPOO;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecciona una opción para el pelo:");
        String pelo = RetratoRobot.obtenerOpcion(scanner);

        System.out.println("Selecciona una opción para los ojos:");
        String ojos = RetratoRobot.obtenerOpcion(scanner);

        System.out.println("Selecciona una opción para orejas y nariz:");
        String orejasNariz = RetratoRobot.obtenerOpcion(scanner);

        System.out.println("Selecciona una opción para la boca:");
        String boca = RetratoRobot.obtenerOpcion(scanner);

        RetratoRobot retrato = new RetratoRobot(pelo, ojos, orejasNariz, boca);
        retrato.mostrarRetrato();

        scanner.close();
    }
    
}
