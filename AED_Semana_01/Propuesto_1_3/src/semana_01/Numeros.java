package semana_01;

public class Numeros {

	public int numero1;
	public int numero2;
	public int numero3;

	// Un m�todo que retorne el n�mero menor.
	public double numeroMenor() {

		double menor = 0;
		if (numero1 < menor) {
			menor = numero1;
		}

		else if (numero2 < menor) {
			menor = numero2;
		}

		else
			menor = numero3;
		return menor;
	}

	// Un m�todo que retorne el n�mero mayor.
	public double numeroMayor() {

		double mayor = 0;
		if (numero1 > mayor) {
			mayor = numero1;
		}

		else if (numero2 > mayor) {
			mayor = numero2;
		}

		else
			mayor = numero3;
		return mayor;
	}

	// Un m�todo que retorne el n�mero del medio (ubicado entre el menor y el
	// mayor).
	public double numeroMedio() {

		double medio = 0;

		if (numeroMayor() != numero1 && numeroMenor() != numero1)
			medio = numero1;
		else if (numeroMayor() != numero2 && numeroMenor() != numero2)
			medio = numero2;
		else
			medio = numero3;

		return medio;
	}

}
