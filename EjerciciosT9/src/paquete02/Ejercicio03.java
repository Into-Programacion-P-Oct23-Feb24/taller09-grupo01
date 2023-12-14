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
        for (int num : arreglo) {
            sum += num;
        }

        // Calculando la media aritmética
        double media = sum / arreglo.length;

        // Contadores para elementos arriba y abajo de la media
        int arribaMedia = 0;
        int abajoMedia = 0;

        // Verificando cuántos elementos están arriba o abajo de la media
        for (int num : arreglo) {
            if (num > media) {
                arribaMedia++;
            } else if (num < media) {
                abajoMedia++;
            }
        }

        // Mostrando resultados
        System.out.println("Media aritmética: " + media);
        System.out.println("Elementos arriba de la media: " + arribaMedia);
        System.out.println("Elementos por debajo de la media: " + abajoMedia);
    }
}

