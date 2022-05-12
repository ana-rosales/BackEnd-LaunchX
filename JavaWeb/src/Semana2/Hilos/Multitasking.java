package Semana2.Hilos;

public class Multitasking implements Runnable{
    Multitasking(){
    }

    @Override
    public void run() {
        System.out.println("Tarea Uno Runnable");
    }

    public static void main(String[] args) {
        //objetos anónimos se pasan al constructor de Thread
        Thread t1 = new Thread(new Multitasking());
        Thread t2 = new Thread(new Multitasking());
        //más objetos anónimos
        new Task1();
        new Task2();
        t1.start();
        t2.start();
    }
}
