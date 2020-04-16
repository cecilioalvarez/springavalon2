package es.avalon.spring3;

import org.springframework.stereotype.Repository;

import es.avalon.dominio.Libro;

@Repository
public class LibroRepositoryJPA {
	
	public Libro buscarUno() {
		return new Libro("1A","java","cecilio",100);
	}

}
