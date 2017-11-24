import java.io.*;

public class principal extends sucursal {
	// private int numeroSucursalesSecundarias=0;
	// private vector ListaSucursales;
	private int numeroSucursalesSecundarias;

	public principal(int numero, String direccion, String ciudad, int hi){
		super(numero, direccion, ciudad);
		// this.setNumero(numero);
		this.numeroSucursalesSecundarias = hi;
	}

	public int getNumeroSucursalesSecundarias(){
		return this.numeroSucursalesSecundarias;
	}

	public void setNumeroSucursalesSecundarias(int hi){
		this.numeroSucursalesSecundarias = hi;
	}

	// public void addSucursalSecundaria(int secundaria){
	// 	ListaSucursales.addElement(new Integer(secundaria));
	// }



}