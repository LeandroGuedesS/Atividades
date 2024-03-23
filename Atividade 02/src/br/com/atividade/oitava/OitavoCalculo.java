package br.com.atividade.oitava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OitavoCalculo extends BaseOitava{

    @Override
    public void calculoExecutavel() {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----[ Bem vindo ao Programa de Reajuste Salarial ]-----");

        System.out.println();

        System.out.print("Insira o seu salário: ");
        this.salario = scanner.nextDouble();

        System.out.println();

        System.out.print("Insira o percentual de reajuste: ");
        this.percentual = scanner.nextDouble();

        Double reajuste = getSalario() * (getPercentual() / 100);

        Double reajustado = getSalario() + reajuste;

        DecimalFormat formatador = new DecimalFormat("00.00");

        System.out.println();

        System.out.println("Esse é novo valor do seu salário com o reajuste aplicado: R$" + formatador.format(reajustado));

        System.out.println();

        System.out.println("________________________________________________________");

        scanner.close();
    }
    
}
