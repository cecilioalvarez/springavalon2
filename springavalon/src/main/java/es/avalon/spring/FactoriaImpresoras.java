package es.avalon.spring;

public class FactoriaImpresoras {
	
	public static Imprimible getImpresora(String tipo) {
		
		if (tipo.equals("tinta")) {
			return new ImpresoraTinta();
		}else {
			return new ProxyImpresora();
		}
	}

}
