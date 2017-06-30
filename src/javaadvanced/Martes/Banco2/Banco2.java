
package javaadvanced.Martes.Banco2;


public class Banco2 {
    double getTasaDeInteres(){
        return 0;
    }
}

class Bancomer extends Banco2 {
        double getTasaDeInteres(){
        return 8.4;
    }
}

class HSBC extends Banco2 {
        double getTasaDeInteres(){
        return 7.3;
    }
}

class Bancoppel extends Banco2 {
        double getTasaDeInteres(){
        return 9.7;
    }
}

class TestP{
    public static void main(String[] args) {
        Banco2 b;
        b = new Bancomer();
        System.out.println("La tasa de interes de Bancomer es: " + b.getTasaDeInteres());
        
        b = new HSBC();
        System.out.println("La tasa de interes de HSBC es: " + b.getTasaDeInteres());
        
        b = new Bancoppel();
        System.out.println("La tasa de interes de Bancoppel es: " + b.getTasaDeInteres());
    }
}

