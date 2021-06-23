/**
 * Revista.java
 */
package model;

import java.time.LocalDate;

import model.adicionales.Periodicidad;

/**
 * @author Usoa Larrarte
 *
 * @Date 10 jun. 2021
 */
public class Revista extends Publicacion{
	
	private int numero;
	private Periodicidad periodicidad;
		
	/**
	 * Class constructor
	 */
	public Revista() {
	}


	/**
	 * Class constructor
	 * @param nombre
	 * @param fechaPublicacion
	 * @param numero
	 * @param periodicidad
	 */
	public Revista(String nombre, LocalDate fechaPublicacion,int numero, Periodicidad periodicidad) {
		super(nombre, fechaPublicacion);
		this.numero = numero;
		this.periodicidad = periodicidad;
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
	 * Getter method for periodicidad 
	 * @return periodicidad
	 */
	public Periodicidad getPeriodicidad() {
		return periodicidad;
	}


	/**
	 * Setter method for periodicidad
	 * @param periodicidad to set periodicidad
	 */
	public void setPeriodicidad(Periodicidad periodicidad) {
		this.periodicidad = periodicidad;
	}

	@Override
	public String toString() {
		return "Revista [numero=" + numero + ", periodicidad=" + periodicidad + super.toString()
				+ "]";
	}


}
