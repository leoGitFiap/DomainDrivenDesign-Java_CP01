//7)	Crie uma função que receba dois números e retorne o maior deles.

package Exercicio07;

import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numeroEscolhido1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numeroEscolhido2 = scanner.nextDouble();

        RetornarMaior maior = new RetornarMaior(numeroEscolhido1, numeroEscolhido2);

        System.out.println("O maior é: " + maior.exibirMaior());;

        scanner.close();
    }
}