/**
 * 
 */
package es.sacyl.java817.ejemplos.fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author andres
 *
 */
public class NuevosManejosFechas {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalTime time = LocalTime.now(); // sólo tiene información de la hora
		
		System.out.println("Son las: " + time.getHour() +" y " + time.getMinute() + " minutos");
		
		LocalDate fecha = LocalDate.now(); // sólo tiene información de fecha
		System.out.println("Este año es bisiesto?: " + fecha.isLeapYear());
		
		LocalDateTime fechaHora = LocalDateTime.now(); // fecha y hora en el mismo objeto
		System.out.println("Fecha y hora actuales: " + fechaHora.toString());// así iría en formato UTC
		
		
		// comparaciones
		LocalDateTime fechaHora2 = LocalDateTime.of(2000, 1, 13, 14, 25);
		
		System.out.println("Hoy es antes que el año 2000?: " + fechaHora.isBefore(fechaHora2));
		
		
		
		// *********************************************
		//Métodos nuevos en clases de uso habitual
		// *********************************************
		
		//String
		String cad = "Parte 1";
		System.out.println("Cadena unida: " + String.join("-", cad, " parte 2"));
		
		// integer
		System.out.println("Suma sin necesidad de variables:" + Integer.sum(35, 44));
		System.out.println("Máximo de 2 números:" + Integer.max(35, 44));
		System.out.println("35 > 44?:" + Integer.compare(35, 44));
		
	}

}
