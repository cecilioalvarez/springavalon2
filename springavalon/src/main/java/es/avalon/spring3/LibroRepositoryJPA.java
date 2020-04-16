package es.avalon.spring3;

import org.springframework.stereotype.Repository;

@Repository
public class LibroRepositoryJPA {
	public Libro buscarUno() {
		return new Libro("1A", "Java", "Cecilio", 100);
		
	}

}
