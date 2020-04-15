package es.avalon.socorrista;

import java.util.ArrayList;
import java.util.List;

public class FactoriaServicioDePlayas {
	private List<Persona> personas = new ArrayList<Persona>();

	public void addPersona(Persona persona) {
		personas.add(persona);
	}

	public List<Deportista> getDeportistas() {
		List<Deportista> lista = new ArrayList<Deportista>();

		for (Persona p : personas) {
			if (p instanceof Deportista) {
				lista.add((Deportista) p);
			}

		}

		return lista;

	}

	public List<Socorrista> getSocorrista(String ciudad, int experiencia) {
		List<Socorrista> lista= new ArrayList<Socorrista>();

		for (Persona p : personas) {
			if (p.getCiudad().equals(ciudad)) {

				if (p instanceof Socorrista) {
					
					Socorrista s = (Socorrista) p;

					if (s.getExperiencia()>=experiencia) {
						lista.add(s);
					}
				}
			}

		}
		return lista;
	}

}
