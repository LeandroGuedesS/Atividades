package br.com.atividade.sexta;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SextoCalculo extends BaseSexta{

    @Override
    public void calculoExecutavel() {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----[ Bem vindo ao Programa de Reajuste ]-----");

        System.out.println();

        System.out.print("Insira o saldo da sua conta poupança: ");
        this.saldoAtual = scanner.nextDouble();

        System.out.println();

        Double reajuste = getSaldoAtual() * 0.02;

        Double novoValor = getSaldoAtual() + reajuste;

        DecimalFormat formatador = new DecimalFormat("00.00");

        System.out.print("Esse é o seu saldo atual com reajuste de 2% aplicado: R$" + formatador.format(novoValor));
        
        System.out.println();

        System.out.println("_______________________________________________");
        scanner.close();
    }
    
}
