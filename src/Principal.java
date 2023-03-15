import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		Persona persona = new Persona("Sebastian", "Grajales", 30);
		String respuestaSaludo = persona.saludar("buenas tardes hermoso", "positiva");
		System.out.println(respuestaSaludo);
		persona.dead();
		System.out.println("hola mundo " + persona.nombre);
		//List<Integer> numeros = new ArrayList<>();
		List<Integer> numeros = new LinkedList<>();
		numeros.add(10);
		numeros.add(5);
		System.out.println(numeros.get(0));
		//int[] pares = new int[5];
		int pares[] = {1,2,3,4,5};
		System.out.println(pares[1]);
		int numero = 10;
		Integer numeroWrapper = 10;
		double numeroDouble;
		Double numeroDoubleWrapper;
		boolean estado;
		Boolean estadoWrapper;
		realizar();
	}
	
	public static void realizar() {
		
	}

}
