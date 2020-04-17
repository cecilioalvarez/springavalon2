package es.avalon.spring;

public class FactoriaImpresoras {
	
	//le paso un texto y me devuelve una impresora u otra
	public static Imprimible getImpresora(String tipo) {
		
		if (tipo.contentEquals("tinta")) {
			return new ImpresoraTinta();
		}
		else {
			return new ProxyImpresora();
		}
		
	}

}
