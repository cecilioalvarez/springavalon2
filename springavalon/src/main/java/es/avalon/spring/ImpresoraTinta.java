package es.avalon.spring;

public class ImpresoraTinta implements Imprimible {

	public void imprimir(String texto) {

		System.out.println("La impresora Tinta imprime 5 paginas minuto" + texto);
		
	}
}
