package semana_01;

public class Caja {

	public double largoCent�metros;
	public double anchoCent�metros;
	public double altoCent�metros;
	public double pesoBalanza;
	public double kilogramos;

	// Un m�todo que retorne el volumen de la caja en cent�metros c�bicos (largo
	// * ancho * alto).

	public double volCaja() {
		return largoCent�metros * anchoCent�metros * altoCent�metros;

	}

	/*
	 * Un m�todo que retorne el peso volum�trico en kilogramos: (volumen en
	 * cent�metros c�bicos / 5000).
	 */

	public double pesoKilogramos() {
		return volCaja() / 5000;
	}

	/*
	 * Un m�todo que retorne el peso facturable que es el mayor peso entre el
	 * peso de balanza y el peso volum�trico.
	 */
	public double pesoFacturable() {
		double peso = 0;

		if (pesoBalanza > peso)
			peso = pesoBalanza;
		else if (pesoKilogramos() > peso)
			peso = pesoKilogramos();
		return peso;
	}
}
