package es.avalon.spring2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext factoria= new AnnotationConfigApplicationContext();

factoria.register(SpringConfigurador.class);
factoria.refresh();
ServicioA miservicio= factoria.getBean(ServicioA.class);
ServicioB unservicio= factoria.getBean(ServicioB.class);
System.out.println(miservicio.mensaje());
System.out.println(unservicio.mensaje());

	}

}
