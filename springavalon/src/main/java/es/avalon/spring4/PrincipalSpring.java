package es.avalon.spring4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.avalon.dominio.Categoria;
import es.avalon.spring3.Libro;
import es.avalon.spring3.SpringConfigurador;

public class PrincipalSpring {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext factoria = new AnnotationConfigApplicationContext();
		
		factoria.register(SpringConfigurador.class);
		factoria.refresh();
		ServicioLibros servicio= factoria.getBean(ServicioLibros.class);
		Libro libro=new Libro("1111","nuevo","pepe",20);
		
		Categoria c= servicio.buscarCategoriaPorNombre("web");
		//libro.setCategoria(c);
		//servicio.insertarLibros(libro);
		
	

	}

}
