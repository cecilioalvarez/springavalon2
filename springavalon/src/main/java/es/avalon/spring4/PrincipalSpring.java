package es.avalon.spring4;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.avalon.dominio.Libro;
import es.avalon.repositorios.LibroRepository;
import es.avalon.repositorios.jpa.LibroRepositoryJPA;

public class PrincipalSpring {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext factoria = new AnnotationConfigApplicationContext();
		factoria.register(SpringConfigurador.class);
		factoria.refresh();
		LibroRepository repo = factoria.getBean(LibroRepository.class);
		List<Libro> lista = repo.buscarTodos();

		for (Libro libro : lista) {

			System.out.println(libro.getTitulo());
		}
	}

}
