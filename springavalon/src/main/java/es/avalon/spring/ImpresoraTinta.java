package es.avalon.spring;

public class ImpresoraTinta implements Imprimible{
public void imprimir (String texto) {
	System.out.println("la impresora tinta imprime 5 pág/ min " + texto);

}
}
