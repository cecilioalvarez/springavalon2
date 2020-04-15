package es.avalon.spring;

public class ImpresoraLaser implements Imprimible {

	public void imprimir(String texto) {
		
		System.out.println("La impresora Laser imprime 10 paginas minuto" + texto);
		
	}
}
