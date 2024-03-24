package br.com.atividade.decima;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class DecimoCalculo extends BaseDecima{

    @Override
    public void calculoExecutavel() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("-----[ Bem vindo ao Programa da Distância Percorrida ]-----");

        System.out.println();

        System.out.print("Insira o tempo decorrido na viagem: ");
        this.tempoDecorrido = scanner.nextDouble();

        System.out.println();

        System.out.print("Insira a velocidade média percorrida: ");
        this.velocidadeMedia = scanner.nextDouble();

        System.out.println();

        Double distancia = getTempoDecorrido() * getVelocidadeMedia();

        Format formatador = new DecimalFormat("00.00");

        System.out.println("A distância percorrida foi de: " + formatador.format(distancia) + " Km");

        System.out.println();

        Double litros = distancia / 12;

        System.out.println("A quantidade litros consumidos na viagem foi de: " + formatador.format(litros) + " litros");

        scanner.close();
    }
    
}

