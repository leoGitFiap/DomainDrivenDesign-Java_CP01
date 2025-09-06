package Exercicio06;

public class CalculadoraTabuada {
    private int numero;

    public CalculadoraTabuada(int numero) {
        this.numero = numero;
    }

    public void exibir() {
        System.out.println("Tabuada do " + this.numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(this.numero + " x " + i + " = " + (this.numero * i));
        }
    }
}