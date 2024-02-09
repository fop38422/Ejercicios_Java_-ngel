package colecciones;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<String> set = new LinkedHashSet<>();
		for (int i = 0; i < n; i++) {
			set.add(sc.next());
		}
		System.out.println(set);
	}

}
