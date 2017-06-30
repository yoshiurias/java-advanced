/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Jueves;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author CC-05
 */
public class IOTest2 {
    public static void main(String[] args) {
        try{
           FileOutputStream fos = new FileOutputStream("C:\\magia.txt"); 
           
           String s = "Magia!!!";
           byte b[] = s.getBytes();
           
           
           
           
           fos.write(b);
           fos.close();
           
            System.out.println("Magia!!!");
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
}
