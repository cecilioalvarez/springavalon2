package es.avalon.spring3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.avalon.dominio.Libro;

@Service
public class ServiciosLibros {
@Autowired
	private LibroRepositoryJPA repositorio;
	
	public Libro buscarLibroPorISBN() {
		return repositorio.buscarUno();
	}
}
