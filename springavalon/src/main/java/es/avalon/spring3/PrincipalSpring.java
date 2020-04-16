package es.avalon.spring3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.avalon.dominio.Libro;


public class PrincipalSpring {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext factoria = new AnnotationConfigApplicationContext();

		factoria.register(SpringConfigurador.class);
		factoria.refresh();

LibroRepositoryJPA mirepositorio= factoria.getBean(LibroRepositoryJPA.class);
Libro libro = mirepositorio.buscarUno();
System.out.println(libro.getIsbn());
System.out.println(libro.getTitulo());
System.out.println(libro.getAutor());
System.out.println(libro.getPrecio());

		ServiciosLibros mirepositorio2 = factoria.getBean(ServiciosLibros.class);
		Libro libro2 = mirepositorio2.buscarLibroPorISBN();
		System.out.println(libro2.getIsbn());
		System.out.println(libro2.getTitulo());
		System.out.println(libro2.getAutor());
		System.out.println(libro2.getPrecio());
	}
}
