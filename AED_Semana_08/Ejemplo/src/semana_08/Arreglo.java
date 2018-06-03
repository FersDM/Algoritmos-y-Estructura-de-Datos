package semana_08;

public class Arreglo {

	//  Atributos privados
	private int[] n;
	private int indice;
	//  Constructor
	public Arreglo() {
		n = new int[10];
		indice = 0;
	}
	//  Operaciones p�blicas b�sicas
	public int tama�o() {
		return indice;
	}
	public int obtener(int i) {
		return n[i];
	}
	//  Operaciones p�blicas complementarias
	public void insertarAlInicio(int numero) {
		insertar(0, numero);
	}
	public void buscarEliminar(int numero) {
		int pos = buscar(numero);
		if (pos != -1)
			eliminar(pos);
	}
	public void invertirArreglo() {
		int i = 0, j = indice-1;
		while (i < j) {
			intercambiar(i, j);
			i ++;
			j --;
		}
	}
	public void ordenarArreglo() {
		for (int i=0; i<indice-1; i++)
			for (int j=i+1; j<indice; j++)
				if (n[i] > n[j])
					intercambiar(i, j);
	}
	//  Operaciones privadas
	private void ampliarArreglo() {
		int[] aux = n;
		n = new int[indice + 10];
		for (int i=0; i<indice; i++)
			n[i] = aux[i];
	}
	private void adicionar(int numero) {
		if (indice == n.length)
			ampliarArreglo();
		n[indice] = numero;
		indice ++;
	}
	private int buscar(int numero) {
		for (int i=0; i<indice; i++)
			if (n[i] == numero)
				return i;
		return -1;
	}
	private void intercambiar(int pos1, int pos2) {
		int aux = n[pos1];
		n[pos1] = n[pos2];
		n[pos2] = aux;
	}
	private void insertar(int pos, int numero) {
		adicionar(numero);
		for (int i=indice-1; i>pos; i--)
			intercambiar(i, i-1);
	}
	private void eliminar(int pos) {
		for (int i=pos; i<indice-1; i++)
			n[i] = n[i+1];
		indice --;
	}
	
}