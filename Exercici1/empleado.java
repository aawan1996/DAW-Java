import java.io.*;
import java.util.Scanner;

public class empleado {
	public static void main(String[] args) throws IOException {
		Scanner lector = new Scanner(System.in);
		cEmpleat empleado = new cEmpleat();
		System.out.print("Introduce el nombre: ");
		empleado.nombre = lector.nextLine();

		System.out.print("Introduce el primer apellido: ");
		empleado.primerApellido = lector.next();

		System.out.print("Introduce el segundo apellido: ");
		empleado.segundoApellido = lector.next();

		System.out.print("Introduce el estado civil: ");
		empleado.estadoCivil = lector.next();

		System.out.print("Introduce el nombre de hijos: ");
		empleado.numeroHijos = lector.nextInt();

		System.out.print("Introduce tu fecha de nacimiento: ");
		empleado.fechaNacimiento = lector.next();

		System.out.print("Introduce el salario: ");
		empleado.salario = lector.nextFloat();

		System.out.print("Introduce la categoria: ");
		empleado.categoria = lector.next();

		System.out.println("Hola me llamo "+empleado.nombre+" "+empleado.primerApellido+" "+empleado.segundoApellido+" y cobro "+empleado.salario);
		empleado.incrementarSalario(21);
		System.out.println("Hola me llamo "+empleado.nombre+" "+empleado.primerApellido+" "+empleado.segundoApellido+" y cobro "+empleado.salario);
	}
}