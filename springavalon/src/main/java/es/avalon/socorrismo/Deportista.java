package es.avalon.socorrismo;

public class Deportista extends Persona implements Socorrista {
	
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

	public Deportista(String nombre) {
		super(nombre);
		
	}
}
