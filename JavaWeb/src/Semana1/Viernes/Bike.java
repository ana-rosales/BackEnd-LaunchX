package Semana1.Viernes;

public class Bike {
    private int velocidad;
    private String color;
    private String marca;

    public Bike() {
    }

    public Bike(String color) {
        this.color = color;
    }

    public Bike(String color, int velocidad) {
        this.velocidad = velocidad;
        this.color = color;
    }

    public Bike(String color, String marca, int velocidad) {
        this.velocidad = velocidad;
        this.marca = marca;
        this.color = color;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public String getColor() {
        return this.color;
    }

    public String getMarca() {
        return this.marca;
    }
}
