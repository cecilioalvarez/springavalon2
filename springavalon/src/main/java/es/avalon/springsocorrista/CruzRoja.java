package es.avalon.springsocorrista;

import java.util.ArrayList;
import java.util.List;

public class CruzRoja {

	private List<Persona> gente= new ArrayList <Persona>();
	
	public void addPersona(Persona persona) {
		gente.add(persona);	
		
	}
	
	public List<Deportista> getDeportistas() {
		
		List <Deportista> lista= new ArrayList <Deportista>();
		
		for (Persona p:gente) {
			
			if (p instanceof Deportista) {
				lista.add((Deportista)p);	
			}
		}
		
		return lista;
		
	}
	
	//factoria : metooo que recibe parametros,y da oobjetos con esos parametros. MaS versatilidad, puede traer varios tipos 
	//metosos para construcir objetos, interactua con todo
	
	public List<CursoSocorrismo> getSocorrista(String ciudad, int experiencia) {
		List <CursoSocorrismo> lista= new ArrayList <CursoSocorrismo>();
		
		for (Persona p: gente) {
			if (p.getCiudad().equals(ciudad)) {
				
			
			if (p instanceof CursoSocorrismo) {
				
				CursoSocorrismo s= (CursoSocorrismo) p;
				
				if(s.getExperiencia()>=experiencia) {
					lista.add(s);
				}
			}
		}
		}
		return lista;
	}


}
