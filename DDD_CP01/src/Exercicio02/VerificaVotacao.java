package Exercicio02;

import java.util.Scanner;

public class VerificaVotacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 16) {
            System.out.println("Você já pode votar!");
        } else {
            System.out.println("Você ainda não pode votar.");
        }

        scanner.close();
    }
}