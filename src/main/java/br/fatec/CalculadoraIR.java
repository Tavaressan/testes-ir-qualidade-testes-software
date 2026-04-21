package br.fatec;

public class CalculadoraIR {

    public String calcularIsencao(double renda) {
        if (renda < 0) {
            return "Rejeitar entrada";
        } else if (renda >= 0 && renda <= 5000) {
            return "IR = 0";
        } else if (renda > 5000 && renda <= 5500) {
            return "IR com 75% desconto";
        } else if (renda > 5500 && renda <= 6000) {
            return "IR com 50% desconto";
        } else if (renda > 6000 && renda <= 6500) {
            return "IR com 25% desconto";
        } else if (renda > 6500 && renda <= 7350) {
            return "IR com 10% desconto";
        } else {
            return "IR com 27,5% (sem desconto)";
        }
    }
}
