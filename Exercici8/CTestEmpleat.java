import java.io.*;
import java.util.Scanner;

public class CTestEmpleat {
	public static void main(String[] args) throws IOException {
		Scanner lector = new Scanner(System.in);
		

		cEmpleat empleado = new cEmpleat("Abdullah","Awan","Awan","soltero","28/05/1996","phd",0,1000);
		cEmpleat empleado2 = new cEmpleat(empleado);

		// Llamo al metodo para mostrar el mensaje
		System.out.println(empleado.toString() + " antes de aumentar el salario");
		System.out.println(empleado2.toString() + " antes de aumentar el salario");

		// Aumento el salario
		empleado2.incrementarSalario(10);
		empleado.incrementarSalario(10);

		// Llamo al metodo para mostrar el mensaje
		System.out.println(empleado.toString() + " despues de aumentar el salario");
		System.out.println(empleado2.toString() + " despues de aumentar el salario");


	}

}