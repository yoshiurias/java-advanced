
package javaadvanced.Miercoles;

/**
 Una interfaz en java es un modelo de una clase.
 Tiene constantes estáticas y metodos abstractos.
 La interfaz en java es un mecanismo para lograr la abstracción, solo
 puede contener metodos abstractos que carecen de implementacion.
 Tambien permite la simulacion de herencia multiple
 Representa una relación Is-A
 No se puede instancias... como las clases abstractas.
 Porque utilizar interfaces?
    *Para lograr la abstraccion.
    * Por interface podemos similar la herencia multiple.
    * Para lograr un bajo acoplamiento.
    
    A partir e java 8, la interface contiene metodos predeterminados
    y estaticos.
  */

abstract class Hola {

    void hola() {
        System.out.println("Hola");
    }
}
interface Mostrar{
    //Que hace
    void show();   
}

public class Interfaz implements Mostrar{

    @Override
    public void show() {
        System.out.println("Hola");
    }
    
    public static void main(String[] args) {
        Interfaz i = new Interfaz();
        i.show();
    }
}
