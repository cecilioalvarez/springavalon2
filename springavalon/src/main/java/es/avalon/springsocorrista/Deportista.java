package es.avalon.springsocorrista;

public class Deportista extends Persona implements CursoSocorrismo{

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


	public Deportista (String nombre) {
		
		super(nombre);
	}
	
}
