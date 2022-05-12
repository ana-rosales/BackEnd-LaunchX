package Semana2.Hilos;

public class HiloS implements Runnable{
    HiloS(){
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10; ++i) {
            try {
                Thread.sleep(500L);
                System.out.println(i);
            } catch (InterruptedException var3) {
                var3.printStackTrace();
            }
        }
    }
}
