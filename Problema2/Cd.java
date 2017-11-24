import java.io.*;

public class Cd extends Documento{
	private String artista;

	//////////////////////////////////////////
	// CONSTRUCTOR
	//////////////////////////////////////////
	public Cd(String fecha,String titulo,int valor, String prestado,String artista){
		super(fecha,titulo,valor,prestado);
		this.artista = artista;
	}	

	//////////////////////////////////////////
	// Método SET Y GET
	//////////////////////////////////////////
	public void setArtista(String artista){
		this.artista = artista;
	}
	public String getArtista(){
		return this.artista;
	}

	public double calcularPenalizacion(){
		return (super.getValor() + (super.getValor() * 0.10)  + 1);
	}
}