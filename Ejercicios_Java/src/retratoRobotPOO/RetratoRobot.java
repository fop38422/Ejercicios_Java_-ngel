package retratoRobotPOO;

import java.util.Scanner;

class RetratoRobot {
    private String pelo;
    private String ojos;
    private String nariz;
    private String boca;

    public RetratoRobot(String pelo, String ojos, String nariz, String boca) {
        this.pelo = pelo;
        this.ojos = ojos;
        this.nariz = nariz;
        this.boca = boca;
    }

    public void mostrarRetrato() {
        System.out.println(pelo);
        System.out.println(ojos);
        System.out.println(nariz);
        System.out.println(boca);
    }

    public static String obtenerOpcion(Scanner sc) {
        int opcion;
        do {
            System.out.print("Ingresa un número de opción válido: ");
            while (!sc.hasNextInt()) {
                System.out.print("Por favor, ingresa un número válido: ");
                sc.next();
            }
            opcion = sc.nextInt();
        } while (opcion < 1 || opcion > 4);

        switch (opcion) {
            case 1:
                return "1. WWWWWWWWW";
            case 2:
                return "2. \\\\\\//////";
            case 3:
                return "3. |\"\"\"\"\"\"\"|";
            case 4:
                return "4. |||||||||";
            default:
                return "";
        }
    }
}
