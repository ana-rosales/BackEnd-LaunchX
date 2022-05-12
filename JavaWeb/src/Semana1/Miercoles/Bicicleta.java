package Semana1.Miercoles;

public class Bicicleta {
    public int pins;
    public int rodada;
    public double velocidad;
    public String color;

    Bicicleta() {
    }

    public Bicicleta(String color) {
        this.color = color;
    }

    public double getVelocidad() {
        return this.velocidad;
    }

    public int getPins() {
        return this.pins;
    }

    public int getRodada() {
        return this.rodada;
    }

    public String getColor() {
        return this.color;
    }

    public boolean setPins(int pins) {
        if (pins > 0) {
            this.pins = pins;
            return true;
        } else {
            return false;
        }
    }

    public boolean setRodada(int rodada) {
        if (rodada > 0) {
            this.rodada = rodada;
            return true;
        } else {
            return false;
        }
    }

    public boolean setVelocidad(double velocidad) {
        if (velocidad >= 0.0D) {
            this.velocidad = velocidad;
            return true;
        } else {
            return false;
        }
    }

    public boolean setColor(String color) {
        if (!color.isEmpty()) {
            this.color = color;
            return true;
        } else {
            return false;
        }
    }

    public String printState() {
        return "pins: " + this.pins + "\nrodada: " + this.rodada + "\nvelocidad: " + this.velocidad + "\ncolor" + this.color;
    }
}
