import java.io.*;
import java.util.Scanner;

public class CTestEmpleat {
	public static void main(String[] args) throws IOException {
		Scanner lector = new Scanner(System.in);

		cEmpleat empleado = new cEmpleat("Abdullah","Awan","Awan","soltero","28/05/1996","phd",0,1000);
		cEmpleat empleado2 = new cEmpleat(empleado);

		//////////////////////////////////////////
		// Comprovem si son iguals amb el metode
		//////////////////////////////////////////
		if (empleado.equals(empleado2)) {
			System.out.println("Els objectes son iguals");
		}else{
			System.out.println("Els objectes son diferents");
		}

		////////////////////////////////////////////////
		// Amb el metode toString imprimim per pantalla
		////////////////////////////////////////////////
		System.out.println(empleado.toString());
		System.out.println(empleado2.toString());


		///////////////////////////////////////////////
		// Amb el metode creat, incrementem el salari
		//////////////////////////////////////////////
		empleado2.incrementarSalario(10);
		empleado.incrementarSalario(10);

		////////////////////////////////////////////////
		// Amb el metode toString imprimim per pantalla
		////////////////////////////////////////////////
		System.out.println(empleado.toString());
		System.out.println(empleado2.toString());


	}

}