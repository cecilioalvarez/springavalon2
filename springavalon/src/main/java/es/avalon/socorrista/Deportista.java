package es.avalon.socorrista;

public class Deportista extends Persona implements Socorrista{
	private int experiencia;
	private String especialidad;

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public Deportista(String nombre) {
		super(nombre, nombre);
		// TODO Auto-generated constructor stub
	}

	public int getExperiencia() {
		// TODO Auto-generated method stub
		return experiencia;
	}

	public String getEspecialidad() {
		// TODO Auto-generated method stub
		return especialidad;
	}

	

}
