package es.avalon.socorristas;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		Ingeniero i= new Ingeniero("pepe");
		i.setCiudad("santander");
		
		Deportista d= new Deportista("ana");
		d.setCiudad("laredo");
		d.setExperiencia(2);
		
		
		Deportista d2= new Deportista("miguel");
		d2.setCiudad("santander");
		d2.setExperiencia(2);
		
		
		Deportista d3= new Deportista("gema");
		d3.setCiudad("castro");
		
		Deportista d4= new Deportista("antonio");
		d4.setCiudad("santander");
		d4.setExperiencia(4);
		CruzRoja cruz= new CruzRoja();
		
		Policia p= new Policia("blanca");
		p.setCiudad("santander");
		
		
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
		
		imprimirSocorristas(cruz);
		
	}

	private static void imprimirSocorristas(CruzRoja cruz) {
		
		//directamente no creo el objeto
		List<Socorrista> lista= cruz.getSocorrista("santander", 1);
		
		for (Socorrista socorrista:lista ) {
			
			System.out.println(socorrista.getNombre());
		}
	}

}
