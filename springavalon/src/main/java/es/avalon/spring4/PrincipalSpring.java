package es.avalon.spring4;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.avalon.dominio.Categoria;
import es.avalon.dominio.Libro;
import es.avalon.repositorios.LibroRepository;
import es.avalon.spring4.ServicioLibros;

public class PrincipalSpring {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext factoria = new AnnotationConfigApplicationContext();
		
		factoria.register(SpringConfigurador.class);
		factoria.refresh();
		
		ServicioLibros servicio = factoria.getBean(ServicioLibros.class);
		
		Libro libro = new Libro("1111", "nuevo", "pepe", 20);
		Categoria c = servicio.buscarCategoriaPorNombre("web");
		libro.setCategoria(c);
		servicio.insertarLibro(libro);
		
//		List<Libro> lista = servicio.buscarLibrosTodos();
//		
//		for (Libro libro: lista) {
//			
//			System.out.println(libro.getTitulo());
//			
//		}
//		Libro libro = servicio.buscarLibrosPorISBN("1AB");
//		
//		servicio.borrarLibro(libro);


	}

}
