/**
 * Ejemplar.java
 */
package model;

import java.io.Serializable;

import model.prestable.Prestable;

/**
 * @author Usoa Larrarte
 *
 * @Date 13 jun. 2021
 */
public class Ejemplar implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	protected Prestable prestable;
	
	/**
	 * Class constructor
	 */
	public Ejemplar() {
		super();
	}
	
	
	/**
	 * Getter method for prestable 
	 * @return prestable
	 */
	public Prestable getPrestable() {
		return prestable;
	}

	/**
	 * Setter method for prestable
	 * @param prestable to set prestable
	 */
	public void setPrestable(Prestable prestable) {
		this.prestable = prestable;
	}

	public void prestar() {
		prestable.prestarDevolver();
		
	}
	
	
}
