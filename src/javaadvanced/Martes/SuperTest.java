
package javaadvanced.Martes;

/**
Super es una palabra reservada en java como una variable referencia la
* cual es usada para servirde intermediaria entre la clase padre y la subclase
* 
* Usos de super:
* 1.-Se puede utilizar para referir la variable de instancia de la clase padre inmediata.
* 
* 2.- Se puede utilizar para invocar el metodo de la clase padre inmediato.
* 3.- Se puede utilizar para invocar al constructor de la clase padre inmediata.
* 
* 
 */

class Animal {
   
    //Caso 3
    Animal(){
        System.out.println("Se ha creado el animal");
    }
    
    //Caso 2
    void eat() {
    System.out.println("Comiendo...");
    }
    
    //Caso 1
     String color = "Blanco";
}

class Perro extends Animal {
    Perro(){
        super();
        System.out.println("Se ha creado el perro");
    }
    
    //Caso 2
    void eat(){
        System.out.println("Comiendo croquetas");
    }
    
    void dormir(){
        System.out.println("El perro se durmió");
    }
    
    void llamar(){
        super.eat();
        dormir();
    }
    
    //Caso 1
    String color = "Café";
    void printColor(){
        //Imprime colo de la clase perro
        System.out.println(color);
        //Imprime colo de la clase animal
        System.out.println(super.color);
    }
}

public class SuperTest {
    public static void main(String[] args) {
       //Caso 3 Perro p = new Perro();
       
       new Perro().llamar();
       new Perro().printColor();
    }
}
