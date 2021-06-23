/**
 * Disco.java
 */
package model;

import model.adicionales.Formato;

/**
 * @author Usoa Larrarte
 *
 * @Date 10 jun. 2021
 */
public class Disco extends Multimedia{

	/**
	 * Class constructor
	 */
	public Disco() {
		super();
		
	}

	/**
	 * Class constructor
	 * @param titulo
	 * @param formato
	 * @param duracion
	 * @param prestado
	 */
	public Disco(String titulo, Formato formato, String duracion, boolean prestado) {
		super(titulo, formato, duracion, prestado);
		
	}

	@Override
	public String toString() {
		return "Disco [ " + super.toString() + "]";
	}
	
}
