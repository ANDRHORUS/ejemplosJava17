/**
 * 
 */
package es.sacyl.java817.ejemplos.inferencia;

import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

import es.sacyl.java817.ejemplos.comparators.PacienteBean;
import es.sacyl.java817.ejemplos.lambda.ICcalculaLambda;

/**
 * @author andres
 *
 */
public class InferenciaTipos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// variable con inferencia. Oblgatorio que sea en la misma línea en la que se inicializa
		var variable = new ArrayList<PacienteBean>(); // java 10
		
		// inferencia tipos java 11, con mejora en lambda
		ICcalculaLambda calculadora = (x, y)-> x+y; // implementación del método de la interfaz funcional
		

		// java 11, se pueden indicar que no sean nulas o los tipos de variable pero no mezclando
		calculadora = (var x, var y)-> x+y;
		calculadora = (@NotNull var x, @NotNull var y)-> x+y;
	}

}
