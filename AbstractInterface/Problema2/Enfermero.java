import java.io.*;

public class Enfermero extends Persona{
	private int antiguedad;
	//////////////////////////////////////////////////////
	// CONSTRUCTOR
	//////////////////////////////////////////////////////
	public Enfermero(int antiguedad,String nombre, String dni){
		super(nombre, dni);
		this.antiguedad = antiguedad;
	}
	//////////////////////////////////////////////////////
	// SETTER & GETTER
	//////////////////////////////////////////////////////
    public int getAntiguedad(){
    	return antiguedad;
    }
    public void setAntiguedad(int Antiguedad){
    	this.antiguedad = Antiguedad;
    }
	//////////////////////////////////////////////////////
	// MÉTODOS
	//////////////////////////////////////////////////////
    public int calcularDias(){
    	return super.getDiasVacaciones() + (this.antiguedad/2);
    }

}