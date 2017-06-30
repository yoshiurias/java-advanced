/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Jueves;

public class Multi{

    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                System.out.println("Tarea 1");
            }
        };
        
        Thread t2 = new Thread(){
            public void run(){
                System.out.println("Tarea 2");
            }
        };
        
        t1.start();
        t2.start();
    }
}    
  