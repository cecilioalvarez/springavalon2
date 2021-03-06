package es.avalon.spring3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.avalon.dominio.Libro;

public class PrincipalSpring2 {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext factoria = new AnnotationConfigApplicationContext();
		factoria.register(SpringConfigurador.class);
		factoria.refresh();
		
		
		
		/* leer desde aqui */

		ServicioLibros mirepositorio = factoria.getBean(ServicioLibros.class);
		
		Libro libro= mirepositorio.buscarLibroPorIsbn();
		System.out.println(libro.getIsbn());
		System.out.println(libro.getTitulo());
		System.out.println(libro.getPrecio());
		System.out.println(libro.getAutor());
	

	}

}
