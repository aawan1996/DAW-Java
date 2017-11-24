import java.io.*;

public class sucursal {
	private int numero;
	private String direccion;
	private String ciudad;
	private int suma;

	//////////////////////////////////////////
	// Constructor
	//////////////////////////////////////////
	public sucursal (int numero, String direccion, String ciudad){
		this.numero = numero;
		this.direccion = direccion;
		this.ciudad = ciudad;
	}
	//////////////////////////////////////////
	// Métodos SET/GET
	//////////////////////////////////////////
	public void setNumero(int numero){
		this.numero= numero;
	}
	public void setDireccion(String direccion){
		this.direccion= direccion;
	}
	public void setCiudad(String ciudad){
		this.ciudad= ciudad;
	}
	public int getNumero(){
		return this.numero;
	}
	public String getDireccion(){
		return this.direccion;
	}
	public String getCiudad(){
		return this.ciudad;
	}
	//////////////////////////////////////////
	// Método calcular precio
	//////////////////////////////////////////
	public int calcularPrecio(paquete paquete){
		if (paquete.getPrioridad().equals("alta")){
			this.suma = paquete.getPeso() + 10;
		}
		if (paquete.getPrioridad().equals("Express")){
			this.suma = paquete.getPeso() + 20;
		}
		if (paquete.getPrioridad().equals("")){
			this.suma = paquete.getPeso();
		}
		return this.suma;
	}
	
	
}