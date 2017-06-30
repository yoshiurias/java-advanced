
package javaadvanced.Jueves;
/**

 */

public class ThreadP extends Thread{
    
    public void run(){
        System.out.println("Corriendo");
        System.out.println("Hilo Corriendo: " + Thread.currentThread().getName());
        System.out.println("Prioridad del hilo: " + Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        ThreadP t1 = new ThreadP(), t2 = new ThreadP(),
                t3 = new ThreadP();
 
        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(NORM_PRIORITY);
        t3.setPriority(MAX_PRIORITY);
        
        t1.start();
        t2.start();
        t3.start();
    }
}
