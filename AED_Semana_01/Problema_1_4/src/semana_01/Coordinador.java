package semana_01;

import javax.swing.JOptionPane;

public class Coordinador {
	public int codigo;
	public String nombre;
	public int categoria;
	public int celular;

	// Un método que retorne el sueldo del coordinador
	public double sueldoCoordinador() {
		double sueldo = 0;

		switch (categoria) {
			case 0:
				sueldo = 8500;

				break;
			case 1:
				sueldo = 6850;

				break;
			case 2:
				sueldo = 5500;

				break;
			default:
				JOptionPane.showMessageDialog(null,
						"No existe la categoria ingresada ,corregir!!!");
				;
				break;
		}
		return sueldo;

	}

}
