package br.com.atividade.segunda;

import java.util.Scanner;

public class SegundoCalculo extends BaseSegunda{

    @Override
    public void calculoExecutavel() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("-----[ Bem vindo ao Programa de Produto ]-----");

        System.out.println();

        System.out.print("Insira um valor: ");
        this.primeiroValor = scanner.nextDouble();

        System.out.println();

        System.out.print("Insira um segundo valor: ");
        this.segundoValor = scanner.nextDouble();

        Double resultado = getPrimeiroValor() * getSegundoValor();

        System.out.println();

        System.out.println("O produto de ambos os números é = " + resultado);

        System.out.println();

        System.out.println("______________________________________________");

        scanner.close();
    }
}
