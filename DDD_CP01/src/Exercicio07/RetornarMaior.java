package Exercicio07;

public class RetornarMaior {
    private double numero1;
    private double numero2;

    public RetornarMaior(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double exibirMaior() {
        if (numero1 == numero2){
            System.out.println("Ambos são iguais.");
        } else return Math.max(numero1, numero2);
        return 0;
    }
}