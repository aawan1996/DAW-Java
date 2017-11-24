import java.io.*;

public class paquete{
	private int peso;
	private String prioridad;
	private String referencia;

	//////////////////////////////////////////
	// Constructor
	//////////////////////////////////////////
	public paquete(int peso, String prioridad, String referencia){
		this.peso =peso;
		this.prioridad = prioridad;
		this.referencia = referencia;
	}
	//////////////////////////////////////////
	// Constructor
	//////////////////////////////////////////

	public void setPeso(int peso){
		this.peso= peso;
	}
	public void setPrioridad(String prioridad){
		this.prioridad= prioridad;
	}
	public void setReferencia(String referencia){
		this.referencia= referencia;
	}
	public int getPeso(){
		return this.peso;
	}
	public String getPrioridad(){
		return this.prioridad;
	}
	public String getReferencia(){
		return this.referencia;
	}
}