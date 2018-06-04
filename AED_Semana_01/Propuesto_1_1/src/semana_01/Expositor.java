package semana_01;

public class Expositor {
 
	public int codigo; 
	public String nombre;
	public int horasTrabajadas;
	public double tarifaHora;
	
	//Un método que retorne el sueldo bruto (horas * tarifa).
	public double sueldoBruto(){
		return horasTrabajadas*tarifaHora;
	}
	
	
	//Un método que retorne el descuento por AFP (10% del sueldo bruto).
	public double desctAFP(){
		return sueldoBruto()*0.1;
		
	}
	
	//Un método que retorne el descuento por EPS (5% del sueldo bruto).
	public double desctEPS(){
		return sueldoBruto()*0.05;
		
	}
	//Un método que retorne el sueldo neto (sueldo bruto – descuentoAFP – descuentoEPS)
	
	public double sueldoNeto(){
		return sueldoBruto()-(desctAFP()+desctEPS());
		
	}
	
	
}
