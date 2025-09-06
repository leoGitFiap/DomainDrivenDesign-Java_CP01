package Exercicio15;

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }

        sc.close();
    }
}
