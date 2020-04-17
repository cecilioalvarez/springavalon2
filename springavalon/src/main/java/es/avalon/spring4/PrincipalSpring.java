package es.avalon.spring4;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import es.avalon.dominio.Categoria;
import es.avalon.dominio.Libro;
import es.avalon.repositorios.LibroRepository;

public class PrincipalSpring {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext factoria= new AnnotationConfigApplicationContext();	
		factoria.register(SpringConfigurador.class);
		factoria.refresh();
		
		ServicioLibros servicio=factoria.getBean(ServicioLibros.class);
		/*
		List<Libro> lista=servicio.buscarLibroTodos();
		
		for (Libro libro:lista) {
			
			System.out.println(libro.getTitulo());
		}
		*/
		Libro libro=new Libro("1111","nuevo","pepe",20);
		Categoria c=servicio.buscarCategoriaPorNombre("web");
		libro.setCategoria(c);
		servicio.insertarLibro(libro);
			

	}

}
