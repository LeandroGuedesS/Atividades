package br.com.atividade.primeira;

import java.util.Scanner;

public class PrimeiroCalculo extends BasePrimeira {

    @Override
    public void calculoExecutavel() {
                Scanner scanner = new Scanner(System.in);
        
        System.out.println("-----[ Bem vindo ao Programa de Soma ]-----");

        System.out.println();

        System.out.print("Insira um valor qualquer: ");
        this.valor1 = scanner.nextInt();
        
        System.out.println();

        System.out.print("Insira um segundo valor qualquer: ");
        this.valor2 = scanner.nextInt();

        double resultado = getValor1() + getValor2();

        System.out.println();

        System.out.println("A soma dos valores é = " + resultado);

        System.out.println();

        System.out.println("___________________________________________");
        
        scanner.close();
    }
    
}
