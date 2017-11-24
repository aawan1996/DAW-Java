import java.io.*;

public class Libro extends Documento{
	private String autor;

	//////////////////////////////////////////
	// CONSTRUCTOR
	//////////////////////////////////////////
	public Libro(String fecha,String titulo,int valor, String prestado,String autor){
		super(fecha,titulo,valor,prestado);
		this.autor = autor;
	}	

	//////////////////////////////////////////
	// Método SET Y GET
	//////////////////////////////////////////
	public void setAutor(String autor){
		this.autor = autor;
	}
	public String getAutor(){
		return this.autor;
	}
	public double calcularPenalizacion(){
		return ((super.getValor() * 0.05) + super.getValor());
	}

}