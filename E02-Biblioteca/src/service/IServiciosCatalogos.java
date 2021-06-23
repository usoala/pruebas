/**
 * ServiciosCatalogos.java
 */
package service;


/**
 * @author Usoa Larrarte
 *
 * @Date 10 jun. 2021
 */
public interface IServiciosCatalogos <Integer, T> {
	
	public T accederElemento();
	
	public void listarElementos();
	
	public void altaElemento() throws Exception;
	
	public void bajaElemento();
	
	public void modificarElmento() throws Exception;
	
	public void serializarLista() throws Exception;
	
	public void deSerializarLista() throws Exception;
	
	public void crearElementosPruebas();
	
	public void listarElementosPrestados();
	
	public void listarElementosNoPrestados();
	
	public void listarElementosFechaPublicacionAnterior();

}
