package semana_01;

public class Persona {
	public String nombre;
	public String apellido;
	public int edad;
	public double estatura;
	public double peso;

	// Un m�todo que retorne el estado de la persona entre: �menor de edad� o
	// �mayor de edad�.

	public String estadoPersona() {

		String estado = "";

		if (edad < 18) {
			estado = "Menor de edad ";
		}

		else
			estado = "Mayor de edad ";

		return estado;
	}

	// Un m�todo que retorne el �ndice de masa corporal de la persona
	// (peso/estatura�).

	public double masaCorporal() {

		return peso / (estatura * estatura);

	}

}
