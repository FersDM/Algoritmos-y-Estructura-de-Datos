package arreglo;

import java.util.ArrayList;

import clase.Docente;

public class ArregloDocentes {
	


	private ArrayList<Docente> doc ;

	//construtor 
	
	public ArregloDocentes(){
	
		doc= new ArrayList<Docente>();
		
		adicionar(new Docente(101,"Rosa",2, 10));
		adicionar(new Docente(102,"Maria",5, 120));
		adicionar(new Docente(103,"Karina",2, 20));
		adicionar(new Docente(104,"Tamara",6, 10));
		adicionar(new Docente(105,"Luisa",5, 40));
		adicionar(new Docente(106,"Natalia",2, 24));
		adicionar(new Docente(107,"Maga",4, 32));
		adicionar(new Docente(108,"Ana",8, 54));
		
	}
	

	//Métodos básicos

	
//  Operaciones públicas básicas
	public void adicionar(Docente x) {
		doc.add(x);
	}
	public int tamaño() {
		return doc.size();
	}
	public Docente obtener(int i) {
		return doc.get(i);
	}
	//  Operaciones públicas complementarias
	
	public double sumaSueldo(){
		double suma=0.0;
		for (int i = 0; i <tamaño(); i++) {
			
			suma+=obtener(i).sueldo();	
		}
		
		return suma;
	}
	
	public double sueldoPromedio(){
	
		
		return sumaSueldo()/tamaño();
	}
	
	
	public double sueldoMenor() {
		double menor=obtener(0).sueldo();
		
		for (int i = 0; i <tamaño(); i++) {
			if(obtener(i).sueldo()<menor){
				menor=obtener(i).sueldo();}
			
		}
		return menor;
         
    }
	
	public double sueldoMayor() {
		double mayor=obtener(0).sueldo();
		
		for (int i = 0; i <tamaño(); i++) {
			if(obtener(i).sueldo()>mayor){
				mayor=obtener(i).sueldo();
			}
		}
		return mayor;
         
    }
	
	public double tarifaMenor() {
		double menor=obtener(0).sueldo();
		
		for (int i = 0; i <tamaño(); i++) {
			if(obtener(i).getTarifa()<menor){
				menor=obtener(i).getTarifa();}
			
		}
		return menor;
         
    }
	
	public double tarifaMayor() {
		double mayor=obtener(0).sueldo();
		
		for (int i = 0; i <tamaño(); i++) {
			if(obtener(i).getTarifa()>mayor){
				mayor=obtener(i).getTarifa();
			}
		}
		return mayor;
         
    }

	

}
