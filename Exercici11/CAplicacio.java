import java.io.*;
import java.util.Scanner;

public class CAplicacio {

	public static void main(String[] args)throws IOException {
		CPersona tonto = new CPersona("Abdullah","Awan","AWan",1234);
		CLlegir leer = new CLlegir();
		CCompteBancari compte1 = new CCompteBancari(tonto);

		System.out.println("****************************************");
		System.out.println("                -INGRESO-               ");
		System.out.println("****************************************");

		boolean ok1 = false;
		while (ok1 == false){
			if (compte1.ingresar(leer.leerCantidad(), leer.leerNumeroSecreto())){
				System.out.println("Tu saldo: "+compte1.getSaldo());
				ok1 = true;
			}else{
				System.out.println("Numero secreto incorrecto, prueba de nuevo!");
			}
		}

		System.out.println("****************************************");
		System.out.println("                -EXTRAER-               ");
		System.out.println("****************************************");

		boolean ok = false;
		while (ok == false){
			if (compte1.extreure(leer.leerCantidad(), leer.leerNumeroSecreto())){
				if(compte1.getSaldo()>=0){
					System.out.println("Tu saldo: "+compte1.getSaldo());
					ok = true;
				}
				else if (compte1.getSaldo()<0){
					System.out.println("Tu saldo esta negativo!");
					System.out.	println("Tu saldo: "+compte1.getSaldo());
					ok = true;
				}
			}else{
				System.out.println("Numero secreto incorrecto, prueba de nuevo!");
			}
		}

	}
}