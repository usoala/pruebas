/**
 * NoPrestable.java
 */
package model.prestable;

/**
 * @author Usoa Larrarte
 *
 * @Date 13 jun. 2021
 */
public class NoPrestar implements Prestable {

	@Override
	public <T> void prestarDevolver() {
		
		System.out.println("Este ejemplar no se puede prestar");
		
	}

	@Override
	public boolean isPrestado() {
		return false;
	}

	@Override
	public void setPrestado(boolean prestado) {
		
	}

}
