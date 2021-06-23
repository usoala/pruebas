/**
 * Libro.java
 */
package model;

import java.io.Serializable;
import java.time.LocalDate;

import model.adicionales.Autor;
import model.prestable.Prestar;
import utilities.Teclado;


/**
 * @author Usoa Larrarte
 *
 * @Date 10 jun. 2021
 */
public class Libro extends Publicacion implements Serializable {

	private static final long serialVersionUID = 1L;
	private int edicicion;
	private String ISBN;
	private Autor autor;

	/**
	 * Class constructor
	 */
	public Libro() {
		prestable = new Prestar();
	}

	/**
	 * Class constructor
	 * 
	 * @param nombre
	 * @param fechaPublicacion
	 * @param edicicion
	 * @param iSBN
	 * @param autor
	 */
	public Libro(String nombre, LocalDate fechaPublicacion, int edicicion, String iSBN, Autor autor) {
		super(nombre, fechaPublicacion);
		this.edicicion = edicicion;
		this.ISBN = iSBN;
		this.autor = autor;
		prestable = new Prestar();
	}

	/**
	 * Getter method for edicicion
	 * 
	 * @return edicicion
	 */
	public int getEdicicion() {
		return edicicion;
	}

	/**
	 * Setter method for edicicion
	 * 
	 * @param edicicion to set edicicion
	 */
	public void setEdicicion(int edicicion) {
		this.edicicion = edicicion;
	}

	/**
	 * Getter method for iSBN
	 * 
	 * @return iSBN
	 */
	public String getISBN() {
		return ISBN;
	}

	/**
	 * Setter method for iSBN
	 * 
	 * @param iSBN to set iSBN
	 */
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	/**
	 * Getter method for autor
	 * 
	 * @return autor
	 */
	public Autor getAutor() {
		return autor;
	}

	/**
	 * Setter method for autor
	 * 
	 * @param autor to set autor
	 */
	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [" + super.toString() + ", edicicion=" + edicicion + ", ISBN=" + ISBN + ", " + autor+  "]";
	}

	public void crearLibro() {
		setNombre(Teclado.tecladoLinea("Introduzca el nombre"));
		setFechaPublicacion(LocalDate.of(Teclado.tecladoInt("Introduzca el año de publicación"),
				Teclado.tecladoInt("Introduzca el mes de publicación"), Teclado.tecladoInt("Introduzca el día de publicación")));
		this.edicicion = Teclado.tecladoInt("Introduzca el número de edición") ;
		this.ISBN = Teclado.tecladoString("Introduce el ISBN");
		this.autor = new Autor(Teclado.tecladoLinea("Introduzca el nombre del autor"), Teclado.tecladoLinea("Introduzca los apellidos del autor"));		
	}
	
	

}
