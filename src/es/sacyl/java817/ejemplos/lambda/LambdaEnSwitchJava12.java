/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.sacyl.java817.ejemplos.lambda;

/**
 *
 * @author andres
 */
public class LambdaEnSwitchJava12 {
    
    static final int ENERO = 1;
    static final int FEBRERO = 2;
    static final int MARZO = 3;
    static final int ABRIL = 4;
    static final int MAYO = 5;
    static final int JUNIO = 6;
    static final int JULIO = 7;
    static final int AGOSTO = 8;
    static final int SEPTIEMBRE = 9;
    static final int OCTUBRE = 10;
    static final int NOVIEMBRE = 11;
    static final int DICIEMBRE = 12;
    
    public static void main(String[] args) {
        int mes = 10;
        int anno = 2022;
        
        var diasMes = switch(mes) {
            case ENERO,MARZO, MAYO, JULIO, AGOSTO, OCTUBRE, DICIEMBRE -> 31;
            case ABRIL,JUNIO,SEPTIEMBRE,NOVIEMBRE -> 30;
            case FEBRERO -> {
                if (anno % 400 == 0) yield 29;
                else if (anno % 100 == 0) yield 28;
                else yield 28;
            }
            default -> throw new IllegalStateException("Valor de mes incorrecto");
        };
        
        System.out.println("Dias de octubre: " + diasMes);
    }
}
