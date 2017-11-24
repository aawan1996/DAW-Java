import java.io.*;

public class secundaria extends sucursal {
	private String nombreSucursalPrincipal;

	public secundaria(int numero, String direccion, String ciudad, String hi){
		super(numero, direccion, ciudad);
		this.nombreSucursalPrincipal = hi;
		// this.setNumero(numero);
	}
	public void setNombreSucursalPrincipal(String nombreSucursalPrincipal){
		this.nombreSucursalPrincipal = nombreSucursalPrincipal;
	}

	public String getNombreSucursalPrincipal(){
		return this.nombreSucursalPrincipal;
	}
	
}