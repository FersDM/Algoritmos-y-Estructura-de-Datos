package arreglo;

import java.util.ArrayList;

import clase.Alumno;

public class ArregloAlumnos {
	//  Atributo privado
	private ArrayList <Alumno> alu;
	//  Constructor
    public ArregloAlumnos() {
        alu = new ArrayList <Alumno> ();
    	adicionar(new Alumno(123, "Ana", 19, 17));
    	adicionar(new Alumno(456, "Juan", 15, 14));
    	adicionar(new Alumno(789, "Pedro", 19, 15));
    	adicionar(new Alumno(302, "David", 13, 18));
    	adicionar(new Alumno(417, "Carlos", 20, 19));
    	adicionar(new Alumno(641, "Jorge", 12, 13));
    	adicionar(new Alumno(208, "María", 15, 17));
    	adicionar(new Alumno(820, "José", 11, 10));
    }
//  Operaciones públicas básicas
	public void adicionar(Alumno x) {
		alu.add(x);
	}
	public int tamaño() {
		return alu.size();
	}
	public Alumno obtener(int i) {
		return alu.get(i);
	}
	//  Operaciones públicas complementarias
	public int cantAprobados() {
		int c=0;
		for (int i = 0; i < tamaño(); i++) {
		if (obtener(i).promedio()>=13){
			c++;
			}
		}
    	return c;
    }
	
	public int cantDesaprobados() {
		int c=0;
		for (int i = 0; i < tamaño(); i++) {
		if (obtener(i).promedio()<13){
			c++;
			}
		}
    	return c;
    }
	
	public double promMayor (){
		
		double mayor = obtener(0).promedio();
		
		for (int i = 0; i < tamaño(); i++) {
			if (obtener(i).promedio()>mayor){
				mayor=obtener(i).promedio();
				
			}
			}
			return mayor;
				
}
	
   public double promMenor (){
		
		double menor = obtener(0).promedio();
		
		for (int i = 0; i < tamaño(); i++) {
			if (obtener(i).promedio()<menor){
				menor=obtener(i).promedio();
				
			}
			}
			return menor;
				
}
	
	
public String nombrePrimerAlumnoDesaprobado(){
	
	for (int i = 0; i <tamaño(); i++) {
		if (obtener(i).promedio()<13)
			return obtener(i).getNombre();
		
	}
	return null;
}

public String nombreUltimoAlumnoAprobado(){
	
	for (int i = tamaño()-1; i >=0; i--) {
		if (obtener(i).promedio()>=13)
			return obtener(i).getNombre();
		
	}
	return null;
}

	
}