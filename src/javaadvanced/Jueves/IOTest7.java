
package javaadvanced.Jueves;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;


public class IOTest7 {
    public static void main(String[] args) throws IOException {
     
            FileInputStream fis1 = new FileInputStream("C:\\magic.txt");
            FileInputStream fis2 = new FileInputStream("C:\\magia.txt");
            
            SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
            int i = 0;
            
            while((i = sis.read()) != -1){
            System.out.print((char)i);
            }
            
             sis.close();
             fis1.close();
    }
}
