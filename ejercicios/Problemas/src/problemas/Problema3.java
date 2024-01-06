/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;
 
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double n1, n2, n3, n4;
        String calificacion;
        System.out.println("Ingrese nota 1");
        n1 = entrada.nextDouble();
        System.out.println("Ingrese nota 2");
        n2 = entrada.nextDouble();
        System.out.println("Ingrese nota 3");
        n3 = entrada.nextDouble();
        System.out.println("Ingrese nota 4");
        n4 = entrada.nextDouble();
        calificacion = obtenerPromedioCualitativo(n1, n2, n3, n4);
        System.out.printf("El promedio de las notas:%.2f, %.2f, %.2f,"
                + " %.2f es %s\n",
                n1,
                n2,
                n3,
                n4,
                calificacion);
    }

    public static String obtenerPromedioCualitativo(double a, double b, double c, double d) {
        String calificacion = "";
        double promedio = (a + b + c + d) / 4;
        if ((promedio >= 0) && (promedio <= 5)) {
            calificacion = "Regular";
        } else {
            if ((promedio >= 5.1) && (promedio <= 8)) {
                calificacion = "Bueno";
            } else {
                if ((promedio >= 8.1) && (promedio <= 9)) {
                    calificacion = "Muy Bueno";
                } else {
                    if ((promedio >= 9.1) && (promedio <= 10)) {
                        calificacion = "Sobresaliente";
                    } else {
                        calificacion = "Error";
                    }
                }
            }
        }
        return calificacion;
    }
}