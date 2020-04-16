package es.avalon.spring2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrincipalSpring {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext factoria = new AnnotationConfigApplicationContext();
		
		factoria.register(SpringConfigurador.class);
		factoria.refresh();
		
		ServicioA miservicio = factoria.getBean(ServicioA.class);
		ServicioB miservicioB = factoria.getBean(ServicioB.class);
		
		
		System.out.println(miservicio.mensaje());
		System.out.println(miservicioB.mensaje());

	}

}
