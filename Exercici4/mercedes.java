import java.io.*;
import java.util.Scanner;

public class mercedes {
	public static void main(String[] args) throws IOException {
		Scanner lector = new Scanner(System.in);
		CCotxe coche = new CCotxe();

		boolean estado = false;
		
		coche.setEstat(estado);
		System.out.println("Mi estado es "+estado);

		System.out.println("Marca?"); 
		String marca = lector.next();
		coche.setMarca(marca);

		System.out.println("Modelo");
		String modelo = lector.next();
		coche.setModel(modelo);

		System.out.println("Motor");
		String motor = lector.next();
		coche.setMotor(motor);
		// System.out.println("");
		// int numMarcha = lector.nextInt();
		System.out.println("Puertas?");
		int numPuertas = lector.nextInt();
		coche.setNumeroPuertas(numPuertas);

		System.out.println("Color?");
		String color = lector.next();
		coche.setColor(color);

		//Pongo el coche en marcha
		int velocidad = coche.setPonerEnMarcha();
		//
		System.out.println("Mi estado es "+coche.getEstat()+", mi velocidad es "+coche.getVelocidadActual()+", y mi marcha actual es "+coche.getMarchaActual());

		//acelerar el coche
		velocidad = coche.acelerar(1);
		System.out.println("Mi estado es "+coche.getEstat()+", mi velocidad es "+coche.getVelocidadActual()+", y mi marcha actual es "+coche.getMarchaActual());

		//Freno el coche
		velocidad = coche.frenar(1);
		System.out.println("Mi estado es "+coche.getEstat()+", mi velocidad es "+coche.getVelocidadActual()+", y mi marcha actual es "+coche.getMarchaActual());


	}
}