/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String[] marcas;
        int num;
        String marca;
        System.out.println("Ingrese la cantidad de marcas");
        num = entrada.nextInt();
        marcas = new String[num];// asignamos la longitud del arreglo
        String ficha = "";
        int i = 0;
        entrada.nextLine();
        while (i < num) { 
            System.out.println("Ingrese la marca");
            marca = entrada.nextLine();
            String inicial = marca.substring(0, 1); // identificamos
                             // la inicial de la palabra ingresada por teclado
            inicial = inicial.toUpperCase(); // ponemos en mayuscula la inicial para
            //poder comparar que sean diferentes a las excepciones
            switch (inicial) {
                case "A":
                case "C":
                case "T":
                    System.out.println("No se pueden ingresar marcas que inicien"
                            + "con la letra A C o T"); // damos un aviso cuando 
                    // las restricciones se cumplen
                    break;
                default:
                    marcas[i] = marca; // damos el valor ingresado por teclado a nuestro
                    // arreglo en la posicion marcada
                    ficha = String.format("%s%s\n", ficha, marcas[i]);
                    i = i + 1; // aumentamos contador
                    break;
            }

        }
        System.out.printf("%s", ficha);
    }
}
