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

//-------------------------------Sismo por dia--------------------------------//
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

//-------------------------------Menu--------------------------------//
public static void menu(){
    Scanner scanner = new Scanner(System.in);
    int opcion ;
    int dia; ingreseCantidadDias();
    double[][] matriz = datosSismos(dia);

    do{
        System.out.println("--------MENU--------");
        System.out.println("1. Mostrar sismo mas intenso");
        System.out.println("2. Mostrar sismos ≥ 4.0 grados Ritcher");
        System.out.println("3. Reinciar el arreglo con nuevos valores");
        System.out.println("4. Salir");

        System.out.println("Ingrese una opcion: ");
        opcion = scanner.nextInt();





    }

}