
package javaadvanced.Miercoles.Banco2;

/**

 */

public interface Bank {
   double getTasaDeInteres();
}


class HSBC implements Bank {

    public double getTasaDeInteres() {
        return 7;
    } 
}
    
class Bancoppel implements Bank {
   
    public double getTasaDeInteres() {
        
        return 9;
    } 
}
    
class Bancomer implements Bank {
    
        public double getTasaDeInteres(){
        return 8;
    }
}

class PruebaBanco{
    public static void main(String[] args) {
        Bank b;
        b = new Bancomer();
        System.out.println("La tasa de interes de Bancomer es: " + b.getTasaDeInteres());
        
        b = new HSBC();
        System.out.println("La tasa de interes de HSBC es: " + b.getTasaDeInteres());
        
        b = new Bancoppel();
        System.out.println("La tasa de interes de Bancoppel es: " + b.getTasaDeInteres());
    }
}