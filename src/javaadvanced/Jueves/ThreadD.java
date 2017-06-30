/*
Un hilo demonio en Java es un hilo poveedor de servicios que proporciona servicios
al hilo de usuario. Su vida depende de los demas hilos, es decir si todos
los demas hilos se mueren la JVM lo termina automaticamente.

Hay muchos hilos demonios en java que se ejecutan automaticamente
Garbage Collector, finalizer, etc.

JConsole en el simbolo del sistema proporciona la informacion sobre
las clases cargadas, uso de memoria }, ejecucion de hilos, etc.

Puntos importantes.

Un hilo en java proporciona servicios a los hilos apra brindar soportes a 
tareass en un segundo plano

Su vida depende de los hilos de usuario.
Es un hilo de baja prioridad.
Java.lang.Thread provee dos metodos para un demonio.

1.- public setDaemon(boolean status) es usado paa marcar el hilo
actual, como un hilo demonio.
2.- public boolean isDemon() revisa si el hilo actual es un demonio.
 */
package javaadvanced.Jueves;

/**
 *
 * @author CC-05
 */
public class ThreadD extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon())
            System.out.println("Tenemos un demonio aquí ");
        else {
            System.out.println("Es un hilo de usuario ");
        }
    }
    
    public static void main(String[] args) {
        ThreadD t1 = new ThreadD(), t2 = new ThreadD(),
                t3 = new ThreadD();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
        
    }
    
}
