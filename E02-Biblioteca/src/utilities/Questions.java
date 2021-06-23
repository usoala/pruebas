/**
 * Questions.java
 */
package utilities;

/**
 * @author Usoa Larrarte
 *
 * @Date 13 jun. 2021
 */
public class Questions {
	
	public static boolean questionSN(String mensaje) {
		String sino = Teclado.tecladoString(mensaje);
		return (sino.toUpperCase().charAt(0) == 'S');
	}
	
	public static boolean questionAB(String mensaje, int a, int b) {
		boolean aOb = false;
		int ab = 0;
		do {
		ab = Teclado.tecladoInt(mensaje);
		if(ab == a || ab==b) {
			aOb = true;
		}
		} while(!aOb);
		if(ab==a) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean questionAB(String mensaje, String a, String b) {
		boolean aOb = false;
		String ab;
		do {
		ab = Teclado.tecladoString(mensaje);
		if(ab.equals(a) ||ab.equals(b)) {
			aOb = true;
		}
		} while(!aOb);
		if(ab.equals(a)) {
			return true;
		} else {
			return false;
		}
	}

}
