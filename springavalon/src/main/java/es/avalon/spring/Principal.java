package es.avalon.spring;

public class Principal {

	public static void main(String[] args) {


		Imprimible impresoraTinta = FactoriaImpresoras.getImpresora("tinta");
		impresoraTinta.imprimir("hola");
		
		Imprimible impresoraLaser = FactoriaImpresoras.getImpresora("laser");
		impresoraLaser.imprimir("hola");
		
	}

}
