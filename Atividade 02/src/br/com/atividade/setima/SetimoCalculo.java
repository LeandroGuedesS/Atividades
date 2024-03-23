package br.com.atividade.setima;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SetimoCalculo extends BaseSetima{

    @Override
    public void calculoExecutavel() {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----[ Bem vindo ao Programa sobre o Retângulo ]-----");

        System.out.println();

        System.out.print("Insira a base do retângulo: ");
        this.base = scanner.nextDouble();

        System.out.println();

        System.out.print("Insira a altura do retângulo: ");
        this.altura = scanner.nextDouble();

        Double perimetro = getBase() + getAltura();

        Double area = getBase() * getAltura();

        DecimalFormat formatador = new DecimalFormat("00.00");

        System.out.println();

        System.out.println("O perímetro do retângulo é: " + formatador.format(perimetro));

        System.out.println();

        System.out.println("A área do retângulo é: " + formatador.format(area));

        System.out.println();

        System.out.println("________________________________________________________");

        scanner.close();

    }
    
}
