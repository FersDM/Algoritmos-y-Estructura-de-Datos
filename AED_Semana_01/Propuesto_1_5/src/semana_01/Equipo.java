package semana_01;

public class Equipo {
	public int codigo;
	public String marca;
	public String color;
	public double precioDolares;

	// Un m�todo que retorne el precio del equipo en soles. Considere que: 1
	// d�lar = 3.25 soles.

	public double precioSoles() {
		return precioDolares * 3.25;
	}

	// Un m�todo que retorne el precio del equipo en euros. Considere que: 1
	// euro = 1.20 d�lares.

	public double precioEuros() {
		return precioDolares * 1.20;
	}

}
