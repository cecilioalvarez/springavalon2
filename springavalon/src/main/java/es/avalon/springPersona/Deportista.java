package es.avalon.springPersona;

public class Deportista extends Persona implements Socorrista  {

	public Deportista(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	private int experiencia;
	private String especialidad;
	
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}


	
}
