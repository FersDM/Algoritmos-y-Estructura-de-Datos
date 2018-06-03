package clase;

public class Docente {

	private int c�digo;
	private String nombre;
	private int horas;
	private double tarifa ;
	
	
	
	public Docente(int c�digo, String nombre, int horas, double tarifa) {
		
		this.c�digo = c�digo;
		this.nombre = nombre;
		this.horas = horas;
		this.tarifa = tarifa;
	}



	public int getC�digo() {
		return c�digo;
	}



	public void setC�digo(int c�digo) {
		this.c�digo = c�digo;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getHoras() {
		return horas;
	}



	public void setHoras(int horas) {
		this.horas = horas;
	}



	public double getTarifa() {
		return tarifa;
	}



	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	
	
	// sueldo (horas * tarifa).
	
	public double sueldo(){
		
		return horas*tarifa;
	}
	
	
	
	
	
}
