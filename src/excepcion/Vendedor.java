package excepcion;

public class Vendedor {

	String nombre;
	String apellidos;
	int edad;
	
	public Vendedor() {
		// TODO Auto-generated constructor stub
	}
	
	public Vendedor(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	void imprimir() {
		System.out.println("Nombre del vendedor" + nombre);
		System.out.println("Apellido del vendedor " + apellidos);
		System.out.println("Edad del vendedor " + edad);
	}
	
	void verificarEdad(int edad) {
		if(edad < 18) {
			throw new IllegalArgumentException("El vendedor debe ser mayor a 18 años");
		}
		if(edad >= 0 && edad < 120) {
			this.edad = edad;
		}
		else {
			throw new IllegalArgumentException("La edad no puede ser negativa ni mayor a 120");
		}
		
	}
	
	
}
