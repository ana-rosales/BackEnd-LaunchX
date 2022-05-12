package Semana1.Viernes;

public class Programadora extends Emp{
    int bono = 1000;

    Programadora() {
    }

    public void main() {
        Programadora fer = new Programadora();
        System.out.println("El salario de la programadora es: " + fer.salario);
        System.out.println("El bono de la programadora es: " + fer.bono);
    }

    void mensaje() {
        System.out.println("Soy programadora");
        this.main();
    }
}
