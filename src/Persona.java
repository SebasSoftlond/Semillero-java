
public class Persona {

	String nombre;
	String apellidos;
	int edad;
	
	
	public Persona() {
	}
	
	public Persona(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String saludar(String saludo, String actitud) {
		String saludoDevuelta = "";
		if(saludo.contains("buenas") && actitud.equals("positiva")) {
			saludoDevuelta = "Buenas, como estas?";
		}
		return saludoDevuelta;
	}
	
	public void dead() {
		System.out.println("me morí");
	}
	
	
}
