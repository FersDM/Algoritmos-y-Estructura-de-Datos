package clase;

public class Docente {

	private int código;
	private String nombre;
	private int horas;
	private double tarifa ;
	
	
	
	public Docente(int código, String nombre, int horas, double tarifa) {
		
		this.código = código;
		this.nombre = nombre;
		this.horas = horas;
		this.tarifa = tarifa;
	}



	public int getCódigo() {
		return código;
	}



	public void setCódigo(int código) {
		this.código = código;
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
