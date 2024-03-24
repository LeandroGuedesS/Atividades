package br.com.atividade.quinta;

import java.util.Scanner;

public class QuintoCalculo extends BaseQuinta{

    @Override
    public void calculoExecutavel() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("-----[ Bem vindo ao Programa de Dados Pessoais ]-----");

        System.out.println();

        System.out.print("Insira o nome do cliente: ");
        this.nome = scanner.nextLine();

        System.out.println();

        System.out.print("Insira o endereço do cliente: ");
        this.endereco = scanner.nextLine();

        System.out.println();

        System.out.print("Insira o telefone do cliente: ");
        this.telefone = scanner.nextLine();

        System.out.println();

        System.out.println("Esses são os dados do cliente: ");

        System.out.println("_____________________________________________________");

        System.out.println();

        System.out.println("Nome: " + getNome());

        System.out.println("Endereço: " + getEndereco());

        System.out.println("Telefone: " + getTelefone());

        System.out.println("_____________________________________________________");

        scanner.close();
    }
    
}
