package Semana1.Miercoles;

public class PruebaBicicleta {
    public PruebaBicicleta() {
    }

    public static void main(String[] args) {
        def();
    }

    public static void def() {
        Bicicleta biciMountain = new Bicicleta();
        new Bicicleta("Blanco");
        biciMountain.setColor("Negra");
        biciMountain.setPins(6);
        biciMountain.setRodada(26);
        biciMountain.setVelocidad(13.2D);
        String msg = "Soy una bicide montaña con estas características: ";
        msg = msg + "\nColor: " + biciMountain.getColor();
        msg = msg + "\nVelocidad: " + biciMountain.getVelocidad();
        msg = msg + "\nPins: " + biciMountain.getPins();
        msg = msg + "\nRodada: " + biciMountain.getRodada();
        System.out.print(msg);
    }
}
