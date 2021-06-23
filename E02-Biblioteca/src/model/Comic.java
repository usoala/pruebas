/**
 * Comic.java
 */
package model;

import java.time.LocalDate;

/**
 * @author Usoa Larrarte
 *
 * @Date 10 jun. 2021
 */
public class Comic extends Publicacion{
	
	private int numero;
	private String coleccion;
	
	/**
	 * Class constructor
	 */
	public Comic() {
		super();
	}

	/**
	 * Class constructor
	 * @param nombre
	 * @param fechaPublicacion
	 * @param numero
	 * @param coleccion
	 */
	public Comic(String nombre, LocalDate fechaPublicacion, int numero, String coleccion) {
		super(nombre, fechaPublicacion);
		this.numero = numero;
		this.coleccion = coleccion;
	}

	/**
	 * Getter method for numero 
	 * @return numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Setter method for numero
	 * @param numero to set numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Getter method for coleccion 
	 * @return coleccion
	 */
	public String getColeccion() {
		return coleccion;
	}

	/**
	 * Setter method for coleccion
	 * @param coleccion to set coleccion
	 */
	public void setColeccion(String coleccion) {
		this.coleccion = coleccion;
	}

	@Override
	public String toString() {
		return "Comic [numero=" + numero + ", coleccion=" + coleccion + super.toString() + "]";
	}

}
