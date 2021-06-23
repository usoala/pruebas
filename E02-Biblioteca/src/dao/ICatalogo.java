/**
 * ICatalogo.java
 */
package dao;

import java.io.Serializable;
import java.time.LocalDate;

import exceptions.ExcepcionLibro;

/**
 * @author Usoa Larrarte
 *
 * @Date 10 jun. 2021
 */
public interface ICatalogo <Integer, T> {
	
	public T accederElemento(Integer id);
	
	public void listarElementos();
	
	public void altaElemento(Integer id, T t) throws Exception;
	
	public boolean existeId(Integer id);
	
	public void bajaElemento(Integer id);
	
	public void modificarElmento(Integer id, T t) throws Exception;
	
	public void serializarLista(String fichero) throws Exception;
	
	public void deSerializarLista(String fichero) throws Exception;
	
	public void crearElementosPruebas();
	
	public void listarElementosPrestados();
	
	public void listarElementosNoPrestados();
	
	public void listarElementosFechaPublicacionAnterior(LocalDate fecha);
	
	public Integer siguienteId();

}
