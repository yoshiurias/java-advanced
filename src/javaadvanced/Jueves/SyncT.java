/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Jueves;

//Entender el proble de impresion endesorden
//agregando synchronized
class Tabla{
    synchronized void imprimir(int n) {
        for(int i = 0; i <= 5; i++){
            System.out.println(n*i);
        
            try{
                Thread.sleep(400);
            } catch (InterruptedException ie) {
            System.out.println(ie);
        }
        }
    }
}


class Hilo1 extends Thread {
    Tabla t;
    Hilo1(Tabla t) {
        this.t = t;
    }
    
    public void run() {
        t.imprimir(5);
    }
}

class Hilo2 extends Thread {
    Tabla t;
    Hilo2(Tabla t) {
        this.t = t;
    }
    
    public void run() {
        t.imprimir(10);
    }
}

public class SyncT 
{
    public static void main(String[] args) {
        Tabla obj = new Tabla();
        Hilo1 h1 = new Hilo1(obj);
        Hilo2 h2 = new Hilo2(obj);
        
        h1.start();
        h2.start();
    }
}
