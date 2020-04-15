package es.avalon.socorrista;

public class Policia extends Persona implements Socorrista{

	public Policia(String nombre, String ciudad) {
		super(nombre, ciudad);
		// TODO Auto-generated constructor stub
	}

	public int getExperiencia() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getEspecialidad() {
		// TODO Auto-generated method stub
		return "piscina";
	}

}
