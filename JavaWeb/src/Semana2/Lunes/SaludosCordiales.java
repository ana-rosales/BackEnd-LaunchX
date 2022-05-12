package Semana2.Lunes;

public class SaludosCordiales {
    public SaludosCordiales() {
    }

    public void show() {
        System.out.println("Hola, ¿cómo estás? Espero no del todo mal.");
    }

    public static void main(String[] args) {
        SaludosCordiales saludo1 = new SaludosCordiales();
        saludo1.show();
    }

    public void despide() {
        System.out.println("Gracias, no.");
    }
}
