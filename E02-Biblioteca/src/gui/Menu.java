/**
 * Menu.java
 */
package gui;

/**
 * @author Usoa Larrarte
 *
 * @Date 10 jun. 2021
 */
public class Menu {
	
    public static void mostrarMenuPrincipal() {

        System.out.println(" ");
        System.out.println(" BIBLIOTECA ");
        System.out.println(" ");
        System.out.println("************************************************");
        System.out.println("* Saludos. Por favor, escoja una opcion: ");
        System.out.println("*    1.-Ver listado completo publicaciones y multimedia ");
        System.out.println("*    2.-Ver listado de elemnetos prestrados");
        System.out.println("*    3.-Ver listado de elemnetos disponibles");
        System.out.println("*    4.-Acceder a Catalogo Libros");
        System.out.println("*    5.-Cargar datos BBDD");        
        System.out.println("*    6.-Cargar datos prueba");
        System.out.println("*    0.-Terminar sesion");
        System.out.println("************************************************");
        System.out.println(" ");
        System.out.print(">> ");

    }
    
    public static void mostrarMenuLibros() {

    	System.out.println(" ");
		System.out.println(" LIBROS ");
		System.out.println(" ");
		System.out.println("************************************************");
		System.out.println("*  Por favor, escoja una opcion: ");
		System.out.println("*    1.-Listar libros");
		System.out.println("*    2.-Dar de alta un libro");
		System.out.println("*    3.-Dar de baja un libro");
		System.out.println("*    4.-Modificar datos de un libro");	
		System.out.println("*    5.-Cargar los datos de BBDD");
		System.out.println("*    6.-Cargar los datos de prueba");
		System.out.println("*    0.-Volver a menú principal");
		System.out.println("************************************************");
		System.out.println(" ");
		System.out.print(">> ");


    }


}
