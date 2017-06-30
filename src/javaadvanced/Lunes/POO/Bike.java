/*
Clase: Conjunto d objetos con caracteristicas similares que se identifican por nombre, atributos 
y una serie de funciones o métodos aplicables a todo el conjunto.
Es una plantilla para caracterizar o definir objetos.

Abstracción: Es la facultad intuitiva que permite conocer la esencia de las cosas.

Modularidad: Es un proceso mental que permite distinguir los componentes de los objetos
que estan siendo estudiados.

Encapsulamiento:Permite ocultar las caracteristicas no relevantes de una clase, destacar las relevantes y
modelar el comportamiento. Dando como resultado la Abstraccion de Datos.

Herencia: Relación entre clases cuya existencia depende de un ancestro, clase base delega 
sus atributos y métodos a las clases derivadas.

Polimorfismo: Es el conjunto de operaciones aplicables a un objeto por medio de los mensajes que invocan 
a alguno de los metodos definivod en la clase a la que pertenece el objeto de acuerdo
al dominio de la aplicacion(Contexto).

Objeto: Es una entidad real o imaginaria que tiene identidad, estado y un comportamiento,
conforme al conjunto de objetos (clase) a la que pertenece. Es una instancia de una clase.
Un objeto mujer es una instancia de una mujer con clase.
Mujer mujer = new Mujer();

Una clase en java contiene lo siguiente:
   
   campos 
   metodos 
   constructores
   bloques
   clases anidades e interfaces

class <class_name> {
   field;
   method;
}
Variables de instancia:
Mujer mujer = new Mujer();

 */
package javaadvanced.Lunes.POO;

/**
 *
 * @author CC-05
 */
public class Bike {
        public static void main(String[] args) {
        Bike bici = new Bike();
        
        bici.show();    
    }
         public void show(){
   MountainBike bici = new MountainBike();
    bici.setColor("Azul");
    bici.setVelocidad(5);
   String msg = "Soy una bici de montaña ";
   msg += " Y mi color es : " + bici.getColor();
   msg += " y tengo : " + bici.getVelocidad();
   msg += " velocidades";
   
   System.out.println(msg);
   }
}

class MountainBike{
    private int velocidad;
    private String color;
    
    protected int getVelocidad() {
        return velocidad;
    }

    protected boolean setVelocidad(int velocidad) {
        if(velocidad > 0) {
        this.velocidad = velocidad;
        return true;
        } else {
        return false;
        }
    }

    protected String getColor() {
        return color;
    }
    
    protected void setColor(String color) {
        this.color = color;
    }
}