package es.avalon.spring4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import es.avalon.dominio.Libro;

public class PrincipalSpring {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext factoria = new AnnotationConfigApplicationContext();
		factoria.register(SpringConfigurador.class);
		factoria.refresh();
		

	}
}
