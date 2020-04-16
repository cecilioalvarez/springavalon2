package es.avalon.spring3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioLibros {
	@Autowired
	private LibroRepositoryJPA repositorio;
	
	public Libro buscarLibroPorIsbn() {
		return repositorio.buscarUno();
	}

}
