
package javaadvanced.Jueves;
/**
 */

public class ThreadT extends Thread{
    public void run(){
        System.out.println("Corriendo");
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        ThreadT t1 = new ThreadT(), t2 = new ThreadT(),
                t3 = new ThreadT();
        
        System.out.println("Nombre del Hilo 1: " + t1.getName());
        System.out.println("Nombre del Hilo 2: " + t2.getName());
        System.out.println("Nombre del Hilo 3: " + t3.getName());
        
        t1.start();
        t2.start();
        t3.start();
        
        t1.setName("Hilo A");
        t2.setName("Hilo B");
        t3.setName("Hilo C");
        
        System.out.println("Nombre del Hilo 1 ahora es: " + t1.getName());
        System.out.println("Nombre del Hilo 2 ahora es: " + t2.getName());
        System.out.println("Nombre del Hilo 3 ahora es: " + t3.getName());
        
        System.out.println("Hilo 1: " + t1.getId());
        System.out.println("Hilo 2: " + t2.getId());
        System.out.println("Hilo 3: " + t3.getId());
        
        System.out.println("Hilo 1: " + t1.getState());
        System.out.println("Hilo 2: " + t2.getState());
        System.out.println("Hilo 3: " + t3.getState());
        
        System.out.println("Hilo 1: " + t1.getPriority());
        System.out.println("Hilo 2: " + t2.getPriority());
        System.out.println("Hilo 3: " + t3.getPriority());
    }
}
