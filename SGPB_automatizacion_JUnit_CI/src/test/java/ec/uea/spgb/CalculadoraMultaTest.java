package ec.uea.spgb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalculadoraMultaTest {
    @Test
    void CP_U01_calcula_multa_por_tres_dias_de_atraso() {
        double resultado = CalculadoraMulta.calcular(3);
        assertEquals(1.50, resultado, 0.001);
    }
}