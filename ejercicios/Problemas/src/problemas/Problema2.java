/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int tipo;
        double area;
        System.out.println("Ingrese el tipo de area a sacar\n(1)Para el area "
                + "de un Cuadrado\n(2)Para el area de un Triangulo\n(3)Para el"
                + "area de un Rectangulo");
        tipo = entrada.nextInt();
        if (tipo == 1) {
            System.out.println("Ingresar valor del lado");
            double lado = entrada.nextDouble();
            area = obtenerAreaC(lado);
            System.out.printf("El area es: %.1f\n", area);
        } else {
            if (tipo == 2) {
                System.out.println("Ingresar valor de la base");
                double base = entrada.nextDouble();
                System.out.println("Ingresar valor de la altura");
                double altura = entrada.nextDouble();
                area = obtenerAreaT(base, altura);
                System.out.printf("El area es: %.1f\n", area);
            } else {
                if (tipo == 3) {
                    System.out.println("Ingresar valor de la base");
                    double base = entrada.nextDouble();
                    System.out.println("Ingresar valor de la altura");
                    double altura = entrada.nextDouble();
                    area = obtenerAreaR(base, altura);
                    System.out.printf("El area es: %.1f\n", area);
                } else {
                    System.out.println("tipo ingresado es incorrecto");
                }
            }
        }
    }

    public static double obtenerAreaC(double l) {
        double areaC;
        areaC = l * l;
        return areaC;
    }

    public static double obtenerAreaT(double b, double h) {
        double areaT;
        areaT = (b * h) / 2;
        return areaT;
    }

    public static double obtenerAreaR(double b, double h) {
        double areaR;
        areaR = b * h;
        return areaR;
    }

}