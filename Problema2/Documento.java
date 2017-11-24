import java.io.*;

public class Documento {
	private String fecha;
	private String titulo;
	private String prestado;
	private double valor;

	//////////////////////////////////////////
	// CONSTRUCTOR
	//////////////////////////////////////////
	public Documento (String fecha,String titulo,double valor, String prestado){
		this.fecha = fecha;
		this.titulo = titulo;
		this.valor = valor;
		this.prestado = prestado;
	}

	//////////////////////////////////////////
	// Método SET Y GET
	//////////////////////////////////////////
	public void setFecha(String fecha){
		this.fecha = fecha;
	}
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	public void setPrestado(String prestado){
		this.prestado = prestado;
	}
	public void setValor(double valor){
		this.valor = valor;
	}
	public String getFecha(){
		return this.fecha;
	}
	public String getTitulo(){
		return this.titulo;
	}
	public String getPrestado(){
		return this.prestado;
	}
	public double getValor(){
		return this.valor;
	}

	public double calcularPenalizacion(){
		return 0;
	}

}