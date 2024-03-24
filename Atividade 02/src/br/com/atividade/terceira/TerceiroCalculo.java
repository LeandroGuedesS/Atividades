package br.com.atividade.terceira;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TerceiroCalculo extends BaseTerceira{

    @Override
    public void calculoExecutavel() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("-----[ Bem vindo ao Programa de Aritmética ]-----");

        System.out.println();

        System.out.print("Insira um valor: ");
        this.primeiroValor = scanner.nextDouble();

        System.out.println();

        System.out.print("Insira o segundo valor: ");
        this.segundoValor = scanner.nextDouble();

        System.out.println();

        System.out.print("Insira o terceiro valor: ");
        this.terceiroValor = scanner.nextDouble();

        Double resultado = (getPrimeiroValor() + getSegundoValor() + getTerceiroValor()) / 3;

        DecimalFormat formatador = new DecimalFormat("00.00");

        System.out.println();

        System.out.print("O cálculo aritmético dos valores é = " + formatador.format(resultado));

        System.out.println();

        System.out.println("_________________________________________________");

        scanner.close();
    }
    
}
