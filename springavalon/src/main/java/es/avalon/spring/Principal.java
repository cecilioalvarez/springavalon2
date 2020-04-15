package es.avalon.spring;

public class Principal {

	public static void main(String[] args) {
		Imprimible i1 =FactoriaImpresoras.getImpresora("tinta");
		i1.imprimir("hola");

		Imprimible i2 =FactoriaImpresoras.getImpresora("laser");
		i2.imprimir("hola");
	}

}
