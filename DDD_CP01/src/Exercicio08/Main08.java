//8)	Escreva um programa que leia a altura e o peso de uma pessoa e calcule seu IMC. Mostre também a classificação conforme a tabela:
//
//  •	Abaixo de 18,5 → Abaixo do peso
//  •	18,5 até 24,9 → Peso normal
//  •	25 até 29,9 → Sobrepeso
//  •	30 ou mais → Obesidade
//
//  IMC=(PESO(kg))/〖ALTURA(m)〗^2

package Exercicio08;

import java.util.Scanner;

public class Main08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite sau peso: ");
        double peso = scanner.nextDouble();

        CalculadoraIMC imc = new CalculadoraIMC(altura, peso);

        System.out.println("O seu IMC significa: " + imc.calculo());
    }
}
