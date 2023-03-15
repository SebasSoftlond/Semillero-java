package Figuras;

public class Circulo extends Figura{

	int radio;
	
	public Circulo() {
		// TODO Auto-generated constructor stub
	}
	
	/***
	 * 
	 * @param radio
	 */
	public Circulo(int radio) {
		super();
		this.nombre = "Circulo";
		this.radio = radio;
	}


	@Override
	/**
	 * 
	 */
	public double area() {
		double resultado = Math.PI * Math.pow(radio, 2);
		return resultado;
	}
}
