import java.io.*;

public class Software extends Articulo {
	private String tipo;
	//////////////////////////////////////////////////////
	// CONSTRUCTOR
	//////////////////////////////////////////////////////
	public Software(String tipo, char codigo, String descripcion){
		super(codigo, descripcion);
		this.tipo = tipo;
	}

	//////////////////////////////////////////////////////
	// SETTER & GETTER
	//////////////////////////////////////////////////////
	 public String getTipo(){
	 	return this.tipo;
	 }
	 
	 public void setTipo(String tipo){
	 	this.tipo = tipo;
	 }

	// 
	 public double calcularPrecio(char codigo){
	 	// if (getCodigo().equals("A")){
	 	// 	return A;
	 	// }
	 	if (codigo=='B'){
	 		if (this.tipo.equals("ProgramaJuegos")){
	 			return (A*0.05)+B;
	 		}
	 		return B;
	 	}
	 	if (codigo=='C'){
	 		if (this.tipo.equals("ProgramaJuegos")){
	 			return (B*0.05)+C;
	 		}
	 		return C;
	 	}
	 	return 0;
	 }


}