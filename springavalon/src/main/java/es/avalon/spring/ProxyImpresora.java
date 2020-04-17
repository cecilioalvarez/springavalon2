package es.avalon.spring;

public class ProxyImpresora implements Imprimible {
	
	private static int contador = 0;
	private ImpresoraLaser impresora = new ImpresoraLaser();

	@Override
	public void imprimir(String texto) {
		
		contador ++;
		System.out.println(contador);
		impresora.imprimir(texto);
		
	}

}
