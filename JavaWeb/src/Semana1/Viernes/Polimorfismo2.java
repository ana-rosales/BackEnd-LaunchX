package Semana1.Viernes;

public class Polimorfismo2 {
    public Polimorfismo2() {
    }

    public static void main(String[] args) {
        Animal dander = new Animal();
        dander.eat();
        Animal danter = new Dog();
        danter.eat();
        Animal danger = new Cachorro();
        danger.eat();
    }
}
