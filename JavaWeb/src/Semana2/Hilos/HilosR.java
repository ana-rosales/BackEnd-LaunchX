package Semana2.Hilos;

public class HilosR implements Runnable{
    HilosR(){
    }

    @Override
    public void run() {
        System.out.println("El hilo de runnable está corriedo");
    }

    public static void main(String[] args) {
        HilosR h = new HilosR();
        Thread t = new Thread(h);
        t.start();
    }
}
