package br.com.atividade.nona;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class NonoCalculo extends BaseNona{

    @Override
    public void calculoExecutavel() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("-----[ Bem vindo ao Programa de Conversão de Celcius para Fahrenheit ]-----");

        System.out.println();

        System.out.print("Insira o valor em celsius no qual deseja converter para fahrenheit: ");
        this.celcius = scanner.nextDouble();

        Double conversao = ((9 * getCelcius()) + 160) / 5; 

        Format formatador = new DecimalFormat("00.00");

        System.out.println();

        System.out.print("A temperatura em Fahrenheit é = " + formatador.format(conversao) + " °F");

        System.out.println("");

        System.out.println("___________________________________________________________________________");

        scanner.close();
    }
    
}
