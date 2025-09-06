package Exercicio12;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura da caixa: ");
        double altura = sc.nextDouble();

        System.out.print("Digite o comprimento da caixa: ");
        double comprimento = sc.nextDouble();

        System.out.print("Digite a largura da caixa: ");
        double largura = sc.nextDouble();

        double volume = altura * comprimento * largura;
        System.out.println("O volume da caixa é: " + volume);

        sc.close();
    }
}
