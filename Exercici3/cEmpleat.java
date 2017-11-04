import java.io.*;

public class cEmpleat {
	private String nombre,primerApellido,segundoApellido,estadoCivil,fechaNacimiento,categoria;
	private int numeroHijos;
	private float salario;


// Metodos de salario por hijos
	public void incrementarSalario(int porcentaje){
		this.salario = (salario * porcentaje)/100+salario;
	}

	public void incrementarSalario(int porcentaje, int fills){
		this.salario = (salario * (porcentaje+fills))/100+salario;
	}


// Sets y Gets
	public void setNombre(String name){
		nombre = name;
	}

	public String getNombre(){
		return nombre;
	}

	public void setPrimerApellido(String name){
		primerApellido = name;
	}

	public String getPrimerApellido(){
		return primerApellido;
	}

	public void setSegundoApellido(String name){
		segundoApellido = name;
	}

	public String getSegundoApellido(){
		return primerApellido;
	}

	public void setEstadoCivil(String name){
		estadoCivil = name;
	}
	public String getEstadoCivil(){
		return estadoCivil;
	}
	
	public void setNumeroHijos(int name){
		numeroHijos = name;
	}

	public int getNumeroHijos(){
		return numeroHijos;
	}
	
	public void setFechaNacimiento(String name){
		fechaNacimiento = name;
	}

	public String getFechaNacimiento(){
		return fechaNacimiento;
	}

	public void setSalario(float name){
		salario = name;
	}

	public float getSalario(){
		return salario;
	}

	public void setCategoria(String name){
		categoria = name;
	}

	public String getCategoria(){
		return categoria;
	}	




}