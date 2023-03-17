package excepcion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args){
		
		/*try {
			
		} catch (Exception e) {
			
		}finally {
			
		}*/
		
		//throw new Exception("");
		
		
		//hacerDivision(1000, 0);
		//crearVendedor();
		calcularLogaritmoNeperiano("a");
	}
	
	public static void hacerDivision(int n1, int n2) {
		try {
			System.out.println("Ingresando el primer try");
			double cociente = n1/n2;
			System.out.println("Despues de la division");
		} catch (ArithmeticException e) {
			System.out.println("Division por cero");
		}finally {
			System.out.println("Ingresando al primero finally");
		}
	}
	
	public static void crearVendedor() {
		Scanner teclado = new Scanner(System.in);
		Vendedor vendedor = new Vendedor();
		try {
			System.out.println("Nombre vendedor = ");
			String nombre = teclado.next();
			System.out.println("Apellidos del vendedor = ");
			String apellidos = teclado.next();
			vendedor.nombre = nombre;
			vendedor.apellidos = apellidos;
			validarEdad(teclado, vendedor);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			validarEdad(teclado, vendedor);
		}
	}

	private static void validarEdad(Scanner teclado, Vendedor vendedor) {
		System.out.println("edad del vendedor = ");
		int edad = teclado.nextInt();
		vendedor.verificarEdad(edad);
		vendedor.imprimir();
	}
	
	static void calcularLogaritmoNeperiano(String valor) {
		try {
			if(Double.parseDouble(valor) < 0) {
				throw new ArithmeticException("El valor debe ser un numero positivo");
			}
			double resultado = Math.log(Double.parseDouble(valor));
			System.out.println("Resultado = " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("el valor debe ser un numero positivo para calcular el logaritmo");
		}
		catch (NumberFormatException e) {
			System.out.println("Error: " + e.getMessage());
			System.out.println("Linea de error " + e.getStackTrace()[0].getLineNumber() + 
					" En la clase: " + e.getStackTrace()[0].getClassName());
		}
	}
}
