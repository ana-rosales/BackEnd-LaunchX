package Semana2.Lunes;

abstract class Mountain {
    Mountain() {
        System.out.println("Se ha creado una bicicleta de montaña");
    }

    abstract void cambiarVelocidad();

    void cambiarColor() {
        System.out.println("Cambiando color a rojo");
    }
}
