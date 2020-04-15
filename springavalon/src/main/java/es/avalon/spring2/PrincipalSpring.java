package es.avalon.spring2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrincipalSpring {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext factoria= new AnnotationConfigApplicationContext();
		
		// hacia un scan y revisaba el package de es.avalon.spring2
		factoria.register(SpringConfigurador.class);
		factoria.refresh();
		
		ServicioA miservicio=factoria.getBean(ServicioA.class);
		
		System.out.println(miservicio.mensaje());

	}

}
