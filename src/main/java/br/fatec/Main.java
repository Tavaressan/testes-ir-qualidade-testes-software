package br.fatec;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraIR calculadora = new CalculadoraIR();

        System.out.println("=== Simulador de Isenção/Desconto de Imposto de Renda ===");
        System.out.print("Digite o valor da renda: ");
        
        if (scanner.hasNextDouble()) {
            double renda = scanner.nextDouble();
            String resultado = calculadora.calcularIsencao(renda);
            System.out.println("Resultado Esperado: " + resultado);
        } else {
            System.out.println("Entrada inválida. Por favor, insira um número válido para a renda.");
        }
        
        scanner.close();
    }
}
