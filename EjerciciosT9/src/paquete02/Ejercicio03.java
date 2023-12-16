/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        double sum = 0;
        double media = 0; // calcular la media
        String[] rangos = {"Elementos arriba de la media: ", "Elementos abajo "
            + "de la media"};// agrego una nueva variable para poder contar los elementos
        // que estan por arriba y abajo de la media
        int[] rango = {0, 0};
        for (int i = 0; i < arreglo.length; i++) { // Calculando la suma de los elementos en el arreglo
            sum = sum + arreglo[i];
        }
        // Calculando la media aritmética
        media = sum / arreglo.length;
        // Contadores para elementos arriba y abajo de la media
        // Verificando cuántos elementos están arriba o abajo de la media
        for (int i = 0; i < arreglo.length; i++) {
            // Arriba de la media
            if (arreglo[i] > media) {
                rango[0] += 1;
            } else {
                // Debajo de la media
                if (arreglo[i] < media) {
                    rango[1] += 1;
                }
            }
        }
        for (int i = 0; i < rangos.length; i++) {
            System.out.printf("%s - valor %d\n", rangos[i],
                    rango[i]);
        }

    }
}
