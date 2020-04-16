package es.avalon.spring3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.avalon.dominio.Libro;

public class PrincipalSpring {

	public static void main(String[] args) {
		
		// vale creo un objeto  factoria que es el que
		AnnotationConfigApplicationContext factoria=new AnnotationConfigApplicationContext();
		
		factoria.register(SpringConfigurador.class);
		factoria.refresh();
		
		LibroRepositoryJPA mirepositorio=factoria.getBean(LibroRepositoryJPA.class);
		
		Libro libro=mirepositorio.buscarUno();
		
		System.out.println(libro.getIsbn());
		System.out.println(libro.getTitulo());
		System.out.println(libro.getPrecio());
		System.out.println(libro.getAutor());
	}

}
