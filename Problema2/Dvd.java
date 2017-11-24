import java.io.*;

public class Dvd extends Documento{
	private String director;

	//////////////////////////////////////////
	// CONSTRUCTOR
	//////////////////////////////////////////
	public Dvd(String fecha,String titulo,int valor, String prestado,String director){
		super(fecha,titulo,valor,prestado);
		this.director = director;
	}	

	//////////////////////////////////////////
	// Método SET Y GET
	//////////////////////////////////////////
	public void setDirector(String director){
		this.director = director;
	}
	public String getDirector(){
		return this.director;
	}

	public double calcularPenalizacion(){
		return (super.getValor() + (super.getValor() * 0.06)  + 2);
	}

}