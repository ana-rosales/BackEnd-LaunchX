package Semana2.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest {
    public IOTest(){
    }

    public static void main(String[] args) {
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                try{
                    FileOutputStream fos = new FileOutputStream("C:\\hola.txt");
                    fos.write(65); //ASCII A mayúscula
                    fos.close();
                } catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        };
        Thread writeFile = new Thread(t1);
        writeFile.start();
    }
}
