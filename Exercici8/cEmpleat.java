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


// atributos en parametro
	public cEmpleat(String nombre,String primerApellido,String segundoApellido,String estadoCivil,String fechaNacimiento,
		String categoria,int numeroHijos, float salario){
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.estadoCivil = estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
		this.categoria = categoria;
		this.numeroHijos = numeroHijos;
		this.salario = salario;
	}
	public cEmpleat(){
		this("","","","","","",0,0);
	}
	// Hacemos la copia del objeto cEmpleat
	public cEmpleat(cEmpleat object){
		this.nombre = object.nombre;
		this.primerApellido = object.primerApellido;
		this.segundoApellido = object.segundoApellido;
		this.estadoCivil = object.estadoCivil;
		this.fechaNacimiento = object.fechaNacimiento;
		this.categoria = object.categoria;
		this.numeroHijos = 3;
		this.salario = object.salario;	
	}



// Sets y Gets
	// public void setNombre(String name){
	// 	nombre = name;
	// }

	public String getNombre(){
		return this.nombre;
	}

	// public void setPrimerApellido(String name){
	// 	primerApellido = name;
	// }

	public String getPrimerApellido(){
		return this.primerApellido;
	}

	// public void setSegundoApellido(String name){
	// 	segundoApellido = name;
	// }

	public String getSegundoApellido(){
		return this.segundoApellido;
	}

	// public void setEstadoCivil(String name){
	// 	estadoCivil = name;
	// }
	// public String getEstadoCivil(){
	// 	return estadoCivil;
	// }
	
	// public void setNumeroHijos(int name){
	// 	numeroHijos = name;
	// }

	public int getNumeroHijos(){
		return this.numeroHijos;
	}
	
	// public void setFechaNacimiento(String name){
	// 	fechaNacimiento = name;
	// }

	// public String getFechaNacimiento(){
	// 	return fechaNacimiento;
	// }

	// public void setSalario(float name){
	// 	salario = name;
	// }

	 public float getSalario(){
	 	return this.salario;
	 }

	// public void setCategoria(String name){
	// 	categoria = name;
	// }

	// public String getCategoria(){
	// 	return categoria;
	// }	

	public String toString (){
		// System.out.println("Hola");
		String mensaje = "Hola, me llamo "+this.nombre+" "+this.primerApellido+" "+this.segundoApellido+""+" y cobro "+this.salario;
		// System.out.println("Hola soy el segundo objeto y me llamo "+empleado2.getNombre()+" "+empleado2.getPrimerApellido()+" "+empleado2.getSegundoApellido()+" y cobro "+empleado2.getSalario());
		return mensaje;
	}



}