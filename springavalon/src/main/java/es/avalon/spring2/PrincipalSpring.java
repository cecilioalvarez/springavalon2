package es.avalon.spring2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrincipalSpring {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext factoria = new AnnotationConfigApplicationContext();
		factoria.register(SpringConfigurador.class);
		factoria.refresh();
		ServicioA miServicio = factoria.getBean(ServicioA.class);
		System.out.println(miServicio.mensaje());
		ServicioB miServicioB = factoria.getBean(ServicioB.class);
		System.out.println(miServicioB.mensaje());

	}
}
