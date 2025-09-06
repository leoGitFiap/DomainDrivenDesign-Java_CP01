package Exercicio05;

import java.util.Scanner;

public class ContadorParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorPares = 0;
        int contadorImpares = 0;

        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "º número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }

        System.out.println("\n--- Resultado ---");
        System.out.println("Total de números pares: " + contadorPares);
        System.out.println("Total de números ímpares: " + contadorImpares);

        scanner.close();
    }
}