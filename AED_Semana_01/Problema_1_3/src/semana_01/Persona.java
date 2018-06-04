package semana_01;

public class Persona {
	public String nombre;
	public String apellido;
	public int edad;
	public double estatura;
	public double peso;

	// Un método que retorne el estado de la persona entre: “menor de edad” o
	// “mayor de edad”.

	public String estadoPersona() {

		String estado = "";

		if (edad < 18) {
			estado = "Menor de edad ";
		}

		else
			estado = "Mayor de edad ";

		return estado;
	}

	// Un método que retorne el índice de masa corporal de la persona
	// (peso/estatura²).

	public double masaCorporal() {

		return peso / (estatura * estatura);

	}

}
