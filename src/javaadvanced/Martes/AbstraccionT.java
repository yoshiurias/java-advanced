
package javaadvanced.Martes;
/*
Abstraccion: Accion de separar mentalmente la representacion de las 
caracteristicas esenciales de un objeto, sin incluir antecedentes o
detalles irrelevantes.

Es el proceso natural en los seres humanos de poseer la facultad intuitiva 
de conocer la esencia de las cosas.
Existen 5 tipos de abstraccion.
Funcional, Parametrica, de Datos, Contextual y Generica

Funcional: Sirve para modelas la interaccion logica, es decir como se daran
las instrucciones de: planteamiento, entrada, procesamiento, salidas y
navegabilidad en el algoritmo.-

Datos: Permite delimitar los atributos y sus metodos que deben servir para
modelar una clase de objetos tomando en cuenta sus alcanceds, sus tipos de
datos, sus parametros y sus valores de retorno.

Contextual: Proceso mental que comienza con el analisis de un fenomeno,
amalgamando las abstracciones de datos y funcional para integrar una solucion
automatizada, que utilice de cierto, los acervos de conocimientos previos y
tome en cuenta las restricciones y los riesgos.

Parametrica: Cuando se diseñen los metodos y las operaciones de las abastracciones
de datos, funcionales y conceptuales, puede haber redundancias que es posible
evitar si se parametrizan apropiadamente y, con esto se ahorra codigo y se tiene 
una mayor legibilidad, flexibilidad y mantenibilidad en los desarrollos de
software.

Generica: Es un tipo especial de abstraccion parametrica que se usa precisamente
en las clases genericas pero en lugar de parametrizar variables se parametrizan
tipos de datos. Suobjetivo es la reutilizacion de algoritmos.

EN JAVA
Una clase declarada con la palabra reservada Abstract se considera abstracta de nombre.
Puede ser abstracta con metodos no abstractos.
La abstraccion es un proceso para ocultar los detalles de implementacion y mostrar
solo la funcionalidad al usuario.

Enviar sms solo escribe el texto y lo envia.
No conocemos el proceso interno sobre la entrega de mensajes.

La abstraccion permite concentrarse en lo que hace el objeto en lugar de como 
lo hace.

Formas de lograr la abstraccion
1.- Clase Abstracta (0 a 100%)
2.- Interface (100%)

Una clase declarada abstracta necesita ser extendida(extends) e implementar
sus metodos. No se puede instanciar.

abstract class A{}

Un metodo que es declarado como abstracto no tiene implementaciones
(Como lo hace)
abstract void print();


 */

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape{
  @Override
    void draw() {
        System.out.println("dibujando un circulo");
    }
}

public class AbstraccionT extends Circle {
    public static void main(String[] args) {
        Shape s = new AbstraccionT();
        Shape s2 = new Circle();
        s.draw();
        s2.draw();
    }

    @Override
    void draw() {
        System.out.println("dibujando...");
    }
}
