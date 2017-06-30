
package javaadvanced.Martes;
/*
HErencia: es un mecanismo que permite que un objeto adquiera todas las propiedades y
comportamientos de un objeto padre.

La idea de la herencia es que puedas crear nuevas clases a partir de las ya existentes.
Existen diversas clasificaciones de relación en la herencia.

Relaciones entre clases: Asosiacion, composicion, agregacion, herencia.

Hay un termino que permite distinguir los distintos tipos de elaciones, llamado acoplamiento.

--Medida de la dependencia que hay entre 2 modulos, existen grados de acoplamiento(bajo o alto);

--Cada clase y metodo hace una cosa y la hace bien(Cohesion). Numero de tareas que tiene cada
clase o metodo.

Es deseable que dos o mas modulos de un programa mantengan alta cohesion y bajo acoplamiento.

Relaciones entre clases:
Asociacion (Es un): Cuando entre 2 o mas clases se da una interaccion que no modifica en nada el com-
portamiento de los objetos antes o despues de terminada la relacion.
La asosiacion es un modo de interaccion entre objetos donde uno utiliza los servicios de otro
a corto plazo.
La asociación es una relacion de objetos debilmente acoplados.

Agregacion(Tiene un): Es una relacion entre objetos que afectan el comportamiento entre ellos mientras
que dura la relacion. Es decir un objeto depende de los servicios de otro a largo plazo.

Composicion: Cuando un objeto complejo usa otros objetos permanentemente. LA compósicion es una 
relacion entre objetos cuya esencia tiene sentido solo cuando ellos estan acoplados.
Por ultimo podemos decir que la composicion es un tipo de agregacion a muy largo plazo.

Herencia: Cuando un objeto tiene las caracteristicas de otro permanentemente tendremos una relacion
entre objetos intimimanente acoplados cuya existencia depende de un ancestro irrenunciablemente.


*/

//Relacion de Asociacion IS A
public class Empleado {
    double salario = 40000;
}

 class Programador extends Empleado{
    double bono = 1000;
    public static void main() {
        Programador p = new Programador();
        System.out.println("El salario del programador es de: " + p.salario);
         System.out.println("El bono del programador es de: " + p.bono);
    }
    void mensaje(){
        System.out.println("Soy un programador");
    }
}

//Heremcia simple Empleado a programador
//Herencia multinivel Empleado a Programado - Web
//Herencia jerarquica Empleado a programador y Empleado a Web
//Empleado a web
class Web extends Programador{
    
    public static void main(String[] args) {
        Web w = new Web();
        w.mensaje();
        main();
    }
}
