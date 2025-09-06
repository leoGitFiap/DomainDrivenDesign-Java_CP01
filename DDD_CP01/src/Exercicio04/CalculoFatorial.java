package Exercicio04;

import java.util.Scanner;

public class CalculoFatorial {

    public static long calcularFatorial(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }

        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        long fatorial = calcularFatorial(numero);

        if (fatorial == -1) {
            System.out.println("Não é possível calcular o fatorial de um número negativo.");
        } else {
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        scanner.close();
    }
}