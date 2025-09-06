package Exercicio01;

import java.util.Scanner;

public class ConversorMedidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em metros: ");
        double metros = scanner.nextDouble();

        double centimetros = metros * 100;
        double milimetros = metros * 1000;

        System.out.println(metros + " metros é igual a:");
        System.out.println(centimetros + " centímetros.");
        System.out.println(milimetros + " milímetros.");

        scanner.close();
    }
}