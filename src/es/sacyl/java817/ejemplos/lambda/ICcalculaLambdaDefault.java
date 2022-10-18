/**
 * 
 */
package es.sacyl.java817.ejemplos.lambda;

/**
 * Ejemplo de interfaz funcional
 * @author andres
 *
 */
@FunctionalInterface
public interface ICcalculaLambdaDefault {

	public int calcular(int x, int y);
	
	/**
	 * Método con comportamiento por defecto. No es necesario implementarlo en las clases que implementan la interfaz
	 * @param x dividendo
	 * @param y divisor
	 * @return resultado
	 */
	public default float dividir(float x, float y) {
		return x/y;
	}
}
