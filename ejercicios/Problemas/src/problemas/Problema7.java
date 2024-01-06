/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

public class Problema7 {

    public static void main(String[] args) {
        String[] arreglo;
        arreglo = obtenerCadena();
        System.out.println("Valores");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);

        }
        System.out.println("Valores que tienen 4 o 5 caracteres");
        obtenervalores(arreglo);
    }

    public static String[] obtenerCadena() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int num;
        System.out.println("Ingrese el numero de datos que desee ingresar");
        num = entrada.nextInt();
        String[] ciudad = new String[num];
        entrada.nextLine();
        for (int i = 0; i < ciudad.length; i++) {
            System.out.println("Ingrese el nombre de la Ciudad " + (i + 1));
            ciudad[i] = entrada.nextLine();
        }
        return ciudad;
    }

    public static void obtenervalores(String[] ciudad) {
        for (int i = 0; i < ciudad.length; i++) {
            if (ciudad[i].length() == 4 || ciudad[i].length() == 5) {
                System.out.println(ciudad[i]);
            }
        }
    }

}
