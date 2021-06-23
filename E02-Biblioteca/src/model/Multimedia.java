/**
 * Multimedia.java
 */
package model;

import java.io.Serializable;

import model.adicionales.Formato;

/**
 * @author Usoa Larrarte
 *
 * @Date 10 jun. 2021
 */
public class Multimedia extends Ejemplar implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String titulo;
	private Formato formato;
	private String duracion;
	
	
	/**
	 * Class constructor
	 */
	public Multimedia() {
	}
	
	
	/**
	 * Class constructor
	 * @param titulo
	 * @param formato
	 * @param duracion
	 * @param prestado
	 */
	public Multimedia(String titulo, Formato formato, String duracion, boolean prestado) {
		super();
		this.titulo = titulo;
		this.formato = formato;
		this.duracion = duracion;
	}


	/**
	 * Getter method for titulo 
	 * @return titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * Setter method for titulo
	 * @param titulo to set titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * Getter method for formato 
	 * @return formato
	 */
	public Formato getFormato() {
		return formato;
	}
	/**
	 * Setter method for formato
	 * @param formato to set formato
	 */
	public void setFormato(Formato formato) {
		this.formato = formato;
	}
	/**
	 * Getter method for duracion 
	 * @return duracion
	 */
	public String getDuracion() {
		return duracion;
	}
	/**
	 * Setter method for duracion
	 * @param duracion to set duracion
	 */
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}


	

	@Override
	public String toString() {
		return " titulo=" + titulo + ", formato=" + formato + ", duracion=" + duracion ;
	}

}
