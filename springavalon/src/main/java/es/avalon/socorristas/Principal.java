package es.avalon.socorristas;

import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		
		Ingeniero i = new Ingeniero("pepe");
		i.setCiudad("Santander");
		
		Deportista d = new Deportista("ana");
		d.setCiudad("Laredo");
		d.setExperiencia(2);
		
		Deportista d2 = new Deportista("miguel");
		d2.setCiudad("Santander");
		d2.setExperiencia(2);

		Deportista d3 = new Deportista("gema");
		d3.setCiudad("Santander");
		d3.setExperiencia(1);

		CruzRoja cruz = new CruzRoja();
		cruz.addPersona(i);
		cruz.addPersona(d);
		cruz.addPersona(d2);
		cruz.addPersona(d3);
		
		for (Deportista mideportista: cruz.getDeportistas()) {
			
			System.out.println(mideportista.getNombre());
			
		}
		
		System.out.println("*******");
		
		List<Socorrista> lista = cruz.getSocorrista("Santander", 2);
		
		for (Socorrista socorrista: lista) {
			System.out.println(socorrista.getNombre());
		}

	}

}
