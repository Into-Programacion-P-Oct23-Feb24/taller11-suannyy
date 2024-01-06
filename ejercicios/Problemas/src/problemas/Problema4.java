/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

public class Problema4 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        entrada.useLocale(Locale.US);
        int num = 0;
        String cedula;
        String nomb;
        System.out.println("Ingrese el nombre");
        nomb = entrada.nextLine();
        System.out.println("Ingrese la cedula");
        cedula = entrada.nextLine();
        System.out.println("Ingrese un numero del 1 al 2");
        num = entrada.nextInt();
        if (num > 0 && num < 3) {
            switch (num) {
                case 1:
                    calcularValorLuz(nomb, cedula);
                    break;
                case 2:
                    calcularPredio(nomb, cedula);
                    break;
            }
        } else {
            System.out.println("Error");
        }
    }

    public static void calcularValorLuz(String nomb, String cedula) {
        entrada.useLocale(Locale.US);
        System.out.println("Calcular el valor de luz");
        double valorKw;
        double numKw;
        double valor;
        System.out.println("Ingrese el valor del kilowatio");
        valorKw = entrada.nextDouble();
        System.out.println("Ingrese el numero de kilowatio del mes");
        numKw = entrada.nextDouble();
        valor = valorKw * numKw;
        System.out.printf("Cliente %s con cedula %s debe cancelar el "
                + "valor de $%.2f\n",
                nomb,
                cedula,
                valor);
    }

    public static void calcularPredio(String nomb, String cedula) {
        entrada.useLocale(Locale.US);
        System.out.println("Calcular el valor del predio");
        double valor;
        double valorP;
        System.out.println("Ingrese el valor del Inmueble");
        valor = entrada.nextDouble();
        valorP = valor * 0.2;
        System.out.printf("Cliente %s con cedula %s tiene un bien "
                + "inmueble valorado en $%.2f y tiene que pagar de predio $ %.2f\n",
                nomb, cedula, valor, valorP);
    }
}
