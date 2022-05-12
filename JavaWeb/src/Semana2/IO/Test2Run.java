package Semana2.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test2Run {
    public Test2Run(){
    }

    public static void main(String[] args) {
        Runnable rm = new Runnable() {
            @Override
            public void run() {
                try{
                    FileOutputStream fos = new FileOutputStream("C:\\magiarun.txt");
                    String s = "Magia con Runnable!!!";
                    byte[] b = s.getBytes();
                    fos.write(b);
                    fos.close();
                    System.out.println("Magia con Runnable!!!");
                } catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        };
        Thread magic = new Thread(rm);
        magic.start();
    }
}
