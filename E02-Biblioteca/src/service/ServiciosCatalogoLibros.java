/**
 * ServiciosCatalogosImpl.java
 */
package service;

import java.time.LocalDate;

import dao.CatalogoLibros;
import dao.ICatalogo;
import exceptions.ExcepcionLibro;
import model.Libro;
import utilities.Teclado;

/**
 * @author Usoa Larrarte
 *
 * @Date 10 jun. 2021
 */
public class ServiciosCatalogoLibros implements IServiciosCatalogos<Integer, Libro> {
	
	private ICatalogo<Integer, Libro> catalogoLibros = new CatalogoLibros();

	/**
	 * Getter method for catalogoLibros 
	 * @return catalogoLibros
	 */
	public ICatalogo getCatalogoLibros() {
		return catalogoLibros;
	}

	/**
	 * Setter method for catalogoLibros
	 * @param catalogoLibros to set catalogoLibros
	 */
	public void setCatalogoLibros(ICatalogo catalogoLibros) {
		this.catalogoLibros = catalogoLibros;
	}
	
	
	//METODOS//

	@Override
	public Libro accederElemento() {
		catalogoLibros.accederElemento(Teclado.tecladoInt("Introduzca la id del libro"));
		return null;
	}

	@Override
	public void listarElementos() {
		catalogoLibros.listarElementos();
	}

	@Override
	public void altaElemento() throws Exception {
		Integer id = catalogoLibros.siguienteId();
		Libro libro = new Libro();
		libro.crearLibro();
		catalogoLibros.altaElemento(id, libro);
	}
	

	@Override
	public void bajaElemento() {
		catalogoLibros.bajaElemento(Teclado.tecladoInt("Introduzca el id del libro a eliminar"));
	}

	@Override
	public void modificarElmento() throws Exception {
		Integer id = Teclado.tecladoInt("Introduzca el id del libro a modificar");
		Libro libro = new Libro();
		libro.crearLibro();
		catalogoLibros.modificarElmento(id, libro);	
	}

	@Override
	public void serializarLista() throws Exception {
		catalogoLibros.serializarLista("catalogoLibros.dat");		
	}

	@Override
	public void deSerializarLista() throws Exception {
		catalogoLibros.deSerializarLista("catalogoLibros.dat");		
	}

	@Override
	public void crearElementosPruebas() {
		catalogoLibros.crearElementosPruebas();		
	}

	@Override
	public void listarElementosPrestados() {
		catalogoLibros.listarElementosPrestados();
	}

	@Override
	public void listarElementosNoPrestados() {
		catalogoLibros.listarElementosNoPrestados();
	}

	@Override
	public void listarElementosFechaPublicacionAnterior() {
		System.out.println("Indica un fecha");
		LocalDate fecha = LocalDate.of(Teclado.tecladoInt("Introduzca el año de publicación"),
				Teclado.tecladoInt("Introduzca el mes de publicación"), Teclado.tecladoInt("Introduzca el día de publicación"));
		catalogoLibros.listarElementosFechaPublicacionAnterior(fecha);
	}

}
