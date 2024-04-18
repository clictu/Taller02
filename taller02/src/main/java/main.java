import java.util.Scanner;

public class main {

    //-------------------------------Sismo mas intenso--------------------------------//
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

    //-------------------------------Sismo por dia >=4.0--------------------------------//
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


    //-------------------------------Main--------------------------------//
    public static void main(String[] args) {
        menu();
    }

    //-------------------------------Menu--------------------------------//
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        //int dia = variablebastian(cambiar)();
        //double[][] matriz = datosSismos(dia);

        do {
            System.out.println("--------MENU--------");
            System.out.println("1. Mostrar sismo mas intenso");
            System.out.println("2. Mostrar sismos ≥ 4.0 grados Ritcher");
            System.out.println("3. Reinciar el arreglo con nuevos valores");
            System.out.println("4. Salir");

            System.out.println("Ingrese una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    //sismoMasIntenso(matriz);
                    break;
                /*case 2:
                    sismosPorDia(matriz);
                    break;*/
                /*case 3:
                    // Reiniciar el arreglo con nuevos valores
                    dia = ingresarCantidadDias();
                    matriz = generarDatosSismologicos(dia);
                    System.out.println("El arreglo ha sido reiniciado.");
                    break;*/
                case 4:
                    break;
                default:
                    System.out.println("ERROOOR. Ingrese una opción valida.");
                    break;
            }
        } while (opcion != 4);
    }
}








