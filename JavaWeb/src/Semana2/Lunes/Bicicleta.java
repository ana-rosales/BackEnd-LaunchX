package Semana2.Lunes;

public class Bicicleta {
    public Bicicleta() {
    }

    void cambiarVelocidad() {
        System.out.println("Gira la perilla");
    }

    public static void main(String[] args) {
        Mountain bici1 = new Magistroni();
        Bicicleta bici2 = new Bicicleta();
        bici2.cambiarVelocidad();
        bici1.cambiarVelocidad();
        bici1.cambiarColor();
    }
}
