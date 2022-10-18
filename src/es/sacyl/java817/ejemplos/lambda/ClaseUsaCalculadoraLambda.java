/**
 * 
 */
package es.sacyl.java817.ejemplos.lambda;

/**
 * Clase de ejemplo de expresión lambda para implementar una interfaz funcional
 * 
 * @author andres
 *
 */
public class ClaseUsaCalculadoraLambda {

	/**
	 * 
	 */
	public ClaseUsaCalculadoraLambda() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// implementamos la calculadora para sumar, con la variable sumador y la expresión lambda de abajo
		ICcalculaLambda sumador = (x, y) -> x + y;

		System.out.println("Suma: " + sumador.calcular(3, 4));

		// implementamos la calculadora para multiplicar, con la variable multiplicador y la expresión lambda de abajo
		ICcalculaLambda multiplicador = (x, y) -> x * y;

		System.out.println("Multiplicación: " + multiplicador.calcular(3, 4));
	}

}
