/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.sacyl.java817.ejemplos.comparators.selladas;

/**
 *Limitamos las clases que pueden extender de Persona, solo paciente y ususario
 * @author andres
 */
public abstract sealed class Persona permits Paciente, Usuario {
    
    private String sNombre;
    private String sApellidos;
}

