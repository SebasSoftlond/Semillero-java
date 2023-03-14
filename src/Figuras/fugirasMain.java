package Figuras;

import java.util.ArrayList;

public class fugirasMain {

	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(new Cuadrado(4));
		figuras.add(new Circulo(3));
		for (Figura figura : figuras) {
			System.out.println(figura.nombre + " area " + figura.area());
		}
	}

}
