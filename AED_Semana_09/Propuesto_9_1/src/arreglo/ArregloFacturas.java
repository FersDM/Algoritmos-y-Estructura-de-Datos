package arreglo;

import java.lang.reflect.Array;
import java.util.ArrayList;

import clase.Factura;

public class ArregloFacturas {

	

	private ArrayList<Factura> fac ;

	//construtor 
	
	public ArregloFacturas(){
	
		fac= new ArrayList<Factura>();
		
		adicionar(new Factura("1041223451","Digetel",10,25));
		adicionar(new Factura("1044323451","Worknet",50,25));
		adicionar(new Factura("1056523451","Insertel",20,25));
		adicionar(new Factura("1078523451","Igtel",10,45));
		adicionar(new Factura("1090523451","Alcatel",20,25));
		adicionar(new Factura("1023523451","Sicsa",50,25));
		adicionar(new Factura("1012523451","Igw",45,25));
	}
	

	//M�todos b�sicos

	
//  Operaciones p�blicas b�sicas
	public void adicionar(Factura x) {
		fac.add(x);
	}
	public int tama�o() {
		return fac.size();
	}
	public Factura obtener(int i) {
		return fac.get(i);
	}
	//  Operaciones p�blicas complementarias
	
	public double sumaImportes(){
		double suma=0.0;
		for (int i = 0; i <tama�o(); i++) {
			
			suma+=obtener(i).importFacturado();	
		}
		
		return suma;
	}
	
	public double impPromedio(){
	
		
		return sumaImportes()/tama�o();
	}
	
	
	public double impMenor() {
		double menor=obtener(0).importFacturado();
		
		for (int i = 0; i <tama�o(); i++) {
			if(obtener(i).importFacturado()<menor){
				menor=obtener(i).importFacturado();}
			
		}
		return menor;
         
    }
	
	public double impMayor() {
		double mayor=obtener(0).importFacturado();
		
		for (int i = 0; i <tama�o(); i++) {
			if(obtener(i).importFacturado()>mayor){
				mayor=obtener(i).importFacturado();
			}
		}
		return mayor;
         
    }
	
	
 public String nomEmpImpMenor(){
	 
	 for (int i = 0; i <tama�o(); i++) {
			if (obtener(i).importFacturado()<impPromedio())
				return obtener(i).getEmpresa();
			
		}
		return null;
	}
	
}
