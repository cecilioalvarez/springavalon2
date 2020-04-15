package es.avalon.socorrista;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		Ingeniero i=new Ingeniero("pepe");
		i.setCiudad("Santander");
		
		Deportista d=new Deportista("ana");
		d.setCiudad("Laredo");
		d.setExperiencia(3);
		
		Deportista d2=new Deportista("pedro");
		d2.setCiudad("Santander");
		d2.setExperiencia(2);
		
		Deportista d3=new Deportista("gema");
		d3.setCiudad("Castro");
		d3.setExperiencia(1);

		FactoriaServicioDePlayas cruzroja= new FactoriaServicioDePlayas();
		cruzroja.addPersona(i);
		cruzroja.addPersona(d);
		cruzroja.addPersona(d2);
		cruzroja.addPersona(d3);
		
		
		
		//for (Deportista mideportista: cruzroja.getDeportistas()) {
		//	System.out.println(mideportista.getNombre());
		//}
		
		List<Socorrista> lista= cruzroja.getSocorrista("Santander", 2);
		for (Socorrista socorrista: lista) {
			System.out.println(socorrista.getNombre());
		}
	}

}
