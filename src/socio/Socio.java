package socio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio {
	private Integer id;
	private String nombre;
	private LocalDate fechaNacimiento;

	public Socio(Integer id, String nombre, String fechaNacimiento) {
		this.id = id;
		this.nombre = nombre;
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);
	}

	public Integer edad() {
		return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
	}

	@Override
	public String toString() {
		String cadena = "";
		cadena += "\nSocio";
		cadena += "\nId=" + id;
		cadena += "\nNombre=" + nombre;
		cadena+="\nEdad=" + edad();
		cadena+="\nFecha de nacimiento="+fechaNacimiento;
		cadena+="\n";
		return cadena;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}

