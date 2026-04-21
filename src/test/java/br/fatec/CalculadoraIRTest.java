package br.fatec;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraIRTest {

    @Test
    public void testRejeitarEntrada_CE1() {
        CalculadoraIR calc = new CalculadoraIR();
        // Testa um valor negativo e um menor que 0
        assertEquals("Rejeitar entrada", calc.calcularIsencao(-100.0));
        assertEquals("Rejeitar entrada", calc.calcularIsencao(-0.01));
    }

    @Test
    public void testIRZero_CE2() {
        CalculadoraIR calc = new CalculadoraIR();
        // Validando limite inferior, superior e valor intermediário
        assertEquals("IR = 0", calc.calcularIsencao(0.0));
        assertEquals("IR = 0", calc.calcularIsencao(2500.0));
        assertEquals("IR = 0", calc.calcularIsencao(5000.0));
    }

    @Test
    public void testIR75PorcentoDesconto_CE3() {
        CalculadoraIR calc = new CalculadoraIR();
        // Validando limite (pouco maior que 5000, até 5500)
        assertEquals("IR com 75% desconto", calc.calcularIsencao(5000.01));
        assertEquals("IR com 75% desconto", calc.calcularIsencao(5250.0));
        assertEquals("IR com 75% desconto", calc.calcularIsencao(5500.0));
    }

    @Test
    public void testIR50PorcentoDesconto_CE4() {
        CalculadoraIR calc = new CalculadoraIR();
        // Validando limite (pouco maior que 5500, até 6000)
        assertEquals("IR com 50% desconto", calc.calcularIsencao(5500.01));
        assertEquals("IR com 50% desconto", calc.calcularIsencao(5750.0));
        assertEquals("IR com 50% desconto", calc.calcularIsencao(6000.0));
    }

    @Test
    public void testIR25PorcentoDesconto_CE5() {
        CalculadoraIR calc = new CalculadoraIR();
        // Validando limite (pouco maior que 6000, até 6500)
        assertEquals("IR com 25% desconto", calc.calcularIsencao(6000.01));
        assertEquals("IR com 25% desconto", calc.calcularIsencao(6250.0));
        assertEquals("IR com 25% desconto", calc.calcularIsencao(6500.0));
    }

    @Test
    public void testIR10PorcentoDesconto_CE6() {
        CalculadoraIR calc = new CalculadoraIR();
        // Validando limites (pouco maior que 6500, até 7350)
        assertEquals("IR com 10% desconto", calc.calcularIsencao(6500.01));
        assertEquals("IR com 10% desconto", calc.calcularIsencao(7000.0));
        assertEquals("IR com 10% desconto", calc.calcularIsencao(7350.0));
    }

    @Test
    public void testIRSemDesconto_CE7() {
        CalculadoraIR calc = new CalculadoraIR();
        // Validando limite (pouco maior que 7350 em diante)
        assertEquals("IR com 27,5% (sem desconto)", calc.calcularIsencao(7350.01));
        assertEquals("IR com 27,5% (sem desconto)", calc.calcularIsencao(10000.0));
    }
}
