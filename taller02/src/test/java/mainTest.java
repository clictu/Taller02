import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {

    @Test
    void sismoMasIntenso() {
        double [ ][ ] matriz = {
                {2.5, 3.0, 2.7, 3.8, 4.0, 3.1, 4.6, 2.3, 3.2, 3.1, 2.5, 2.2, 2.5, 3.0, 2.7, 3.8, 4.0, 3.1, 4.5, 2.3, 3.2, 3.1, 2.5, 2.2},
                {4.5, 2.3, 3.2, 3.1, 2.5, 2.2, 2.5, 3.0, 2.7, 3.8, 4.0, 3.1, 2.5, 2.2, 2.5, 3.0, 2.7, 3.8, 2.5, 3.0, 2.7, 3.8, 4.0, 3.1},
                {2.3, 3.2, 3.1, 2.5, 2.2, 2.5, 2.2, 2.5, 3.0, 2.7, 3.8, 2.5, 3.0, 2.7, 3.8, 4.0, 3.1, 3.8, 4.0, 3.1, 4.5, 2.3, 3.2, 2.9},
                {2.5, 3.0, 2.7, 3.8, 4.0, 3.1, 4.5, 2.3, 3.2, 3.1, 2.5, 2.2, 2.5, 2.2, 2.5, 3.0, 2.7, 3.8, 2.7, 3.8, 4.5, 2.3, 3.2, 3.1},
                {3.8, 4.0, 3.1, 4.5, 2.3, 3.2, 2.5, 2.2, 2.5, 3.0, 2.7, 3.8, 4.5, 2.3, 3.2, 3.1, 2.5, 2.2, 2.5, 3.0, 2.7, 3.8, 4.0, 3.1}
        };

        int diaEsperado = 1;
        int horaEsperada = 1;
        double intensidadEsperada = 2.5;

    }

    @Test
    void sismosPorDia() {
        double[][] matriz = {
                {2.5, 3.0, 2.7, 3.8, 4.0, 3.1, 4.6, 2.3, 3.2, 3.1, 2.5, 2.2, 2.5, 3.0, 2.7, 3.8, 4.0, 3.1, 4.5, 2.3, 3.2, 3.1, 2.5, 2.2},
                {4.5, 2.3, 3.2, 3.1, 2.5, 2.2, 2.5, 3.0, 2.7, 3.8, 4.0, 3.1, 2.5, 2.2, 2.5, 3.0, 2.7, 3.8, 2.5, 3.0, 2.7, 3.8, 4.0, 3.1},
                {2.3, 3.2, 3.1, 2.5, 2.2, 2.5, 2.2, 2.5, 3.0, 2.7, 3.8, 2.5, 3.0, 2.7, 3.8, 4.0, 3.1, 3.8, 4.0, 3.1, 4.5, 2.3, 3.2, 2.9},
                {2.5, 3.0, 2.7, 3.8, 4.0, 3.1, 4.5, 2.3, 3.2, 3.1, 2.5, 2.2, 2.5, 2.2, 2.5, 3.0, 2.7, 3.8, 2.7, 3.8, 4.5, 2.3, 3.2, 3.1},
                {3.8, 4.0, 3.1, 4.5, 2.3, 3.2, 2.5, 2.2, 2.5, 3.0, 2.7, 3.8, 4.5, 2.3, 3.2, 3.1, 2.5, 2.2, 2.5, 3.0, 2.7, 3.8, 4.0, 3.1}
    };

    }
}