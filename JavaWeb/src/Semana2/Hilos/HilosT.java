package Semana2.Hilos;

public class HilosT extends Thread{
    public HilosT(){
    }

    @Override
    public void run() {
        System.out.println("El hilo se está ejecutando");
    }
}
