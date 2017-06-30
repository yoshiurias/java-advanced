
package javaadvanced.Miercoles;
/*

*Hilo: Subproceso ligero, unidad pequeña de procesamiento. Es una via de
ejecución separada.
Los hilos son independientes, si se produce una excepcion en un hilo,
no afecta a los demas hijos y comparten un area de memoria comun.

Ventajas de usar hilos:
1.- No bloqueamos al usuario porque son tareas al mismo tiempo.
2.- Podemos realizar muchas tareas simultaneamente ahorrando tiempo.
3.- Los hilos al ser independientes no se afectan entre sí, en caso de
ocurrir una excepcion en un hilo los demas funcionan igual.

Multitarea: Proceso de ejecucion de muchas tareas simultaneamente.
Usamos la multitarea en el CPU. Se logra de 2 maneras:
  1.- Basada en pocesos(Multiproceso)
    *Cada proceso tiene su propia direccion  en memoria, cada proceso asigna
un area de memoria separada.
    *El proceso es pesado.
    *El costo de la comunicacion entre procesos es alto.
    *Cambiar de un proceso a otro requiere de tiempo para guardar
y cargar registros, mapas de memoria, listas de actualizacion.
  
  2.-Basada en hilos(Multihilos}
     *Los hilos comparten los mismos espacios en memoria para direcciones.
     *El hilo es ligero.
     *El costo de comunicacion entre hilos es bajo.
     
(Paralelismo)Multihilos.
(Concurrencia)Es la propiedad de los sistemas para soportar multiples 
peticiones auxiliandose de Multiprocesamiento y Multihilo logrando 
la Multitarea.

Ciclo de vida de un hilo:
   Un hilo puede encontrarse en uno de sus 5 estados.
   De acuerdo con oracle solo hay 4 en el ciclo de ejecutables
   (Running) no existe.
   new, runnable, non-runnable and terminated.

    1.- New: El hilo esta en este estado si se crea una instancia de 
    la clase Thread pero antes de la invocación de start();
    2.- Runnable: El hilo esta aqui, despues de la invocacion del
    metodo start(), pero el ThreadScheduler(Administrador de hilos)
    no lo ha seleccionado como el hilo en ejecucion
    3.- Running: El hilo esta aqui cuando el TS lo ha seleccionado.
    4.- Non Runnable: Es el estado cuando el hilo siggue activo sin 
    embargo no es apto para ejecutarse.
    5.-Terminated: Es el estado cuando el hilo ha finalziado, muerto,
    cuando sale del metodo run();

    Hay 2 formas de crear un hilo_
    1.- Al exstender de la clase Thread;
    2.-Al implementar la interface.
    
    Clase Thread
    Proporciona los constructores y metodos para crear y realizar operaciones
    en un hilo. La clase Threead extiende a la clase Object e implementa la interfaz
    runnable.

    Contructores comunes de la clase Thread
Thread();
Thread(String name)
Thread(runnable r)
Thread(runnable r, String name);

Runnable
    La interfaz Runnable debe ser implementada por cualquier clase
cuyas instancias esten destinadas a ser ejecutadas por un hilo.
    La interfaz runnable tiene un solo metodo denominado run();
    public void run: Es usado para realizar la accion de un hilo.
*/

public class HilosF extends Thread {

    @Override
    public void run() {
        System.out.println("El hilo esta corriendo");
    }

    public static void main(String[] args) {
        HilosF hilo = new HilosF();
        hilo.start();
    }
}

//Ejemplo runnable
class Hilos implements Runnable {

    @Override
    public void run() {
        System.out.println("El hilo de runnable está corriendo");
    }

    public static void main(String[] args) {
        Hilos h = new Hilos();
        Thread t = new Thread(h);
        t.start();
    }
}


/* 
Metodos Callbacks
public void run(){
/Se utiliza para realizar la accion de un hilo}

public void start() {
   //Inicia la ejecucion del hilo
   //La JVM llama al metodo run() del hilo
}

public void sleep {
    //Hace que el hilo actual en ejecucion se detenga temporalmente durante 
    //el numero especificado en milisegundos
   }

public void join() {
    //Espera a que el hilo se muera.
}

public int getP¨riority(){
    //Regresa la prioridad del hilo
 }

úblic int serPriority(){
    //Cambia la prioridad del hilo
}

public String getName() {
    //Regresa el nombre del hilo
}

public Thread CurrentThread(){
     //Devueleve la referencia al hilo en ejecucion actual
}

public int getId() {
     //Devuelve el id del hilo
}

pupblic Thread.Stata getState(){
     //regresa el estado actual del hilo
}

public boolean isAlive() {
    //prueba si el hilo esta vivo
}

public void yield(){
    //Hace que el objeto del hilo actualmenteen ejecucion
    //se detenga temporalmente y permita que otros hilos se ejecuten.
}

public void suspend() {
    //deprecado
    //para suspender el hilo
 }

public void stop() {
    //deprecado
    //se utiliza para detener el hilo
 }

public boolean isDaemon() {
    //verifica si el hilo es un demonio
}

public void setDaemon(){
    //marca el hilo como un demonio
}

public void interrupt(){
    //Interrumpe el hilo
}

public boolean interrupted(){
     //Verifica si el hilo se puede interrumpir
}

public static boolean interrupted(){
    //Prueba si el hilo actual se ha interrumpido
}
*/