package semana_01;

public class Trabajador {
	public int codigo;
	public int horasTrabajadas;
	public double tarifaHoraria;

	public double sueldoBruto() {
		return (horasTrabajadas * tarifaHoraria);
	}

	public double descuento() {
		double descuento = 0.0;
		if (sueldoBruto() <= 4500) {
			descuento = sueldoBruto() * 0.12;
		}
		else if (sueldoBruto() >= 4500 && sueldoBruto() < 6500) {
			descuento = sueldoBruto() * 0.14;
		}
		else {
			descuento = sueldoBruto() * 0.16;
		}
		return descuento;
	}

	public double sueldoNeto() {
		return sueldoBruto() - descuento();
	}
}
