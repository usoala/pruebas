/**
 * CatalogoLibros.java
 */
package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

import exceptions.ExcepcionLibro;
import model.Libro;
import model.adicionales.Autor;

/**
 * @author Usoa Larrarte
 *
 * @Date 10 jun. 2021
 */
public class CatalogoLibros implements ICatalogo<Integer, Libro> {

	private Map<Integer, Libro> catalogoLibros;

	/**
	 * Class constructor
	 */
	public CatalogoLibros() {
		this.catalogoLibros = new HashMap<>();
	}

	/**
	 * Getter method for catalogoLibros
	 * 
	 * @return catalogoLibros
	 */
	public Map<Integer, Libro> getCatalogoLibros() {
		return catalogoLibros;
	}

	/**
	 * Setter method for catalogoLibros
	 * 
	 * @param catalogoLibros to set catalogoLibros
	 */
	public void setCatalogoLibros(Map<Integer, Libro> catalogoLibros) {
		this.catalogoLibros = catalogoLibros;
	}

	// METODOS//

	@Override
	public Libro accederElemento(Integer id) {
		return catalogoLibros.get(id);
	}

	@Override
	public void listarElementos() {
		System.out.println("-- LISTADO DE LIBROS --");
		catalogoLibros.forEach((k, v) -> System.out.println("[" + k + "]: " + v));
	}

	@Override
	public void altaElemento(Integer id, Libro t) throws ExcepcionLibro {
		if (catalogoLibros.containsKey(id)) {
			 throw new ExcepcionLibro("No se puede guardar el libro. El código esta repetido.", 3);
		} else {
			catalogoLibros.put(id, t);
		}

	}

	@Override
	public boolean existeId(Integer id) {
		return catalogoLibros.containsKey(id);
	}

	@Override
	public void bajaElemento(Integer id) {
		catalogoLibros.remove(id);

	}

	@Override
	public void modificarElmento(Integer id, Libro t) throws ExcepcionLibro {
		if (this.existeId(id)) {
			catalogoLibros.put(id, t);
			System.out.println("Modificado correctamente");
		} else {
			 throw new ExcepcionLibro("No existe ningún usuario con ese código. Intente darse de alta como nuevo usuario",3);
		}

	}

	@Override
	public void serializarLista(String fichero) throws ExcepcionLibro {
		try {
			FileOutputStream f = new FileOutputStream(fichero);
			try (ObjectOutputStream s = new ObjectOutputStream(f)) {
				s.writeObject(catalogoLibros);
			}
		} catch (IOException e) {
			e.printStackTrace();
			 throw new ExcepcionLibro("No se ha podido guardar la información en el fichero correspondiente", 1);
		}

	}

	@Override
	public void deSerializarLista(String fichero) throws ExcepcionLibro {
		System.out.println("-- Cargando datos --");
		try {
			File fich = new File(fichero);
			FileInputStream f = new FileInputStream(fich);
			try (ObjectInputStream s = new ObjectInputStream(f)) {
				catalogoLibros = (Map<Integer, Libro>) s.readObject();
			}
		} catch (IOException e) {
			e.printStackTrace();
			throw new ExcepcionLibro("No se ha podido cargar la información desde el fichero correspondiente", 1);
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(CatalogoLibros.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	@Override
	public void crearElementosPruebas() {
		catalogoLibros.put(siguienteId(), new Libro("Libro1", LocalDate.of(2021, 01, 01), 1, "253-958-12531-2-1", new Autor("Autor", "1")));
		catalogoLibros.put(siguienteId(), new Libro("Libro2", LocalDate.of(2020, 01, 01), 2, "253-958-12531-2-2", new Autor("Autor", "2")));
		catalogoLibros.put(siguienteId(), new Libro("Libro3", LocalDate.of(2019, 01, 01), 3, "253-958-12531-2-3", new Autor("Autor", "3")));
		catalogoLibros.put(siguienteId(), new Libro("Libro4", LocalDate.of(2018, 01, 01), 4, "253-958-12531-2-4", new Autor("Autor", "4")));
		catalogoLibros.put(siguienteId2(), new Libro("Libro5", LocalDate.of(2017, 01, 01), 5, "253-958-12531-2-5", new Autor("Autor", "5")));

	}

	@Override
	public void listarElementosPrestados() {
		System.out.println("-- LISTADO DE LIBROS PRESTADOS --");
		for (Map.Entry<Integer, Libro> entry : catalogoLibros.entrySet()) {
			if (entry.getValue().getPrestable().isPrestado() == true) {
				System.out.println("[" + entry.getKey() + "]: " + entry.getValue());
			}
		}

	}

	@Override
	public void listarElementosNoPrestados() {
		System.out.println("-- LISTADO DE LIBROS DISPONIBLES --");
		catalogoLibros.entrySet().stream().filter(e -> e.getValue().getPrestable().isPrestado() == false)
				.forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
	}

	@Override
	public void listarElementosFechaPublicacionAnterior(LocalDate fecha) {
		System.out.println("-- LISTADO DE LIBROS PUBLICADOS ANTES DEL " + fecha + " --");
		catalogoLibros.entrySet().stream().filter(e -> e.getValue().getFechaPublicacion().isAfter(fecha))
				.forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
	}

	@Override
	public Integer siguienteId() {
		Integer maxId = 0;
		for (Map.Entry<Integer, Libro> entry : catalogoLibros.entrySet()) {
			if (entry.getKey().intValue() > maxId.intValue()) {
				maxId = entry.getKey();
			}
		}
		return maxId+1;
	}

	public Integer siguienteId2() {
		Integer maxId = catalogoLibros.entrySet().stream()
		.max((a,b) -> Integer.compare(a.getKey(), b.getKey()))
		.map(e-> e.getKey())
		.get();
		return maxId+1;
	}

}
