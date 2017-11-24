import java.io.*;

public class Paciente {
	private String nombre;
	private String dni;
	private String telefono;
	//////////////////////////////////////////////////////
	// CONSTRUCTOR
	//////////////////////////////////////////////////////
	public Paciente(String nombre, String dni,String telefono){
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
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
	public String getTelefono(){
	  	return telefono;
	}
	public void setTelefono(String telefono){
	  	this.telefono = telefono;
	}

}