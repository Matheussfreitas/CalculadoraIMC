package com.CalculadoraIMC.main;

import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private Calculo calculo = new Calculo();
    
    public void exibeMenu() {
        System.out.println("Informe o seu peso em Kg: ");
        double peso = scanner.nextDouble();
        System.out.println("Informe sua altura em metros: ");
        double altura = scanner.nextDouble();
        double resultado = calculo.CalculaIMC(altura, peso);
        calculo.VerificaIMC(resultado);
    }
}
