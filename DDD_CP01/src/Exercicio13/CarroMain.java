package Exercicio13;

public class CarroMain {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2020);
        Car car2 = new Car("Honda", "Civic", 2022);

        car1.showInfo();
        car2.showInfo();
    }
}
