package Semana1.Viernes;

public class Gato extends Animal{
    String color = "Café";

    void printColor() {
        System.out.println("Color de la clase Gato " + this.color);
        System.out.println("Color de la clase Animal " + super.color);
    }

    void eat() {
        System.out.println("Come atún");
    }

    void dormir() {
        System.out.println("Ya se durmió el michi");
    }

    void call() {
        super.eat();
        this.dormir();
    }

    Gato() {
        System.out.println("Se ha creado un gato");
    }
}
