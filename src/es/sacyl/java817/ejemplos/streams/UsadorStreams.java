/**
 * 
 */
package es.sacyl.java817.ejemplos.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Clase de ejemplo de uso de streams
 * @author andres
 *
 */
public class UsadorStreams {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> lstNums = new ArrayList<Integer>();
		
		lstNums.add(44);
		lstNums.add(22);
		lstNums.add(88);
		lstNums.add(11);
		lstNums.add(22);
		
		Stream<Integer> streamDeLista = lstNums.stream();
		
		// buscar en la lista todos los 22
		System.out.println(streamDeLista.filter(Predicate.isEqual(11)));
		
		
		// el streams se ha modificado así que aquí va a fallar	
		// contarlos
		System.out.println(streamDeLista.filter(Predicate.isEqual(22)).count());
		
		// ordenar lista
		List<Integer> lstNumsOrdenada = streamDeLista.sorted().collect(Collectors.toList());
		
		//ordenar y recorrer
		streamDeLista.sorted().forEach(elemento -> {
			System.out.println("Elemento de lista: " + elemento);
		});
	}

}
