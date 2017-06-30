
package javaadvanced.Martes;

import javaadvanced.Martes.Banco2.Bancoppel;
import javaadvanced.Martes.Banco2.Bancomer;
import javaadvanced.Martes.Banco2.Banco;
import javaadvanced.Martes.Banco2.HSBC;


public class Banco {
    int getTasaDeInteres(){
        return 0;
    }
}

class Bancomer extends Banco {
    @Override
    int getTasaDeInteres(){
        return 8;
    }
}

class HSBC extends Banco {
    @Override
    int getTasaDeInteres(){
        return 7;
    }
}

class Bancoppel extends Banco {
    @Override
    int getTasaDeInteres(){
        return 9;          
                
    }
}

class PruebaBanco{
    public static void main(String[] args) {
        Bancomer b = new Bancomer();
        HSBC h = new HSBC();
        Bancoppel bc = new Bancoppel();
        
        System.out.println("Bancomer tasa de interés; " + b.getTasaDeInteres());
        System.out.println("HSBC tasa de interés; " + h.getTasaDeInteres());
        System.out.println("BancoppelS tasa de interés; " + bc.getTasaDeInteres());
    }
}
