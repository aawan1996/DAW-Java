import java.io.*;
import java.util.Scanner;

public class CLlegir {
	Scanner leer = new Scanner(System.in);
	public int leerCantidad(){
		System.out.print("Cantidad: ");
		return leer.nextInt();
	}
	public int leerNumeroSecreto(){
		System.out.print("Numero secreto: ");
		return leer.nextInt();
	}

}