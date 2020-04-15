package es.avalon.spring;

public class FactoriaImpresoras {
	
	// le paso un texto y me devuelve una impresora u otra
	public static Imprimible getImpresora(String tipo) {
		
		if (tipo.equals("tinta")) {
			
			return new ImpresoraTinta();
			
		}else {
			
			return new ImpresoraLaser();
			
		}
	}
	
}
