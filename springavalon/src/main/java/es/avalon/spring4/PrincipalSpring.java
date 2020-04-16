package es.avalon.spring4;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import es.avalon.dominio.Libro;
import es.avalon.repositorios.LibroRepository;

@Service
public class PrincipalSpring {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext factoria= new AnnotationConfigApplicationContext();	
		factoria.register(SpringConfigurador.class);
		factoria.refresh();
		
		ServicioLibros repo=factoria.getBean(ServicioLibros.class);
		/*
		List<Libro> lista=repo.buscarLibroTodos();
		
		for (Libro libro:lista) {
			
			System.out.println(libro.getTitulo());
		}
		*/
		servicio.insertarLibro(new Libro("1111"));
		

	}

}
