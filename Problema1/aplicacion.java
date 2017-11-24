import java.io.*;

public class aplicacion {
	public static void main(String[] args) throws IOException {
		sucursal hola = new secundaria(12,"carrer arcerisa", "bcn","principal1");
		paquete pack = new paquete(20,"","AE1");
		paquete pack = new paquete(30,"alta","AE1");
		paquete pack = new paquete(3,"Express","AE1");
		System.out.println(hola.calcularPrecio(pack));			
	}
}