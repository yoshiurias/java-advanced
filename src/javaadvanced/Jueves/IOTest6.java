
package javaadvanced.Jueves;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;


public class IOTest6 {
     public static void main(String[] args) throws IOException {
     
            FileInputStream fis1 = new FileInputStream("C:\\magia.txt");
            
            BufferedInputStream bin = new BufferedInputStream(fis1);
            
            int i = 0;
            
            while((i = bin.read()) != -1){
            System.out.print((char)i);
            }
             bin.close();
             fis1.close();
        
     }
}