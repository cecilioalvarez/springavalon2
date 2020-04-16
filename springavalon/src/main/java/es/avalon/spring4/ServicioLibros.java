package es.avalon.spring4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.avalon.dominio.Categoria;
import es.avalon.dominio.Libro;
import es.avalon.repositorios.CategoriaRepository;
import es.avalon.repositorios.LibroRepository;
import es.avalon.repositorios.jpa.CategoriaRepositoryJPA;
import es.avalon.repositorios.jpa.LibroRepositoryJPA;
@Service
public class ServicioLibros {

	@Autowired
	private LibroRepository repositorioLibro;
	@Autowired
	private CategoriaRepository repositorioCategoria;
	
	
	public Categoria buscarCategoriaPorNombre(String nombre) {
		return repositorioCategoria.buscarPorNombre(nombre);
	}
	public List<Libro> buscarLibrosTodos() {
		return repositorioLibro.buscarTodos();
	}
	public Libro buscarLibrosPorISBN(String isbn) {
		return repositorioLibro.buscarPorISBN(isbn);
	}
	public Libro buscarLibrosPorTitulo(String titulo) {
		return repositorioLibro.buscarPorTitulo(titulo);
	}
	public List<Libro> OrdenarLibrosPorTitulo() {
		return repositorioLibro.buscarTodosOrdenadosPorTitulo();
	}

	public List<Libro> OrdenarLibrosPorAutor() {
		return repositorioLibro.buscarTodosOrdenadosPorAutor();
	}
	public void insertarLibros(Libro libro) {
		repositorioLibro.insertar(libro);
	}
	public void salvarLibros(Libro libro) {
		repositorioLibro.salvar(libro);
	}
	public void borrarLibros(Libro libro) {
		repositorioLibro.borrar(libro);
	}

}
