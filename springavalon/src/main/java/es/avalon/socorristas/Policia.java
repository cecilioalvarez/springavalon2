package es.avalon.socorristas;

public class Policia extends Persona implements Socorrista {

	public Policia(String nombre) {
		super(nombre);
	}

	public int getExperiencia() {
		return 4;
	}

	public String getEspecialidad() {
		return "piscinas";
	}

}
