import java.io.*;

public class Aplicacion {
	public static void main(String[] args) throws IOException {
		Paciente [] pacientes = new Paciente[2]; 
		pacientes[0] = new Paciente("Eugeni","x75833757","111111111");
		pacientes[1] = new Paciente("Abdullah","x70658384","222222222");
		Medico medico1 = new Medico("Enfermo",10,"Zafar Ahmed","xxxxxxxxxx",pacientes);
		Enfermero enfermero1 = new Enfermero(6,"Pepe","fffffff");
		System.out.println("El nombre del primer paciente es: "+pacientes[0].getNombre());
		System.out.println("El nombre del segundo paciente es: "+pacientes[1].getNombre());
		System.out.println("Días de vacaciones correspondientes al medico: "+medico1.calcularDias());
		System.out.println("Días de vacaciones correspondientes al enfermero: "+enfermero1.calcularDias());
	}

}