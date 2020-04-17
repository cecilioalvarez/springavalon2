package es.avalon.spring;

public class ProxyImpresora implements imprimible {
	
	private static int contador=0;
	private ImpresoraLaser impresora= new ImpresoraLaser();

	public void imprimir(String texto) {
		contador ++;
		System.out.println(contador);
		impresora.imprimir(texto);

	}

}
