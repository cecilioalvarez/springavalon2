package es.avalon.spring3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrincipalSpring {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext factoria = new AnnotationConfigApplicationContext();
		
		factoria.register(SpringConfigurador.class);
		factoria.refresh();
		
		LibroRepositoryJPA mirepositorio= factoria.getBean(LibroRepositoryJPA.class);
		
		Libro libro= mirepositorio.buscarUno();
		System.out.println(libro.getIsbn());
		
		
	

	}

}
