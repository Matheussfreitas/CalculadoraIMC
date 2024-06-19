package com.CalculadoraIMC.main;

public class Calculo {
    private double resultado;
    private String resultadoFormatado;

    public double CalculaIMC(double altura, double peso) {
        resultado = peso / (altura * altura);
        resultadoFormatado = String.format("%.2f", resultado);
        System.out.println("O seu IMC é de: " + resultadoFormatado);
        return resultado;
    }

    public void VerificaIMC(double resultado) {
        double[][] tabelaDeValores = {
            {Double.MIN_VALUE, 16.99},
            {17, 18.49},
            {18.50, 24.99},
            {25, 29.99},
            {30, 34.99},
            {35, 39.99},
            {40, Double.MAX_VALUE}
        };
        String[][] situacao = {
            {"Muito abaixo do peso"},
            {"Abaixo do peso"},
            {"Peso normal"},
            {"Acima do peso"},
            {"Obesidade"},
            {"Obesidade severa"},
            {"Obesidade mórbida"}
        };

        for (int i = 0; i < tabelaDeValores.length; i++) {
            double limiteInferior = tabelaDeValores[i][0];
            double limiteSuperior = tabelaDeValores[i][1];
            
            if (resultado >= limiteInferior && resultado <= limiteSuperior) {
                System.out.println("Você está " + situacao[i][0]);
                return;
            }
        }
    }
}
