
package javaadvanced.Martes;

class Animal2{
    void eat() {
        System.out.println("Comiendo...");
    }
}

class Dog extends Animal {
    void eat() {
         System.out.println("Comiendo croquetas");
    }
}

class Cachorro extends Animal {
    void eat() {
         System.out.println("Tomando leche");
    }
}

public class PolimorfismoT {
    public static void main(String[] args) {
        Animal a;
        a = new Animal();
        a.eat();
        a = new Dog();
        a.eat();
        a = new Cachorro();
        a.eat();
    }
}
