package es.avalon.socorrismo;

import java.util.ArrayList;
import java.util.List;

public class CruzRoja {

	private List<Persona> personas = new ArrayList<Persona>();

	public void addPersona(Persona persona) {

		personas.add(persona);
	}

	public List<Deportista> getDeportistas() {

		List<Deportista> lista = new ArrayList<Deportista>();

		for (Persona p : personas) {

			// comprueba si un objeto es de una clase concreta
			if (p instanceof Deportista) {

				lista.add((Deportista) p);
			}

		}
		return lista;

	}

	public List<Socorrista> getSocorrista(String ciudad, int experiencia) {

		List<Socorrista> lista=new ArrayList<Socorrista>();
		
		for (Persona p : personas) {
			
			if(p.getCiudad().contentEquals(ciudad)) {
				
				// comprueba si un objeto es de una clase concreta, en este caso comprueba si implementa el interfaz
				if (p instanceof Socorrista) {
					
					Socorrista s=(Socorrista) p;
					
					if(s.getExperiencia()>=experiencia) {
						
						lista.add(s);
					}
				}
				
			}

		}

		return lista;

	}
}
