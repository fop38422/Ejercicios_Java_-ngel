package hucha;

import java.util.Arrays;

public class Hucha {
	private static final int[] VALORES = {1, 2, 5, 10, 20, 50};
	private int[] euros = new int[6];
	private int total;
	private boolean abierta;
	private String contraseña;
	
	public Hucha(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public Hucha(String contraseña, int m1, int m2, int b5, int b10, int b20, int b50) {
		this.contraseña = contraseña;
		total += (euros[0] = m1) * VALORES[0];
		total += (euros[1] = m2) * VALORES[1];
		total += (euros[2] = b5) * VALORES[2];
		total += (euros[3] = b10) * VALORES[3];
		total += (euros[4] = b20) * VALORES[4];
		total += (euros[5] = b50) * VALORES[5];
	}
	
	public Hucha(String contraseña, int euros) {
		this.contraseña = contraseña;
		total = euros;
		for (int i = VALORES.length - 1; i >= 0; i--) {
			this.euros[i] = euros / VALORES[i];
			euros %= VALORES[i]; 
		} 
	}
	
	public void add(int cantidad, int valor) {
		int i = Arrays.binarySearch(VALORES, valor);
		if (i < 0) throw new IllegalArgumentException("Introduce un número positivo.");
		euros[i] += cantidad;
		total += cantidad * valor;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(euros) + " = " + total;
	}
	
	public static void main(String[] args) {
		Hucha h = new Hucha("1234", 223);
		System.out.println(h);
		h.add(3, 2);
		System.out.println(h);
	}
}