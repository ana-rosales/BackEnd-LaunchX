package Semana2.Lunes;

public class Personaje extends Arma{
    public Personaje() {
    }

    public static void main(String[] args) {
        Sombra flecha = new Personaje();
        Sombra arco = new Arma();
        flecha.dibujarSombra();
        arco.dibujarSombra();
    }

    void dibujarSombra() {
        System.out.println("Dibuja una sombra blanca");
    }
}
