package Semana1.Viernes;

public class Polimorfismo extends Bike2{
    public Polimorfismo(){
    }

    void run() {
        System.out.println("runnung safely with 60 miles");
    }

    public static void main(String[] args) {
        Bike2 bike2 = new Polimorfismo();
        bike2.run();
    }
}
