package es.avalon.socorristas;

public class Policia  extends Persona implements Socorrista{

	
	
	public Policia(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public int getExperiencia() {
		// TODO Auto-generated method stub
		return 4;
	}

	public String getEspecialidad() {
		// TODO Auto-generated method stub
		return "piscinas";
	}

}
