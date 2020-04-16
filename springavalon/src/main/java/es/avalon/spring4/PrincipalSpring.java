package es.avalon.spring4;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.avalon.dominio.Libro;
import es.avalon.repositorios.LibroRepository;

public class PrincipalSpring {

	public static void main(String[] args) {
		
		// vale creo un objeto  factoria que es el que va a ser una configuracion de las anotaciones
		// que son lo que tengo con el signo de @ y luego el ApplicationContext  es el contecto de las
		// clase que tengo yo
		AnnotationConfigApplicationContext factoria=new AnnotationConfigApplicationContext();
		
		factoria.register(SpringConfigurador.class);
		factoria.refresh();
		
		ServicioLibros servicio=factoria.getBean(ServicioLibros.class);
		
		List<Libro> lista=servicio.buscarLibrosTodos();
		
		for(Libro libro:lista) {
			System.out.println(libro.getTitulo());
		}
	}

}
