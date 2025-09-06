package Exercicio11;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeMaisVelho = "";
        int idadeMaisVelha = -1;

        {
            System.out.print("Digite o nome da pessoa " + 1 + ": ");
            String nome = sc.nextLine();

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = sc.nextInt();
            sc.nextLine();

            if (idade > idadeMaisVelha) {
                idadeMaisVelha = idade;
                nomeMaisVelho = nome;
            }


        }
        {
            System.out.print("Digite o nome da pessoa " + 2 + ": ");
            String nome = sc.nextLine();

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = sc.nextInt();
            sc.nextLine();

            if (idade > idadeMaisVelha) {
                idadeMaisVelha = idade;
                nomeMaisVelho = nome;
            }


        }
        {
            System.out.print("Digite o nome da pessoa " + 3 + ": ");
            String nome = sc.nextLine();

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = sc.nextInt();
            sc.nextLine();

            if (idade > idadeMaisVelha) {
                idadeMaisVelha = idade;
                nomeMaisVelho = nome;
            }


        }

        System.out.println("A pessoa mais velha é: " + nomeMaisVelho + " (" + idadeMaisVelha + " anos)");
        sc.close();
    }
}
