package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RetratoRobot {
	
	public static int pelo, ojos, nariz, boca;
	public static String[] peloA = {"WWWWWWWWW", "\\\\\\//////", "|\"\"\"\"\"\"\"|", "|||||||||"};
	public static String[] ojosA = {"|  O O  |", "|-(· ·)-|", "|-(o o)-|", "|  \\/  |"};
	public static String[] narizA = {"@   J   @", "{   \"   }", "[   j   ]", "<   -   >"};
	public static String[] bocaA = {"|  ===  |", "|   -   |", "|  ___  |", "|  ---  |"};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		pelo = enseñarPartes(in, pelo, peloA);
		ojos = enseñarPartes(in, ojos, ojosA);
		nariz = enseñarPartes(in, nariz, narizA);
		boca = enseñarPartes(in, boca, bocaA);
		elegirPartes(pelo, peloA);
		elegirPartes(ojos, ojosA);
		elegirPartes(nariz, narizA);
		elegirPartes(boca, bocaA);
		System.out.println("\\_______/ " + "\n" + "Aquí tienes tu retrato :)");
	}

	
	public static int enseñarPartes(BufferedReader in, int parte, String parteA[]) throws NumberFormatException, IOException {
		System.out.print("Opciones:" + "\n" + "1. " + parteA[0] + "\n" + "2. " + parteA[1] + "\n" + "3. " + parteA[2] + "\n" + "4. " + parteA[3] + "\n");
		System.out.print("Elige una opción: ");
		parte = Integer.parseInt(in.readLine());
		return parte;
	}
	
	public static void elegirPartes(int parte, String parteA[]) {
		switch (parte) {
		case 1:
			System.out.println(parteA[0]);
			break;
		case 2:
			System.out.println(parteA[1]);
			break;
		case 3:
			System.out.println(parteA[2]);
			break;
		case 4:
			System.out.println(parteA[3]);
			break;
		default:
			System.out.println("XXXXXXXXX");
		}

	}
}