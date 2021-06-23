/**
 * Prestable.java
 */
package model.prestable;

/**
 * @author Usoa Larrarte
 *
 * @Date 13 jun. 2021
 */
public interface Prestable {
	
	public boolean isPrestado();
	public void setPrestado(boolean prestado);
	public <T> void  prestarDevolver();

}
