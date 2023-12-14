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

        // Calculando la suma de los elementos en el arreglo
        for (int i = 0; i < arreglo.length; i++) {
            sum = sum + arreglo[i];
        }

        // Calculando la media aritmética
        double media = sum / arreglo.length;

        // Contadores para elementos arriba y abajo de la media
        String arribaMedia = "Elementos arriba de la media: ";
        String abajoMedia = "Elementos por debajo de la media: ";

        // Verificando cuántos elementos están arriba o abajo de la media
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > media) {
                arribaMedia = String.format("%s%d\n", arribaMedia, arreglo[i]);
            } else if (arreglo[i] < media) {
                abajoMedia = String.format("%s%d\n", abajoMedia, arreglo[i]);
            }
        }

        // Mostrando resultados
        System.out.printf("Media aritmética: %.4f\n%s", media, arribaMedia,
                abajoMedia);
    }
}
