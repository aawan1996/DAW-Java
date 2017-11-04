import java.io.*;
import java.util.Scanner;

public class CTestEmpleat {
	public static void main(String[] args) throws IOException {
		Scanner lector = new Scanner(System.in);
		cEmpleat empleado = new cEmpleat();

		
		System.out.print("Introduce el nombre: ");
		String nombre = lector.nextLine();
		empleado.setNombre(nombre);

		// System.out.print(empleado.getNombre(nombre));


		System.out.print("Introduce el primer apellido: ");
		String primerApellido = lector.next();
		empleado.setPrimerApellido(primerApellido);

		System.out.print("Introduce el segundo apellido: ");
		String segundoApellido = lector.next();
		empleado.setSegundoApellido(segundoApellido);

		System.out.print("Introduce el estado civil: ");
		String estadoCivil = lector.next();
		empleado.setEstadoCivil(estadoCivil);

		System.out.print("Introduce el nombre de hijos: ");
		int numeroHijos = lector.nextInt();
		empleado.setNumeroHijos(numeroHijos);

		System.out.print("Introduce tu fecha de nacimiento: ");
		String fechaNacimiento = lector.next();
		empleado.setFechaNacimiento(fechaNacimiento);

		System.out.print("Introduce el salario: ");
		float salario = lector.nextFloat();
		empleado.setSalario(salario);

		System.out.print("Introduce la categoria: ");
		String categoria = lector.next();
		empleado.setCategoria(categoria);

		System.out.println("Hola me llamo "+empleado.getNombre()+" "+empleado.getPrimerApellido()+" "+empleado.getSegundoApellido()+" y cobro "+empleado.getSalario());
		empleado.incrementarSalario(21);
		System.out.println("Hola me llamo "+empleado.getNombre()+" "+empleado.getPrimerApellido()+" "+empleado.getSegundoApellido()+" y cobro "+empleado.getSalario());
	}
}