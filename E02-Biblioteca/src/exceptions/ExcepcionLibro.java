/**
 * ExcepcionLibro.java
 */
package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Usoa Larrarte
 *
 * @Date 13 jun. 2021
 */
public class ExcepcionLibro extends Exception {
	
	private static final long serialVersionUID = 1L;

	private Level level;

	/**
	 * Constructor vacío de clase ExcepcionLibro
	 */
	public ExcepcionLibro() {
	}

	/**
	 * Constructor de clase ExcepcionLibro que pide un parámetro de tipo mensaje
	 * 
	 * @param message    mensaje que emitirá la aplicación 
	 */
	public ExcepcionLibro(String message) {
		super(message);
	}

	/**
	 * Constructor de clase ExcepcionLibro que pide un parámetro de causa
	 * 
	 * @param cause    emite la causa por la que se produce el error 
	 */
	public ExcepcionLibro(Throwable cause) {
		super(cause);
	}

	/**
	 * Constructor de clase ExcepcionLibro que pide un parámetro de mensaje y de causa
	 * 
	 * @param message   
	 * @param cause     
	 */
	public ExcepcionLibro(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * Constructor de clase ExcepcionLibro que pide un parámetro de mensaje y otro de tipo número
	 * 
	 * @param message   
	 * @param tipo  define el grado de error que se produce     
	 */
	// 1: ERROR
	// 2: WARNING
	// 3: INFO
	public ExcepcionLibro(String message, int tipo) {
		super(message);
		setLevel(tipo);
	}	

	/**
	 * Escoje el nivel de importancia del error que se produce en la aplicación (severo, alerta, informativo)
	 *   
	 * @param tipo       
	 */
	public void setLevel(int tipo) {

		switch (tipo) {
		case 1:
			level = Level.SEVERE;
			break;
		case 2:
			level = Level.WARNING;
			break;
		case 3:
			level = Level.INFO;
			break;
		default:
			level = Level.INFO;
			break;
		}
	}

	
	@Override
	public String toString() {
		Logger.getLogger(ExcepcionLibro.class.getName()).log(level, null, super.getMessage());
		return super.getMessage();
	}


}
