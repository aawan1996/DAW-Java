import java.io.*;

public class cEmpleat {
	public String nombre,primerApellido,segundoApellido,estadoCivil,fechaNacimiento,categoria;
	public int numeroHijos;
	public float salario;


	public void incrementarSalario(int porcentaje){
		this.salario = (salario * porcentaje)/100+salario;
	}


}