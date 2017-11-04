import java.io.*;

public class CCotxe {
	private String marca, model, motor, color;
	private boolean estat;
	private int numeroMarchas, numeroPuertas, marchaActual, velocidadActual, velocidadMaxima=200, velocidadMinima=0;

// constructores

	// COnstructor por defecto
	public CCotxe (){}

	// Constructor con parámetros
	public CCotxe(String marca, String model, String motor, int numeroPuertas, String color){
		this.marca = marca;
		this.model = model;
		this.motor = motor;
		this.numeroPuertas = numeroPuertas;
		this.color = color;
	}

	// Construtor copia
	public CCotxe (){
		this();
	}

//	Set y get de atributos

	// public void setMarca(String marca){
	// 	this.marca = marca;
	// }

	// public void setModel(String model){
	// 	this.model = model;
	// }
	// public void setMotor(String motor){
	// 	this.motor = motor;
	// }
	// public void setColor(String color){
	// 	this.color = color;
	// }
	// public void setEstat(boolean estat){
	// 	this.estat = estat;
	// }

	// public void setNumeroPuertas(int numeropuertas){
	// 	this.numeroPuertas = numeropuertas;
	// }

//


	public int getVelocidadActual(){
		return this.velocidadActual;
	}
	public boolean getEstat(){
		return this.estat;
	}
	public int getMarchaActual(){
		return this.marchaActual;
	}
//

	public void velocidadMarcha(int veloc){
		if (veloc==0){
			this.marchaActual=0;
		}
		if(veloc<20 && veloc > 0){
			this.marchaActual=1;
		}
		if(veloc>=20 && veloc<40){
			this.marchaActual=2;
		}
		if(veloc>=40 && veloc<60){
			this.marchaActual=3;
		}
		if(veloc>=60 && veloc<80){
			this.marchaActual=1;
		}
		if(veloc>=80){
			this.marchaActual=5;
		}
	}

//
	public int setPonerEnMarcha(){
		if (estat==false){
			this.estat = true;
			this.velocidadActual=10;
			velocidadMarcha(this.velocidadActual);
			// this.marchaActual=1;
		}
		return this.velocidadActual;
	}

	public int acelerar(int velocidad){
		if (this.estat==true){
			this.velocidadActual = this.velocidadActual + (this.velocidadActual*velocidad);


			velocidadMarcha(this.velocidadActual);

			return this.velocidadActual;
		}else{
			System.out.println("Coche no esta en marcha!");
			return 0;
		}
	}

	public int frenar(int velocidad){
		if (estat==true){
			this.velocidadActual = this.velocidadActual - (this.velocidadActual*velocidad);

			velocidadMarcha(this.velocidadActual);

			return this.velocidadActual;
		}else{
			System.out.println("Coche no esta en marcha!");
			return 0;
		}
	}
	public int cambiarMarcha(){
		if (this.estat==true){

			velocidadMarcha(this.velocidadActual);

			return this.marchaActual;
		}else{
			System.out.println("Coche no esta en marcha!");
			return 0;
		}
	}

	public void apagar(){
		if (this.estat==true){
			this.estat = false;
			this.velocidadActual = velocidadMinima;
		}else{
			System.out.println("Coche no esta en marcha!");
		}
	}






}

