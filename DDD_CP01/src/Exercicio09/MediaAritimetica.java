package Exercicio09;

public class MediaAritimetica {

    private double n1;
    private double n2;
    private double n3;

    public MediaAritimetica(double n1, double n2, double n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public double calcularMedia() {
        double m = (n1 + n2 + n3) / 3;

        return m;
    }
}
