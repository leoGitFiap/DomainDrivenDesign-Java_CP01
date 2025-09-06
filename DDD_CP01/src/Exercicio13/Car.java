package Exercicio13;

public class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void showInfo() {
        System.out.println("Marca: " + brand + ", Modelo: " + model + ", Ano: " + year);
    }
}
