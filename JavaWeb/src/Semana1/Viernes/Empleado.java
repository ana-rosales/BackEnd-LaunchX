package Semana1.Viernes;

public class Empleado extends Persona{
    double salario;

    Empleado(int id, String nombre, double salario) {
        super(id, nombre);
        this.salario = salario;
    }

    void display() {
        System.out.println(this.id + " " + this.nombre + " " + this.salario);
    }
}
