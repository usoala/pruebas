/**
 * Biblioteca.java
 */
package control;

import gui.Menu;
import model.Libro;
import utilities.Questions;
import utilities.Teclado;
import service.IServiciosCatalogos;
import service.ServiciosCatalogoLibros;

/**
 * @author Usoa Larrarte
 *
 * @Date 10 jun. 2021
 */
public class Biblioteca {

	private static IServiciosCatalogos<Integer, Libro> serviciosLibros = new ServiciosCatalogoLibros();

	public static void iniciarBiblioteca() {
		gestionMenuPrincipal();
	}

	public static void gestionMenuPrincipal() {
		boolean seguir = true;

		do {
			Menu.mostrarMenuPrincipal();
			seguir = escogerOpcion();
		} while (seguir);
	}

	public static void gestionMenuLibros() {
		boolean seguir = true;

		do {
			Menu.mostrarMenuLibros();
			seguir = escogerOpcionLibros();
		} while (seguir);
	}

	private static boolean escogerOpcion() {

		boolean seguir = true;

		try {
			switch (Teclado.tecladoInt()) {
			case 1:
				serviciosLibros.listarElementos();
				break;
			case 2:
				serviciosLibros.listarElementosPrestados();
				break;
			case 3:
				serviciosLibros.listarElementosNoPrestados();
				break;
			case 4:
				gestionMenuLibros();
				seguir = false;
				break;
			case 5:
				serviciosLibros.deSerializarLista();
				break;
			case 6:
				serviciosLibros.crearElementosPruebas();
				break;
			case 0:
				// SALIR
				// si usuario introduce una palabra que empieza por S, question devuelve true
				// y como el usuario quiere salir, al negarlo, seguir = false
				// entonces este metodo devuelve false
				// seguir = this.escogerOpcion() = false y se sale del primer dowhile
				seguir = !(Questions.questionSN("¿Está seguro?(S/N)"));
				break;

			}
		} catch (Exception e) {
			System.out.println("error: " + e.toString());
		}
		return seguir;
	}

	private static boolean escogerOpcionLibros() {
		boolean seguir = true;

		try {
			switch (Teclado.tecladoInt()) {
			case 1:
				serviciosLibros.listarElementos();
				break;
			case 2:
				serviciosLibros.altaElemento();
				break;
			case 3:
				serviciosLibros.bajaElemento();
				break;
			case 4:
				serviciosLibros.modificarElmento();
				break;
			case 5:
				serviciosLibros.deSerializarLista();
				break;
			case 6:
				serviciosLibros.crearElementosPruebas();
				break;
			case 0:
				seguir = !(Questions.questionSN("¿Está seguro?(S/N)"));
				if (seguir == false) {
					if (Questions.questionSN("¿Desea guardar los cambios? S/N")) {
						try {
							serviciosLibros.serializarLista();
							System.out.println("Se han guardado todos los cambios de libros.");
						} catch (Exception e) {
							e.printStackTrace();
							System.out.println("Error: " + e.getMessage());
						}
					}
					gestionMenuPrincipal();
				} else {
					Menu.mostrarMenuLibros();
					seguir = escogerOpcionLibros();
				}
				break;
			}
		} catch (Exception e) {
			System.out.println("error: " + e.toString());
		}
		return seguir;
	}
}
