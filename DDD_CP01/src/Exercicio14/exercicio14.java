package Exercicio14;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double f = sc.nextDouble();

        double c = ((f - 32) * 5) / 9;
        System.out.println(f + "°F = " + c + "°C");

        sc.close();
    }
}
