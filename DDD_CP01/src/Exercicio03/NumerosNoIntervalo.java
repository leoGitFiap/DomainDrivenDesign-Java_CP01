package Exercicio03;

import java.util.Scanner;

public class NumerosNoIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        System.out.println("Os números inteiros entre " + inicio + " e " + fim + " são:");

        for (int i = inicio + 1; i < fim; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        scanner.close();
    }
}