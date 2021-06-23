/**
 * Publicaciones.java
 */
package model;

import java.io.Serializable;
import java.time.LocalDate;

import model.prestable.Prestar;

/**
 * @author Usoa Larrarte
 *
 * @Date 10 jun. 2021
 */
public class Publicacion extends Ejemplar implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String nombre;
	private LocalDate fechaPublicacion;
	
	
	/**
	 * Class constructor
	 */
	public Publicacion() {
		super();
	}
	
	
	/**
	 * Class constructor
	 * @param nombre
	 * @param fechaPublicacion
	 */
	public Publicacion(String nombre, LocalDate fechaPublicacion) {
		super();
		this.nombre = nombre;
		this.fechaPublicacion = fechaPublicacion;
	}


	/**
	 * Getter method for nombre 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Setter method for nombre
	 * @param nombre to set nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Getter method for fechaPublicacion 
	 * @return fechaPublicacion
	 */
	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}
	/**
	 * Setter method for fechaPublicacion
	 * @param fechaPublicacion to set fechaPublicacion
	 */
	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	

	@Override
	public String toString() {
		return " nombre=" + nombre + ", fechaPublicacion=" + fechaPublicacion ;
	}

}
