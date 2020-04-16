package es.avalon.springPersona;

import java.util.ArrayList;
import java.util.List;

public class CruzRoja {

	// Me creo una lista de personas, evidentemente no me puedo crear un objeto persona
	// pero me puedo crear un Ingeniero, Deportista, etc que en si son personas, por lo 
	// si que me puedo crear un objeto lista de personas
	private List<Persona> personas=new ArrayList<Persona>();
	// ahora que quiero añadir una persona simplemente es el metodo añadir y voy a empezar
	//a rellenar mi lista, ESO SE HACE EN EL PRINCIPAL
	public void addPersona(Persona persona) {
		personas.add(persona);
	}
	
	// la lista que me habia creado arriba es una lista que esta vacia, lo siguiente que 
	// quiero hacer es tener una lista de los deportistas que tengo
	public List<Deportista> getDeportistas() {
		
		// al igual que arriba he generado una lista de donde voy a meter los deportistas
		// que de momento esta vacia
		List<Deportista> lista= new ArrayList<Deportista>();
		// lo que voy a hacer es recorrer la lista de personas que ya he creado y 
		// seleccionar los deportistas
		for (Persona p:personas) {
				if(p instanceof Deportista) {
				lista.add((Deportista)p);	
				}
		}return lista;
	}
	public List<Socorrista> getSocorrista(String ciudad, int experiencia)	{
		
		List<Socorrista> lista =new ArrayList<Socorrista>();
		for (Persona p:personas) {
			if(p.getCiudad().equals(ciudad)) {
				if(p instanceof Socorrista) {
	
					Socorrista s=(Socorrista) p;
					if(s.getExperiencia()>=experiencia) {
						lista.add(s);
					}
				}
			}
	}return lista;
		
	}
}
