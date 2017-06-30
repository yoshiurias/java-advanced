/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Jueves;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author CC-05
 */
public class IOTest3 {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\hola.txt");

           int i = fis.read();
            System.out.println((char)i);
            fis.close();
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}
