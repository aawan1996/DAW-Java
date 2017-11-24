import java.io.*;

public class Aplicacion {
	public static void main(String[] args) throws IOException {
		Documento [] lista = new Documento[3];
		lista[0] = new Cd("20/12/2012","TrapKings",20,"no","BB");
		lista[1] = new Dvd("20/12/2013","Trapficante",20,"Si","AA");
		lista[2] = new Libro("20/12/2014","Selva",20,"no","CC");	
		Socio socio1 = new Socio("abdullah","x7063654d",123,lista);
		// ArrayList<String> lista = new ArrayList<String>();
		// lista.add(1);
		// list.size()
		for (int i=0;i<lista.length ; i++) {
			System.out.println("El socio: "+socio1.getNombre()+ " y la penalizacion "+lista[i].calcularPenalizacion());
			
		}
	}
}