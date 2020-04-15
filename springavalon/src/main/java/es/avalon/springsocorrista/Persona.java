package es.avalon.springsocorrista;

public abstract class Persona {
	private String nombre;
	private int edad;
	private String ciudad;
	//private String trabajo;
	
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	public Persona() {
		super();
	}
	
}
