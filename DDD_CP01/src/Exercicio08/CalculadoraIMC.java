package Exercicio08;

public class CalculadoraIMC {
    private double altura;
    private double peso;

    public CalculadoraIMC (double altura, double peso){
        this.altura = altura;
        this.peso = peso;
    }

    public String calculo() {
        double imc = peso / Math.pow(altura, 2);

        System.out.println("IMC = " + String.format("%.1f", imc));

        if (imc <= 18.5) {
            return "Abaixo do peso.";
        } else if (18.5 < imc && imc <= 24.9) {
            return "Peso Normal.";
        } else if (24.9 < imc && imc <= 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}
