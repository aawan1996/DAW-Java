import java.io.*;

public class Socio {
	private String nombre;
	private String dni;
	private int numeroSocio;
	private Documento [] document;
	//////////////////////////////////////////
	// CONSTRUCTOR
	//////////////////////////////////////////
	public Socio (String nombre,String dni,int numeroSocio,Documento [] document){
		this.nombre = nombre;
		this.dni = dni;
		this.numeroSocio = numeroSocio;
		this.document = document;
	}
	//////////////////////////////////////////
	// Método SET Y GET
	//////////////////////////////////////////
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setDni(String dni){
		this.dni = dni;
	}
	public void setNumeroSocio(int numeroSocio){
		this.numeroSocio = numeroSocio;
	}
	// public void setPrestado(String prestado){
	// 	this.prestado = prestado;
	// }
	public String getNombre(){
		return this.nombre;
	}
	public String getDni(){
		return this.dni;
	}
	public int getNumeroSocio(){
		return this.numeroSocio;
	}
	

}