public class main {
    public static void sismoMasIntenso(double[][] matriz) {
        double maxIntensidad = 0.0;
        int diaMax = -1;
        int horaMax = -1;

        for (int dia = 0; dia < matriz.length; dia++) {
            for (int hora = 0; hora < 24; hora++) {
                double intensidad = matriz[dia][hora];
                if (intensidad > maxIntensidad) {
                    maxIntensidad = intensidad;
                    diaMax = dia + 1;
                    horaMax = hora;
                }
            }
        }
        System.out.printf("El día %d, a las %02d:00, se registra sismo mas intenso, con un valor de %.1f en la escala de Richter.%n", diaMax, horaMax, maxIntensidad);
    }

    public static void sismosPorDia(double[][] matriz) {
        for (int dia = 0; dia < matriz.length; dia++) {
            int conteo = 0;

            for (int hora = 0; hora < 24; hora++) {
                if (matriz[dia][hora] >= 4.0) {
                    conteo++;
                }
            }
            System.out.printf("dia%d: %d veces %n", dia + 1, conteo);
        }
    }
}
