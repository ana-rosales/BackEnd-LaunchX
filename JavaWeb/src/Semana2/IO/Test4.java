package Semana2.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class Test4 {
    public Test4(){
    }

    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("C:\\magia.txt");
            int i;
            while((i=fis.read())!=-1){
                System.out.println((char)i);
            }
            fis.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
