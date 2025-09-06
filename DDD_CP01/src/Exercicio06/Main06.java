//6)	Crie uma função que receba um número inteiro e mostre a tabuada desse número até 10.

package Exercicio06;

import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para ver sua tabuada: ");
        int numeroEscolhido = scanner.nextInt();

        CalculadoraTabuada tabuada = new CalculadoraTabuada(numeroEscolhido);

        tabuada.exibir();

        scanner.close();
    }
}