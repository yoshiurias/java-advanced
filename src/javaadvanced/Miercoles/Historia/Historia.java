/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Miercoles.Historia;

class Historia {

    public static void main(String[] args) {
        Historia h = new Historia();
        h.run("Todo tranquilo en Smallvile, cuando de pronto, Se encuentran en una batalla de frente a frente");

        SuperHeroe S = new SuperHeroe();
        Thread Superman = new Thread(S);

        Villano L = new Villano();
        Thread Lex = new Thread(L);

        Superman.start();
        Lex.start();

        S.Nombre = "Clark";
        L.Nombre = "Lex";

        while (L.Vida >= 0 && S.Vida >= 0) {

            L.Vida -= S.Fuerza();
            System.out.println("Vida de " +L.Nombre + ": " + L.Vida);
            
            S.Vida -= L.Fuerza();
            System.out.println("Vida de " +S.Nombre + ": " + S.Vida);

            
            if (L.Vida <= 0) {
                System.out.println(L.Nombre + " muere");

                Lex.stop();
                break;

            } else if (S.Vida <= 0) {
                System.out.println(S.Nombre + " muere");

                Superman.stop();
                break;
            }
            if (L.Vida <= 50) {
                System.out.println(L.Nombre + " huye");
                L.Velocidad();
                        System.out.println(S.Nombre + " te alcanzo");
                S.Velocidad();
        
                while (L.Vida >= 0) {
                    L.Vida -= S.Fuerza();
                    if (L.Vida <= 0) {
                        L.Pierde();
                        System.out.println(L.Nombre + " muere");
                        
                        
                     
                        Lex.stop();
                        Superman.stop();
                        break;
                    }
                }
            }
            
        }

    }

    private void run(String intro) {
        System.out.println(intro);
    }

}
