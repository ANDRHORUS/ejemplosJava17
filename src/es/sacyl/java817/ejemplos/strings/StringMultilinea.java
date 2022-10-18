/**
 *
 */
package es.sacyl.java817.ejemplos.strings;

import java.util.List;

/**
 * @author andres
 *
 */
public class StringMultilinea {

    /**
     * @param args
     */
    public static void main(String[] args) {
        var cadena = """
                            <html lang="en">
			        <body>
			            <p>Bienvenid@</p>
			        </body>
			    </html>
				""";

        System.out.println(cadena);

        // instanceof con cast
        var objetoX = List.of(1, 25, 33, 41);

        manejaObjeto(cadena);
        manejaObjeto(objetoX);

    }

    public static void manejaObjeto(Object objeto) {
        if (objeto instanceof String cad) {
            if (cad.compareTo("Hola") > 0) {
                System.out.println("Cadena es hola");
            } else {
                System.out.println("Cadena es otra cosa");
            }
        } else if (objeto instanceof List lista) {
            System.out.println("Objeto es una lista de" + lista.size());
        }
    }

    /**
     * Switch con lamdas sustituyendo a instanceof
     * @param objeto 
     */
    public static void manejaObjetoLambda(Object objeto) {
        switch (objeto) {
            case String cad -> {
                if (cad.compareTo("Hola") > 0) {
                    System.out.println("Cadena es hola");
                } else {
                    System.out.println("Cadena es otra cosa");
                }
            }
            case List lista ->
                System.out.println("Objeto es una lista de" + lista.size());
            case default -> {
            }
        }
    }
}
