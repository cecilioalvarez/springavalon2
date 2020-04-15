package es.avalon.socorrismo;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		Ingeniero i=new Ingeniero("Pepe");
		i.setCiudad("Santander");
		
		Deportista d=new Deportista("Ana");
		d.setCiudad("Laredo");
		d.setExperiencia(2);
		
		Deportista d2=new Deportista("Miguel");
		d2.setCiudad("Santander");
		d2.setExperiencia(2);
		
		Deportista d3=new Deportista("Gema");
		d3.setCiudad("Catro");
		d3.setExperiencia(2);
		
		Deportista d4=new Deportista("Antonio");
		d4.setCiudad("Santander");
		d4.setExperiencia(3);
		
		Policia p=new Policia("Blanca");
		p.setCiudad("Santander");
		
		
		CruzRoja cruz=new CruzRoja();
		
		cruz.addPersona(i);
		cruz.addPersona(d);
		cruz.addPersona(d2);
		cruz.addPersona(d3);
		cruz.addPersona(d4);
		cruz.addPersona(p);
		
		/*
		for (Deportista mideportista: cruz.getDeportistas()) {
			
			System.out.println(mideportista.getNombre());
			
		}
		*/
		
		List<Socorrista> lista=cruz.getSocorrista("Santander",1);
		
		for (Socorrista socorrista:lista) {
			
			System.out.println(socorrista.getNombre());
			
			
		}

	}

}
