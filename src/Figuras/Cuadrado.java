package Figuras;

public class Cuadrado extends Figura{
	
	int lado;
	
	public Cuadrado() {
		super();
	}
	

	public Cuadrado(int lado) {
		super();
		this.nombre = "Cuadrado";
		this.lado = lado;
	}




	@Override
	public double area() {
		double resultado = lado * lado;
		return resultado;
	}

}
