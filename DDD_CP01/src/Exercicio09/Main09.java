//9)	Crie uma função que receba três números e retorne a média aritmética.

package Exercicio09;

import java.util.Scanner;

public class Main09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        double n2 = scanner.nextDouble();
        System.out.println("Digite o terceiro número: ");
        double n3 = scanner.nextDouble();

        MediaAritimetica media = new MediaAritimetica(n1, n2, n3);

        System.out.println("O valor da média é = " + media.calcularMedia());
    }
}
