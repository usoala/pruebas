/**
 * TecladoBufferReader.java
 */
package utilities;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Usoa Larrarte
 *
 * @Date 10 jun. 2021
 */
public class TecladoBufferReader {
	
	public static String recogeString() throws Exception {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String dato = teclado.readLine();
		return dato;
	}

	public static String recogeString(String msg) throws Exception {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(msg);
		String dato = teclado.readLine();
		return dato;
	}

	public static int recogeInt() throws Exception {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		int dato = Integer.parseInt(teclado.readLine());
		return dato;
	}

	public static int recogeInt(String msg) throws Exception {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(msg);
		int dato = Integer.parseInt(teclado.readLine());
		return dato;
	}

	public static double recogeDouble() throws Exception {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		double dato = Double.parseDouble(teclado.readLine());
		return dato;
	}

	public static double recogeDouble(String msg) throws Exception {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(msg);
		double dato = Double.parseDouble(teclado.readLine());
		return dato;
	}


}
