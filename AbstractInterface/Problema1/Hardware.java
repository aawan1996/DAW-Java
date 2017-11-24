import java.io.*;

public class Hardware extends Articulo{
	private String periferico;
	//////////////////////////////////////////////////////
	// CONSTRUCTOR
	//////////////////////////////////////////////////////
	public Hardware(String periferico,char codigo, String descripcion){
		super(codigo, descripcion);
		this.periferico = periferico;
	}

	//////////////////////////////////////////////////////
	// SETTER & GETTER
	//////////////////////////////////////////////////////
	 public String getPeriferico(){
	 	return periferico;
	 }
	 
	 public void setPeriferico(String periferico){
	 	this.periferico = periferico;
	 }

	public double calcularPrecio(char codigo){
	 	if (codigo=='A'){
	 		if (this.periferico.equals("si")){
	 			return (A*0.10)+A;
	 		}
	 		return A;
	 	}
	 	if (codigo=='B'){
	 		if (this.periferico.equals("si")){
	 			return (B*0.10)+B;
	 		}
	 		return B;
	 	}
	 	return 0;
	 }


}