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
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", 
            "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning",
            "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
         // Asignando los valores cualitativos a cada promedio
        for (int i = 0; i < promedios.length; i++) {
            if (promedios[i] >= 9 && promedios[i] <= 10) {
                promediosCualitativos[i] = "Promedio Sobresaliente";
            } else if (promedios[i] >= 6 && promedios[i] < 8.9) {
                promediosCualitativos[i] = "Promedio Bueno";
            } else {
                promediosCualitativos[i] = "Promedio Regular";
            }
        }

        // Presentando el reporte
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i] + " promedio: " + promedios[i] + " promedio cualitativo: " + promediosCualitativos[i]);
        }
    }
}
    


