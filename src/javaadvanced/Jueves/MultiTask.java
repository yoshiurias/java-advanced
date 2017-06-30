
package javaadvanced.Jueves;

/**
Entendiendo el problema, muchos hilos una sola tarea;
 */
public class MultiTask extends Thread{
    
    public void run() {
                System.out.println(Thread.currentThread().getName());  
    }
    
    public static void main(String[] args) {
        MultiTask t1 = new MultiTask();
        MultiTask t2 = new MultiTask();
        MultiTask t3 = new MultiTask();
        t1.start();
        t2.start();
        t3.start();
    }
}


class M implements Runnable {

   
    @Override
    public void run() {
        System.out.println("Tarea uno");   
    }
    
    public static void main(String[] args) {
        
    
    Thread t1 = new Thread(new M());
    Thread t2 = new Thread(new M());
    
    TrueM t1m = TrueM();
    TrueMT t2m = TrueMT();
    
    t1m.start();
    t2m.start();
    
    t1.start();
    t2.start();
    }
}

class TrueM extends Thread {
    public void run(){
        System.out.println("Tarea A");
    }
}

class TrueMT extends Thread {
    public void run(){
        System.out.println("Tarea B");
    }
}




