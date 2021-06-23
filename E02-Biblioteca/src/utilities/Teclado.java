/**
 * 
 */
package utilities;

import java.util.Scanner;

/**
 * @author alumno
 *
 */
public class Teclado {
	
	
	public static String tecladoString() {
		return new Scanner(System.in).next();
	}
	
	public static String tecladoString(String mensaje) {
		System.out.println(mensaje);
		return tecladoString();
	}
	
	public static int tecladoInt() {
		return new Scanner(System.in).nextInt();
	}
	
	public static int tecladoInt(String mensaje) {
		System.out.println(mensaje);
		return tecladoInt();
	}
	
	public static double tecladoDouble() {
		return new Scanner(System.in).nextDouble();
	}
	
	public static double tecladoDouble(String mensaje) {
		System.out.println(mensaje);
		return tecladoDouble();
	}

	public static String tecladoLinea() {
		return new Scanner(System.in).nextLine();
	}
	
	public static String tecladoLinea(String mensaje) {
		System.out.println(mensaje);
		return tecladoLinea();
	}

}
