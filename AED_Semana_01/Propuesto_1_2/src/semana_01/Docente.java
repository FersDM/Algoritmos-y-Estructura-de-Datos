package semana_01;

public class Docente {
	
	 public int  codigo;
	 public String nombre;
	 public int horasTrabajadas;
	 public double tarifaHora;
	 
	 //Un método público que retorne el sueldo (horas * tarifa). 
	 
	 public double sueldo(){
		 return horasTrabajadas*tarifaHora;
	 }
}
