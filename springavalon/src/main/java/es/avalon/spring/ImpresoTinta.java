package es.avalon.spring;

public class ImpresoTinta implements imprimible {
	public void imprimir(String texto) {
		System.out.println("La impresora de tinta imprime 5 paginas por minuto"+ texto);
	}

}
