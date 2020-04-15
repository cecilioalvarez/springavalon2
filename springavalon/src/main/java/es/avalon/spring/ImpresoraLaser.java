package es.avalon.spring;

public class ImpresoraLaser implements imprimible{
	public void imprimir(String texto) {
		System.out.println("La impresora laser imprime 10 paginas por minuto"+ texto);
	}

}
