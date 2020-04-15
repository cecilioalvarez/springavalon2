package es.avalon.springsocorrista;

import java.util.List;

public class Principal {
	public static void main(String[] args) {
		
		Informatico p1= new Informatico ("Pablo");
		p1.setEdad(25);
		p1.setCiudad("Santander");
		
		
		Deportista p2= new Deportista ("Juan");
		p2.setEdad(20);
		p2.setCiudad("laredo");
		p2.setExperiencia(2);
		
		Deportista p3= new Deportista ("Ana");
		p3.setEdad(21);
		p3.setCiudad("Castro");
		p3.setExperiencia(1);
		
		Persona p4= new Informatico ("Gema");
		p1.setEdad(24);
		p4.setCiudad("Noja");
		
		
		CruzRoja CR= new CruzRoja();
		CR.addPersona(p1);
		CR.addPersona(p2);
		CR.addPersona(p3);
		CR.addPersona(p4);
//		for(Deportista mideportista: CR.getDeportistas()) {
//			System.out.println(mideportista.getNombre());
//		}
//		Persona p =CR.getSocorrista("Castro", 1);
//		
//		System.out.println(p.getNombre());
//		
		List <CursoSocorrismo> lista = CR.getSocorrista("Castro",1);
		for (CursoSocorrismo socorrista: lista) {
			System.out.println(socorrista.getNombre());
		}
}
}