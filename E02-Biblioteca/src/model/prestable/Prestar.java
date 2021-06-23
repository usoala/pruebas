/**
 * Prestar.java
 */
package model.prestable;
import utilities.Questions;


/**
 * @author Usoa Larrarte
 *
 * @Date 13 jun. 2021
 */

public class Prestar implements Prestable {
	
	private boolean prestado = false;


	/**
	 * Getter method for prestado 
	 * @return prestado
	 */
	public boolean isPrestado() {
		return prestado;
	}

	/**
	 * Setter method for prestado
	 * @param prestado to set prestado
	 */
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}




	@Override
	public <T> void  prestarDevolver() {
		boolean accion = Questions.questionAB("Escoja una opción (1/2) \n 1 - Prestar \n 2 - Devolver", 1, 2);
		
			if (this.isPrestado() != accion) {
				this.prestado = accion;
			} else if (accion) {
				System.out.println("Este ejemplar ya está prestado, no se puede volver a prestar");
			} else {
				System.out.println("Este ejemplar no está prestado, no se puede devolver");
			}
		}	
	}
	

