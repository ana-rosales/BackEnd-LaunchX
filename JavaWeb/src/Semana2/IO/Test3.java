package Semana2.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class Test3 {
    public Test3(){
    }

    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("C:\\hola.txt");
            int i = fis.read();
            //convierte ASCII a caracter y lo imprime
            System.out.println((char)i);
            fis.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
