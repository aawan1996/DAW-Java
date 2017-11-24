import java.io.*;

abstract class Persona {
	private String nombre;
	private String dni;
	private int diasVacaciones;
	//////////////////////////////////////////////////////
	// CONSTRUCTOR
	//////////////////////////////////////////////////////
	public Persona(String nombre, String dni){
		this.nombre = nombre;
		this.dni = dni;
		this.diasVacaciones = 25;
	}

	//////////////////////////////////////////////////////
	// SETTER & GETTER
	//////////////////////////////////////////////////////
	public String getNombre(){
	 	return nombre;
	}
	public void setNombre(String nombre){
	 	this.nombre = nombre;
	}
	public String getDni(){
	  	return dni;
	}
	public void setDni(String dni){
	  	this.dni = dni;
	}
	public int getDiasVacaciones(){
	 	return diasVacaciones;
	}
	public void setDiasVacaciones(int DiasVacaciones){
	 	this.diasVacaciones = DiasVacaciones;
	}

	public abstract int calcularDias();

}