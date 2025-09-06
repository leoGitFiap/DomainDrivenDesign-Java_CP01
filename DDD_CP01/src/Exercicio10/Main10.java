//  10)	Escreva um programa que leia o preço de um produto e a forma de pagamento, mostrando o valor final a pagar, conforme a tabela:
//
//  •	À vista (desconto de 10%)
//  •	Parcelado em 2x (sem juros)
//  •	Parcelado em 4x (juros de 8%)

package Exercicio10;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do produto: R$ ");
        double preco = scanner.nextDouble();

        System.out.println("\n--- FORMAS DE PAGAMENTO ---");
        System.out.println("[1] À vista (10% de desconto)");
        System.out.println("[2] Parcelado em 2x (sem juros)");
        System.out.println("[3] Parcelado em 4x (8% de juros)");
        System.out.print("Escolha uma opção: ");
        int opcaoEscolhida = scanner.nextInt();

        CalculadoraPagamento calculadora = new CalculadoraPagamento();

        String resultado = calculadora.calcularValorFinal(preco, opcaoEscolhida);

        System.out.println("\n--- RESUMO DA COMPRA ---");
        System.out.printf("Preço original: R$ %.2f\n", preco);
        System.out.println(resultado);

        scanner.close();
    }
}
