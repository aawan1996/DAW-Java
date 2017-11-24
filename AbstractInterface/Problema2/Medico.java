import java.io.*;

public class Medico extends Persona{
	private String especialidad;
	private int numeroGuardias;
	private Paciente [] paciente;
	//////////////////////////////////////////////////////
	// CONSTRUCTOR
	//////////////////////////////////////////////////////
	public Medico(String especialidad, int numeroGuardias,String nombre, String dni, Paciente [] paciente){
		super(nombre, dni);
		this.especialidad = especialidad;
		this.numeroGuardias = numeroGuardias;
		this.paciente = paciente;
	}

	//////////////////////////////////////////////////////
	// SETTER & GETTER
	//////////////////////////////////////////////////////
    public String getEspecialidad(){
   		return especialidad;
    }
    public void setEspecialidad(String Especialidad){
    	this.especialidad = Especialidad;
    }
    public int getNumeroGuardias(){
    	return numeroGuardias;
    }
    public void setNumeroGuardias(int NumeroGuardias){
    	this.numeroGuardias = NumeroGuardias;
    }
	//////////////////////////////////////////////////////
	// MÉTODOS
	//////////////////////////////////////////////////////
    public int calcularDias(){
    	return super.getDiasVacaciones() + this.numeroGuardias;
    }

}