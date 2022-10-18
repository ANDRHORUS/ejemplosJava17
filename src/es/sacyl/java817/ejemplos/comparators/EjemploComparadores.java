/**
 * 
 */
package es.sacyl.java817.ejemplos.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author andres
 *
 */
public class EjemploComparadores {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<PacienteBean> lstPacientes = new ArrayList<>();
		
		PacienteBean pac1 = new PacienteBean(1, 1,  "cipa1pac22dni887765", "Pepe", "Romero");
		PacienteBean pac2 = new PacienteBean(2, 11, "zipa1pac22dni887765", "Francisco", "Antón");
		PacienteBean pac3 = new PacienteBean(3, 43, "copa1pac22dni887765", "Antonio", "Martín");

		
		lstPacientes.add(pac1);
		lstPacientes.add(pac2);
		lstPacientes.add(pac3);
		
		// com lambda normal
		Collections.sort(lstPacientes, (Comparator<PacienteBean>) (PacienteBean pa1, PacienteBean pa2)-> (pa1.getId() > pa2.getId())?1:0 );
		mostrarLista(lstPacientes, "id");
		
		// con lambda referencia a métodos
		Collections.sort(lstPacientes, Comparator.comparingInt(PacienteBean ::getId)); // ordenar por id		
		mostrarLista(lstPacientes, "id");
		
		// ordenar por cipa
		Collections.sort(lstPacientes, Comparator.comparing(PacienteBean ::getCIPA)); // ordenar por cipa	
		mostrarLista(lstPacientes, "cipa");
			
		// ordenar por nombre
		Collections.sort(lstPacientes, Comparator.comparing(PacienteBean ::getNombre)); // ordenar por numbre	
		mostrarLista(lstPacientes, "numbre");
		
		// mejora java 9, factorías para colecciones, así la creación de la lista es más rápida (1 línea de código)
		List<PacienteBean> lstPacis2 = List.of(pac1, pac2, pac3);
	}

	/**
	 * @param lstPacientes
	 */
	private static void mostrarLista(List<PacienteBean> lstPacientes, String aCriterio) {
		System.out.println("--- Ordenación por " + aCriterio+" ---");
		lstPacientes.forEach(paciente -> {
			System.out.println("Paciente: " +paciente.toString());
		});
	}

}
