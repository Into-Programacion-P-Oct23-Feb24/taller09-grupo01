/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Antes de analizar el presente ejercicio,
        usted debe revisar y entender lo desarrollado
        en el archivo Ayuda01.java del paquete2
         */
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan",
            "Teresa", "Luis", "Mark", "Jennifer",
            "Alcides"};
        String inicial;
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese una letra");
            inicial = entrada.nextLine();
            inicial = inicial.toUpperCase(); // Ponemos en mayúscula la inicial 
                                             // ingresada por teclado
            char letra = inicial.charAt(0); // Obtenemos el primer carácter ingresado
            
            for (int i = 0; i < estudiantes.length; i++) {
                if (estudiantes[i].charAt(0) == letra) {
                    bandera = false;
                    System.out.println("La letra coincide con la inicial "
                            + "de un nombre del arreglo"); // Se presenta en pantalla
                                        // una advertencia

                }
            }
        }
    }

}
