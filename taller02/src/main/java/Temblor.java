

import java.util.Random;

public class Temblor {
    private double[][] lecturasSismicas;

    // Constructor
    public Temblor() {
        // No inicializamos la matriz hasta que se ingrese la cantidad de días
    }

    // Método para ingresar la cantidad de días a registrar
    public void ingresarCantidadDias(int N) {
        if (N < 2 || N > 31) {
            System.out.println("Error: La cantidad de días debe estar entre 2 y 31.");
            return;
        }
        lecturasSismicas = new double[N][24];
    }

    // Método para generar las lecturas sismológicas aleatorias
    public void generarLecturasAleatorias() {
        Random rand = new Random();
        for (int i = 0; i < lecturasSismicas.length; i++) {
            for (int j = 0; j < lecturasSismicas[i].length; j++) {
                lecturasSismicas[i][j] = 1.0 + (9.5 - 1.0) * rand.nextDouble();
            }
        }
    }

    // Método para obtener la lectura sismológica máxima de un día específico
    public double obtenerMaximaLecturaDia(int dia) {
        if (dia < 1 || dia > lecturasSismicas.length) {
            System.out.println("Error: Día fuera de rango.");
            return -1.0;
        }
        double maxima = lecturasSismicas[dia - 1][0];
        for (int i = 1; i < lecturasSismicas[dia - 1].length; i++) {
            if (lecturasSismicas[dia - 1][i] > maxima) {
                maxima = lecturasSismicas[dia - 1][i];
            }
        }
        return maxima;
    }

    // Método para obtener la lectura sismológica mínima de un día específico
    public double obtenerMinimaLecturaDia(int dia) {
        if (dia < 1 || dia > lecturasSismicas.length) {
            System.out.println("Error: Día fuera de rango.");
            return -1.0;
        }
        double minima = lecturasSismicas[dia - 1][0];
        for (int i = 1; i < lecturasSismicas[dia - 1].length; i++) {
            if (lecturasSismicas[dia - 1][i] < minima) {
                minima = lecturasSismicas[dia - 1][i];
            }
        }
        return minima;
    }

    // Método para obtener el promedio de las lecturas sismológicas de un día específico
    public double obtenerPromedioLecturaDia(int dia) {
        if (dia < 1 || dia > lecturasSismicas.length) {
            System.out.println("Error: Día fuera de rango.");
            return -1.0;
        }
        double suma = 0.0;
        for (int i = 0; i < lecturasSismicas[dia - 1].length; i++) {
            suma += lecturasSismicas[dia - 1][i];
        }
        return suma / lecturasSismicas[dia - 1].length;
    }

    // Método principal
    public static void main(String[] args) {
        Temblor temblor = new Temblor();
        temblor.ingresarCantidadDias(7); // Ingresa la cantidad de días a registrar
        temblor.generarLecturasAleatorias(); // Genera las lecturas sismológicas aleatorias

        // Muestra las lecturas sismológicas
        System.out.println("Lecturas sismológicas:");
        for (int i = 0; i < temblor.lecturasSismicas.length; i++) {
            System.out.print("Día " + (i + 1) + ": ");
            for (int j = 0; j < temblor.lecturasSismicas[i].length; j++) {
                System.out.print(temblor.lecturasSismicas[i][j] + " ");
            }
            System.out.println();
        }

        // Obtiene estadísticas para un día específico
        int diaEspecifico = 3; // Especifica el día del que se desean obtener estadísticas
        double maxima = temblor.obtenerMaximaLecturaDia(diaEspecifico);
        double minima = temblor.obtenerMinimaLecturaDia(diaEspecifico);
        double promedio = temblor.obtenerPromedioLecturaDia(diaEspecifico);

        System.out.println("\nEstadísticas para el día " + diaEspecifico + ":");
        System.out.println("Lectura máxima: " + maxima);
        System.out.println("Lectura mínima: " + minima);
        System.out.println("Promedio de lecturas: " + promedio);
    }
}
