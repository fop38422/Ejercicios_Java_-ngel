package animal;

import java.time.LocalDate;

public class Animal {
	String nombre;
	LocalDate fecha;
	

	public Animal(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}
	
	public Animal(String nombre) {
		this.nombre = nombre;
		this.fecha = LocalDate.now();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Nombre:" + nombre + " - Edad: " + fecha + "]";
	}
}