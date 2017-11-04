import java.io.*;

public class CCompteBancari {
	private int numero;
	private int saldo;
	private CPersona propietari;
	private static int seguentCompte=1234;
	private static int saldoInicial=100;

	//////////////////////////////////////////////////////
	// Creo el constructor con los parámetros que me pasen
	//////////////////////////////////////////////////////
	public CCompteBancari(CPersona persona){
		this.numero = seguentCompte;
		this.saldo = saldoInicial;
		// this.propietari.nom = persona.getNom();
		// this.propietari.primerCognom = persona.getPrimerCognom();
		// this.propietari.segonCognom = persona.getSegonCognom();
		// this.propietari.numeroSecret = persona.getNumeroSecret();
		// this.propietari.setNom(nombre);
		// this.propietari.setPrimerCognom(primerApellido);
		// this.propietari.setSegonCognom(segundoApellido);
		// this.propietari.setNumeroSecret(numeroSecret);
		this.propietari = persona;
		seguentCompte++;
	}
	public CCompteBancari(CCompteBancari object){
		this.numero = object.numero;
		this.saldo = object.saldo;
		// this.propietari.nom = obj.persona.getNom();
		// this.propietari.primerCognom = obj.persona.getPrimerCognom();
		// this.propietari.segonCognom = obj.persona.getSegonCognom();
		// this.propietari.numeroSecret = obj.persona.getNumeroSecret();
	}

	public CCompteBancari(){
		this.numero = seguentCompte;
		this.saldo = saldoInicial;
	}

	//////////////////////////////////////////////////////
	// SET / GET para el propietario
	//////////////////////////////////////////////////////
	// public void setPropietari(String nombre, String primerApellido, String segundoApellido, int numeroSecret){
	// 	this.propietari.setNom(nombre);
	// 	this.propietari.setPrimerCognom(primerApellido);
	// 	this.propietari.setSegonCognom(segundoApellido);
	// 	this.propietari.setNumeroSecret(numeroSecret);
	// }
	public void setPropietari(CPersona propietari){
		this.propietari = propietari;
	}
	public CPersona getPropietari(){
		return this.propietari;
	}
	public String getPropietariNom(){
		return this.propietari.getNom();
	}
	public String getPropietariPrimerCognom(){
		return this.propietari.getPrimerCognom();
	}
	public String getPropietariSegonCognom(){
		return this.propietari.getSegonCognom();
	}
	public int getPropietariNumeroSecret(){
		return this.propietari.getNumeroSecret();
	}

	//////////////////////////////////////////////////////
	// GET numero
	//////////////////////////////////////////////////////
	public int getNumero(CPersona persona){
		return this.numero;
	}

	//////////////////////////////////////////////////////
	// Metodo static para cambiar el saldo
	//////////////////////////////////////////////////////
	public static void modificarSaldoIncial(int saldo){
		saldoInicial = saldo;
	}

	//////////////////////////////////////////////////////
	// Metodo que devuelve el saldo
	//////////////////////////////////////////////////////
	public int getSaldo(){
		return this.saldo;
	}

	//////////////////////////////////////////////////////
	// Comprovar el numero secret
	//////////////////////////////////////////////////////
	public boolean comprovarNumeroSecret(int primero, int segundo){
		return (primero == segundo);
	}

	//////////////////////////////////////////////////////
	// Metodo ingresar
	//////////////////////////////////////////////////////
	public boolean ingresar(int cantidad, int numeroSecret){
		if(this.getPropietari().getNumeroSecret()==numeroSecret){
			this.saldo = this.saldo + cantidad;
			return true;	
		}else{
			return false;			
		}
	}

	//////////////////////////////////////////////////////
	// Metodo extreure
	//////////////////////////////////////////////////////
	public boolean extreure(int cantidad, int numeroSecret){
		if(this.getPropietari().getNumeroSecret()==numeroSecret){
			this.saldo = this.saldo - cantidad;
			return true;	
		}else{
			return false;
		}
	}


}