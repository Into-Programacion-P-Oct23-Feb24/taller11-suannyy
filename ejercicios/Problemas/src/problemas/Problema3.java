/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double nota1 = 10;
        double nota2 = 5;
        double nota3 = 8;
        double nota4 = 7;
        obtenerPromedio(nota1, nota2, nota3, nota4);

    }

    public static String obtenerPromedio(double n1, double n2, double n3, double n4) {
        String cadena;
        double promedio;
        promedio = (n1 + n2 + n3 + n4);
        if (promedio >= 0 && promedio <= 5) {
            cadena = "El promedio es Regular";
        } else {
            if (promedio >= 5.1 && promedio <= 8) {
                cadena = "El promedio es Bueno";
            } else {
                if (promedio >= 8.1 && promedio <= 9) {
                    cadena = "El promedio es Muy bueno";
                } else {
                    if (promedio >= 9.1 && promedio <= 10) {
                        cadena = "El promedio es Sobresaliente";
                    }
                }
