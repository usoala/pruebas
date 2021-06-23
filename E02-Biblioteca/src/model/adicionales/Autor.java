/**
 * Autor.java
 */
package model.adicionales;

import java.io.Serializable;

/**
 * @author Usoa Larrarte
 *
 * @Date 10 jun. 2021
 */
public class Autor implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String Nombre;
	private String Apellidos;
	/**
	 * Class constructor
	 */
	public Autor() {
	}
	/**
	 * Class constructor
	 * @param nombre
	 * @param apellidos
	 */
	public Autor(String nombre, String apellidos) {
		Nombre = nombre;
		Apellidos = apellidos;
	}
	/**
	 * Getter method for nombre 
	 * @return nombre
	 */
	public String getNombre() {
		return Nombre;
	}
	/**
	 * Setter method for nombre
	 * @param nombre to set nombre
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	/**
	 * Getter method for apellidos 
	 * @return apellidos
	 */
	public String getApellidos() {
		return Apellidos;
	}
	/**
	 * Setter method for apellidos
	 * @param apellidos to set apellidos
	 */
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	@Override
	public String toString() {
		return "Autor [Nombre=" + Nombre + ", Apellidos=" + Apellidos + "]";
	}
	
	

}
