import java.io.*;

abstract class Articulo implements Precio{
	private char codigo;
	private String descripcion;

	////////////////////////////////////////////////
	// CONSTRUCTOR
	////////////////////////////////////////////////

	public Articulo(char codigo, String descripcion){
		this.codigo = codigo;
		this.descripcion = descripcion;
	}
	////////////////////////////////////////////////
	// SETTERS & GETTERS
	////////////////////////////////////////////////
	public char getCodigo(){
		return codigo;
	}
	public void setCodigo(char codigo){
		this.codigo = codigo;
	}
	public String getDescripcion(){
		return descripcion;
	}
	public void setDescripcion(String Descripcion){
		this.descripcion = Descripcion;
	}






}