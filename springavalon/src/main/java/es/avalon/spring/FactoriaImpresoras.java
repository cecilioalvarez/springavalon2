package es.avalon.spring;

public class FactoriaImpresoras {
	public static imprimible getImpresora(String tipo) {
		if (tipo.equals("tinta")) {
			return new ImpresoTinta();
		}else {
			return new ProxyImpresora();
		}
	}

}
