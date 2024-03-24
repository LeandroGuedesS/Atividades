package br.com.atividade.quarta;

import java.util.Scanner;

public class QuartoCalculo extends BaseQuarta {

    @Override
    public void calculoExecutavel() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("-----[ Bem vindo ao Programa dos Valores ]-----");

        System.out.println();

        System.out.print("Insira um valor qualquer: ");
        this.valorInicial = scanner.nextInt();

        int antecessor = getValorInicial() -1;

        int sucessor = getValorInicial() +1;

        System.out.println();

        System.out.println("Esse é o valor antecessor do número informado: " + antecessor);

        System.out.println();

        System.out.println("Esse é o valor sucessor do número informado: " + sucessor);

        System.out.println("_______________________________________________");

        scanner.close();
    }
    
}
