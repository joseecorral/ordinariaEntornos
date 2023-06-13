package Aplicacion;

import java.util.HashMap;

public class Personas {

	private HashMap<String, Integer> listadoPersonas;
	
	public Personas() {
		listadoPersonas = new HashMap<>();
	}
	
	public void vaciar(){
		listadoPersonas.clear();
	}
	
	public void addPersona(String nombre, int edad) throws Exception {	
		if(edad < 0) {
			throw new Exception("Edad incorrecta");
		}else if(listadoPersonas.containsKey(nombre)){
			throw new Exception("Ya existe una persona con el nombre "+nombre);
		}else{
			listadoPersonas.put(nombre, edad);
		}
	}
	
	public int edadMinima() throws Exception {
		if(listadoPersonas.isEmpty()) {
			throw new Exception("No hay personas");
		}else {
			int minimo = Integer.MAX_VALUE;
			for(int edad : listadoPersonas.values()) {
				if(edad < minimo) {
					minimo = edad;
				}
			}
			return minimo;
		}
	}
	
}
