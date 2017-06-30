
package javaadvanced.Jueves;

/**
LA sincronizacion en java es la capacidad de controlar
* el acceso de multiples hilos en cualquier recurso
* compartido.
* 
* La sincronizacion es la mejor opcion cuando queremos 
* permitir que solo un hilo pueda acceder a recursos 
* compartidos.
* 
* LA sincronizacion principalmente es usada para:
1.-prevenir la interferencia de hilos.
2.-prevenir problemas de consistencia

* Tipos de sincronizacion.
1.-Basada en procesos.
2.- Basada en hilos: Mutuamente Excluyente.
*   1.- MEtodo Sincronizado
*   2.- Bloqueo sincronizado
*   3.- Sincronizacion estatica
* 
* Cooperacion: COmunicacion entre hilos.
* Exclusion mutua: Ayudaa a prevenir que los hilos 
* interfieran entre si mientras comparten informacion.
* Bloqueo. La sincronizacion de basa en una entidad
* interna conocida como lock o monito. Cada objeto tiene un
* bloqueo asociado a el.
* 
* Por convención un hilo necesita un acceso consistente a los
* campos de un objeto, tiene que adquirir el bloqueo
* del objeto antes de acceder a ellos y a continuacion liberar
* el bloqueo cuando se hace con ellos.
* 
* Desde java 5, el paquete java.util.concurrent.locks. contiene
* varias implementaciones de bloqueo.
* 

 */

public class SyncF {
    
}
