import java.io.*;

public class CPersona {
	private String nom, primerCognom, segonCognom;
	private int numeroSecret;

	//////////////////////////////////////////////////////
	// Creo el constructor con los parámetros que me pasen
	//////////////////////////////////////////////////////
	public CPersona(String nom, String primerCognom, String segonCognom, int numeroSecret){
		this.nom = nom;
		this.primerCognom = primerCognom;
		this.segonCognom = segonCognom;
		this.numeroSecret = numeroSecret;
	}

	//////////////////////////////////////////////////////
	// Creo el constructor copia
	//////////////////////////////////////////////////////
	public CPersona (CPersona obj){
		this.nom = obj.nom;
		this.primerCognom = obj.primerCognom;
		this.segonCognom = obj.segonCognom;
		this.numeroSecret = obj.numeroSecret;
	}

	//////////////////////////////////////////////////////
	// Añado los SET y GET
	//////////////////////////////////////////////////////
	public String getNom(){
		return this.nom;
	}
	public String getPrimerCognom(){
		return this.primerCognom;
	}
	public String getSegonCognom(){
		return this.segonCognom;
	}
	public int getNumeroSecret(){
		return this.numeroSecret;
	}

	public void setNom(String nom){
		System.out.println("Hola");
		this.nom = nom;
	}
	public void setPrimerCognom(String primerCognom){
		this.primerCognom = primerCognom;
	}
	public void setSegonCognom(String segonCognom){
		this.segonCognom = segonCognom;
	}
	public void setNumeroSecret(int numeroSecret){
		this.numeroSecret = numeroSecret;
	}

	

}