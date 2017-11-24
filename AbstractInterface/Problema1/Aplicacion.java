import java.io.*;

public class Aplicacion {
	public static void main(String[] args) throws IOException {
		
		Software tipoSoftware = new Software("ProgramaJuegos",'B',"Si uf");
		Hardware tipoHardware = new Hardware("si",'A',"Si uf");
		System.out.println("Mi codigo es "+tipoSoftware.getCodigo()+", mi descripcion es "
			+tipoSoftware.getDescripcion()+", mi precio es "+tipoSoftware.calcularPrecio(tipoSoftware.getCodigo())
			+" y mi tipo es"+tipoSoftware.getTipo());
		System.out.println("Mi codigo es "+tipoHardware.getCodigo()+", mi descripcion es "+tipoHardware.getDescripcion()+", mi precio es "+tipoHardware.calcularPrecio(tipoSoftware.getCodigo()));

	}
}